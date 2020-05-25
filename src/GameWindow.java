import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 * Created by Armin on 6/25/2016.
 */
public class GameWindow extends JFrame {

    enum PlantType {
        None,
        Sunflower,
        Peashooter,
        FreezePeashooter,
        Torchwood,
        TwicePeashooter,
        ThreePeashooter,
        Chomper,
        Wallnut,
        GatlingPea,
        PotatoMine,
        CherryBomb,
        Sholve
    }

    
    public PlantCard Sunflower,Peashooter,FreezePeashooter,Torchwood,
        TwicePeashooter,ThreePeashooter,Chomper,Wallnut,GatlingPea,PotatoMine,CherryBomb,Sholve;

    //PlantType activePlantingBrush = PlantType.None;
    private void initComponents() {
        jPanel1 = new JPanel();

        setPreferredSize(new Dimension(1012, 785));
        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 40, Short.MAX_VALUE));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 168, Short.MAX_VALUE));


        GroupLayout layout = new GroupLayout(getLayeredPane());
        getLayeredPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(800, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(500, Short.MAX_VALUE))
        );
    }

    public SeedChoose aSeedChoose;

    public GameWindow(String[] name) {
        setSize(1012, 785);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        initComponents();

        JLabel sun = new JLabel("SUN");
        sun.setLocation(37, 80);
        sun.setSize(60, 20);

        GamePanel gp = new GamePanel(this, sun);
        gp.setLocation(0, 0);
        getLayeredPane().add(gp, new Integer(0));


        for (int i = 0; i < 9; ++i) {
            if (name[i] == "sunflower") {
                sunflower = new PlantCard("images/cards/card_sunflower.png");
                sunflower.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {

                    gp.setActivePlantingBrush(PlantType.Sunflower);
                });
                getLayeredPane().add(Sunflower, new Integer(3));
            }

            if (name[i] == "peashooter") {
                peashooter = new PlantCard("images/cards/card_peashooter.png");
                peashooter.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {

                    gp.setActivePlantingBrush(PlantType.Peashooter);
                });
                getLayeredPane().add(Peashooter, new Integer(3));
            }

            if (name[i] == "freezepeashooter") {
                freezepeashooter = new PlantCard("images/cards/card_freezepeashooter.png");
                freezepeashooter.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {

                    gp.setActivePlantingBrush(PlantType.FreezePeashooter);
                });
                getLayeredPane().add(FreezePeashooter, new Integer(3));
            }
            if (name[i] == "twicepeashooter") {
                TwicePeashooter = new PlantCard("images/cards/card_twicepeashooter.png");
                TwicePeashooter.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.TwicePeashooter);
                });
                getLayeredPane().add(TwicePeashooter, new Integer(3));
            }
            if (name[i] == "threepeashooter") {
                ThreePeashooter = new PlantCard("images/cards/card_threepeashooter.png");
                ThreePeashooter.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.ThreePeashooter);
                });
                getLayeredPane().add(ThreePeashooter, new Integer(3));
            }
            if (name[i] == "torchwood") {
                Torchwood = new PlantCard("images/cards/card_torchwood.png");
                Torchwood.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.Torchwood);
                });
                getLayeredPane().add(Torchwood, new Integer(3));
            }
            if (name[i] == "wallnut") {
                Wallnut = new PlantCard("images/cards/card_wallnut.png");
                Wallnut.setAction(110 + 65 * i, 8, 30000, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.Wallnut);
                });
                getLayeredPane().add(Wallnut, new Integer(3));
            }
            if (name[i] == "chomper") {
                Chomper = new PlantCard("images/cards/card_chomper.png");
                Chomper.setAction(110 + 65 * i, 8, 7500, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.Chomper);
                });
                getLayeredPane().add(Chomper, new Integer(3));
            }
            if (name[i] == "potatomine") {
                PotatoMine = new PlantCard("images/cards/card_potatomine.png");
                PotatoMine.setAction(110 + 65 * i, 8, 30000, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.PotatoMine);
                });
                getLayeredPane().add(PotatoMine, new Integer(3));
            }
            if (name[i] == "gatling") {
                GatlingPea = new PlantCard("images/cards/card_gatling.png");
                GatlingPea.setAction(110 + 65 * i, 8, 50000, (ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.GatlingPea);
                });
                getLayeredPane().add(GatlingPea, new Integer(3));
            }

            if(name[i]=="cherrybomb"){
                CherryBomb = new PlantCard("images/cards/card_cherrybomb.png");
                CherryBomb.setAction(110+65*i, 8,30000,(ActionEvent e) -> {
                    gp.setActivePlantingBrush(PlantType.CherryBomb);
                });
                getLayeredPane().add(CherryBomb, new Integer(3));
            }
        }

        Sholve = new PlantCard("images/cards/ShovelBack.png");
        Sholve.setSize(100, 50);
        Sholve.setAction(760, 0, 0, (ActionEvent e) -> {
            gp.setActivePlantingBrush(PlantType.Sholve);
        });
        getLayeredPane().add(Sholve, new Integer(3));

        getLayeredPane().add(sun, new Integer(2));
        setResizable(false);
        setVisible(true);
    }

    public GameWindow(int ii) {
        setSize(1400, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        aSeedChoose = new SeedChoose();
        getLayeredPane().add(aSeedChoose, new Integer(0));
    }

    public GameWindow(boolean b) {
        Menu menu = new Menu();
        menu.setLocation(0, 0);
        setSize(1012, 785);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getLayeredPane().add(menu, new Integer(0));
        menu.repaint();
        setResizable(false);
        setVisible(true);
    }

    static GameWindow gw;
    private JPanel jPanel1;
    static GameWindow gw1;

    public static void begin() {
        gw.dispose();
        gw = new GameWindow(1);
    }

    private void jPanel1MouseClicked(MouseEvent evt) {
        //open menu
        gw.dispose();
        gw = new GameWindow(1);//needed to provide a menu game_window
        System.out.println("Exit");
    }

    private void jPanel1MouseEntered(MouseEvent evt) {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jPanel1MouseExited(MouseEvent evt) {
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    public static void begingame() {
        gw.dispose();
        gw = new GameWindow(gw.aSeedChoose.getplace());
    }

    public static void main(String[] args) {
        gw = new GameWindow(true);
    }
}
