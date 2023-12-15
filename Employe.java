/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sharo
 */
public class Employe extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employe
     */
    public Employe() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EMPTB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ENAME = new javax.swing.JTextField();
        DEPID = new javax.swing.JTextField();
        DESID = new javax.swing.JTextField();
        EPFNUM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EPID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EMLSEV = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1))
        );

        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EMPTB.setBackground(new java.awt.Color(204, 255, 204));
        EMPTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Name", "DepartmentID", "DesignationID", "EPFNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EMPTB);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 290));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 90, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 90, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("Delete ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        ENAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENAMEActionPerformed(evt);
            }
        });
        jPanel2.add(ENAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, -1));
        jPanel2.add(DEPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 100, -1));
        jPanel2.add(DESID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 100, -1));
        jPanel2.add(EPFNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("DepartmentID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("DesignationID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("EPFNumber");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));
        jPanel2.add(EPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("EmployeeID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        EMLSEV.setBackground(new java.awt.Color(204, 204, 204));
        EMLSEV.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EMLSEV.setText("save");
        EMLSEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMLSEVActionPerformed(evt);
            }
        });
        jPanel2.add(EMLSEV, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sharo\\OneDrive\\Desktop\\Semester 2 assingment\\java\\OopAssignments\\img\\OIP 3.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENAMEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) EMPTB.getModel();

if (!EPID.getText().trim().equals("")) {
    model.addRow(new Object[]{EPID.getText(), ENAME.getText(), DEPID.getText(), DESID.getText(), EPFNUM.getText()});
} else {
    
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) EMPTB.getModel();
int selectedRowIndex = EMPTB.getSelectedRow();

if (selectedRowIndex != -1) { 
    model.removeRow(selectedRowIndex);
   
    EPID.setText("");
    ENAME.setText("");
    DEPID.setText("");
    DESID.setText("");
    EPFNUM.setText("");
} else {

}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) EMPTB.getModel();
int selectedRowIndex = EMPTB.getSelectedRow();

if (selectedRowIndex != -1) { 
    String updatedEPID = EPID.getText().trim();
    String updatedENAME = ENAME.getText().trim();
    String updatedDEPID = DEPID.getText().trim();
    String updatedDESID = DESID.getText().trim();
    String updatedEPFNUM = EPFNUM.getText().trim();

    if (!updatedEPID.equals("") && !updatedENAME.equals("") && !updatedDEPID.equals("")
            && !updatedDESID.equals("") && !updatedEPFNUM.equals("")) {
        model.setValueAt(updatedEPID, selectedRowIndex, 0);
        model.setValueAt(updatedENAME, selectedRowIndex, 1);
        model.setValueAt(updatedDEPID, selectedRowIndex, 2);
        model.setValueAt(updatedDESID, selectedRowIndex, 3);
        model.setValueAt(updatedEPFNUM, selectedRowIndex, 4);
    } else {
        
    }
} else {
    
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void EMLSEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMLSEVActionPerformed
           DefaultTableModel model = (DefaultTableModel) EMPTB.getModel();

    StringBuilder tableContent = new StringBuilder();
    for (int i = 0; i < model.getRowCount(); i++) {
        for (int j = 0; j < model.getColumnCount(); j++) {
            tableContent.append(model.getValueAt(i, j)).append("\t");
        }
        tableContent.append("\n");
    }

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save Data to Text File");
    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
            writer.write(tableContent.toString());
            writer.flush();
            JOptionPane.showMessageDialog(null, "Data saved successfully!");
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Error saving data: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_EMLSEVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DEPID;
    private javax.swing.JTextField DESID;
    private javax.swing.JButton EMLSEV;
    private javax.swing.JTable EMPTB;
    private javax.swing.JTextField ENAME;
    private javax.swing.JTextField EPFNUM;
    private javax.swing.JTextField EPID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}