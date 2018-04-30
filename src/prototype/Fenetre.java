package prototype;

import javax.swing.JFrame;

import java.awt.Color;

public class Fenetre extends JFrame {
    
    public Fenetre() {
        
        this.setTitle("Environnement Scolaire");
        this.setSize(640,960);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        
        Panneau panel = new Panneau();
        this.setContentPane(panel);
        
        this.setVisible(true);
    }
}
