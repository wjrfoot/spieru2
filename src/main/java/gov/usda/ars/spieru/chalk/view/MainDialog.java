/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gov.usda.ars.spieru.chalk.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author wjrfo
 */
public class MainDialog extends javax.swing.JDialog {
    
    final ImageIcon backgroundIcon;

    /**
     * Creates new form MainDialog
     */
    public MainDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
//        URL imageURL = getClass().getClassLoader().getResource("background.png");
        URL imageURL = getClass().getClassLoader().getResource("wheat.jpg");
        backgroundIcon = new ImageIcon(imageURL);
        initComponents();
        jPanel1.setSize(backgroundIcon.getIconWidth(), backgroundIcon.getIconHeight() + 20);
        this.setSize(backgroundIcon.getIconWidth(), backgroundIcon.getIconHeight() + 20);
        this.setTitle("Chalk Analyzer");
        imageURL = getClass().getClassLoader().getResource("USDA-Logo.png");
        ImageIcon icon = new ImageIcon(imageURL);
        this.setIconImage(icon.getImage());
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            Image img = backgroundIcon.getImage();

            // instance initializer
            {setOpaque(false);}
            public void paintComponent(Graphics graphics)
            {
                graphics.drawImage(img, 0, 0, this);
                super.paintComponent(graphics);
            }
        }

        ;
        jBLoadAnalyze = new javax.swing.JButton();
        jBScanAnalyze = new javax.swing.JButton();
        jBConfigure = new javax.swing.JButton();
        jBAbout = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBLoadAnalyze.setText("Load/Analyze");
        jBLoadAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoadAnalyzeActionPerformed(evt);
            }
        });

        jBScanAnalyze.setText("Scan/Analyze");
        jBScanAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBScanAnalyzeActionPerformed(evt);
            }
        });

        jBConfigure.setText("Configure");
        jBConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigureActionPerformed(evt);
            }
        });

        jBAbout.setText("About");
        jBAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAboutActionPerformed(evt);
            }
        });

        jBExit.setText("Exit");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExit)
                    .addComponent(jBAbout)
                    .addComponent(jBConfigure)
                    .addComponent(jBScanAnalyze)
                    .addComponent(jBLoadAnalyze))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jBLoadAnalyze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBScanAnalyze)
                .addGap(12, 12, 12)
                .addComponent(jBConfigure)
                .addGap(13, 13, 13)
                .addComponent(jBAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoadAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoadAnalyzeActionPerformed
        // TODO add your handling code here:
        System.out.println("load analyze");
    }//GEN-LAST:event_jBLoadAnalyzeActionPerformed

    private void jBScanAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBScanAnalyzeActionPerformed
        // TODO add your handling code here:
        System.out.println("scan analyze");
    }//GEN-LAST:event_jBScanAnalyzeActionPerformed

    private void jBConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigureActionPerformed
        // TODO add your handling code here:
        System.out.println("configure");
    }//GEN-LAST:event_jBConfigureActionPerformed

    private void jBAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAboutActionPerformed
        // TODO add your handling code here:
        System.out.println("about");
    }//GEN-LAST:event_jBAboutActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbout;
    private javax.swing.JButton jBConfigure;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBLoadAnalyze;
    private javax.swing.JButton jBScanAnalyze;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
