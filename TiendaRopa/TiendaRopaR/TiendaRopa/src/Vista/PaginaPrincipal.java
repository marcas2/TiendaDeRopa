/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author maria
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        panel7 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panel6 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panel1.setBackground(new java.awt.Color(249, 240, 227));
        panel1.setLayout(new java.awt.BorderLayout());

        panel2.setBackground(new java.awt.Color(249, 240, 227));
        panel2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Logo.png"))); // NOI18N
        panel2.add(jLabel4);

        panel3.setBackground(new java.awt.Color(163, 144, 129));
        panel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setBackground(new java.awt.Color(41, 37, 34));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ColeccionOtoño2.png"))); // NOI18N
        panel3.add(jLabel6);

        panel2.add(panel3);

        panel4.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONOCE NUESTRAS SECCIONES");
        panel4.add(jLabel10, java.awt.BorderLayout.NORTH);

        panel7.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(163, 144, 129));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Mujer.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel7.add(jButton1);

        jButton2.setBackground(new java.awt.Color(163, 144, 129));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/HOMBRES2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel7.add(jButton2);

        jButton3.setBackground(new java.awt.Color(163, 144, 129));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/BOLSOS1.png"))); // NOI18N
        panel7.add(jButton3);

        panel4.add(panel7, java.awt.BorderLayout.CENTER);

        panel2.add(panel4);

        panel5.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setBackground(new java.awt.Color(163, 144, 129));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Tienda4.png"))); // NOI18N
        panel5.add(jButton4);

        jButton5.setBackground(new java.awt.Color(163, 144, 129));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Novedades.png"))); // NOI18N
        panel5.add(jButton5);

        panel2.add(panel5);

        panel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contactanos: contacto@miumiu.co");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel6.add(jLabel2);

        panel2.add(panel6);

        panel1.add(panel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel1);

        jMenuBar1.setBackground(new java.awt.Color(163, 144, 129));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Mujer");

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Hombre");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bolsos");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    // End of variables declaration//GEN-END:variables
}
