package registrosocial;
import java.awt.Color;
/**
 * 
 *@author Rivero Rodriguez Tabatha Valeria
 * 10/01/24
 * sayo melocojon.
 */
public class JFrame_registroSocial extends javax.swing.JFrame {
        //Declarar variables para el arrastrado de ventana.
    int xMouse, yMouse;
    String sexo, estado, clave;
    int verificador;
    public JFrame_registroSocial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lbl_ApellidoP = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txt_Nombre1 = new javax.swing.JTextField();
        txt_ApellidoP = new javax.swing.JTextField();
        ckb_hombre = new javax.swing.JCheckBox();
        cb_mujer = new javax.swing.JCheckBox();
        cmb_estado = new javax.swing.JComboBox<>();
        lbl_ApellidoM = new javax.swing.JLabel();
        txt_ApellidoM = new javax.swing.JTextField();
        txt_fechaD = new javax.swing.JTextField();
        txt_fechaMM = new javax.swing.JTextField();
        txt_fechaAAAA = new javax.swing.JTextField();
        txt_RFC = new javax.swing.JTextField();
        txt_CURP = new javax.swing.JTextField();
        lblEstado1 = new javax.swing.JLabel();
        lblEstado2 = new javax.swing.JLabel();
        btn_Listo = new javax.swing.JButton();
        pnl_Drag = new javax.swing.JPanel();
        btn_Salir = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(30, 29, 37));
        jPanel2.setForeground(new java.awt.Color(30, 29, 37));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(97, 94, 120));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 204, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        lblNombre.setToolTipText("");

        lbl_ApellidoP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ApellidoP.setForeground(new java.awt.Color(204, 204, 255));
        lbl_ApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ApellidoP.setText("Apellido paterno");
        lbl_ApellidoP.setToolTipText("");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(204, 204, 255));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado");
        lblEstado.setToolTipText("");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(204, 204, 255));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("Sexo");
        lblSexo.setToolTipText("");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 204, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha natalidad");
        lblFecha.setToolTipText("");

        txt_Nombre1.setBackground(new java.awt.Color(36, 31, 41));
        txt_Nombre1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre1.setOpaque(true);

        txt_ApellidoP.setBackground(new java.awt.Color(36, 31, 41));
        txt_ApellidoP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_ApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        txt_ApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ApellidoP.setOpaque(true);

        ckb_hombre.setBackground(new java.awt.Color(24, 25, 33));
        ckb_hombre.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        ckb_hombre.setForeground(new java.awt.Color(255, 255, 255));
        ckb_hombre.setText("Hombre");

        cb_mujer.setBackground(new java.awt.Color(24, 25, 33));
        cb_mujer.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        cb_mujer.setForeground(new java.awt.Color(255, 255, 255));
        cb_mujer.setText("Mujer");

        cmb_estado.setBackground(new java.awt.Color(24, 25, 33));
        cmb_estado.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        cmb_estado.setForeground(new java.awt.Color(255, 255, 255));
        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado de México", "CDMX", "Hidalgo", "Chiapas" }));
        cmb_estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_estado.setOpaque(true);

        lbl_ApellidoM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ApellidoM.setForeground(new java.awt.Color(204, 204, 255));
        lbl_ApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ApellidoM.setText("Apellido materno");
        lbl_ApellidoM.setToolTipText("");

        txt_ApellidoM.setBackground(new java.awt.Color(36, 31, 41));
        txt_ApellidoM.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_ApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        txt_ApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ApellidoM.setOpaque(true);

        txt_fechaD.setBackground(new java.awt.Color(36, 31, 41));
        txt_fechaD.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_fechaD.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechaD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechaD.setOpaque(true);

        txt_fechaMM.setBackground(new java.awt.Color(36, 31, 41));
        txt_fechaMM.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_fechaMM.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechaMM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechaMM.setOpaque(true);

        txt_fechaAAAA.setBackground(new java.awt.Color(36, 31, 41));
        txt_fechaAAAA.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        txt_fechaAAAA.setForeground(new java.awt.Color(255, 255, 255));
        txt_fechaAAAA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fechaAAAA.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblNombre)
                        .addGap(13, 13, 13)
                        .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_ApellidoP)
                                        .addComponent(lblEstado)
                                        .addComponent(lbl_ApellidoM))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(lblSexo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(ckb_hombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_mujer))
                                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txt_ApellidoM)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txt_fechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fechaMM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fechaAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ApellidoP)
                    .addComponent(txt_ApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ApellidoM)
                    .addComponent(txt_ApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_hombre)
                    .addComponent(cb_mujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechaMM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechaAAAA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 210));

        txt_RFC.setBackground(new java.awt.Color(255, 255, 255));
        txt_RFC.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        txt_RFC.setForeground(new java.awt.Color(33, 34, 41));
        txt_RFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RFC.setText("RFC");
        txt_RFC.setBorder(null);
        txt_RFC.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_RFC.setEnabled(false);
        jPanel2.add(txt_RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 260, -1));

        txt_CURP.setBackground(new java.awt.Color(255, 255, 255));
        txt_CURP.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        txt_CURP.setForeground(new java.awt.Color(33, 34, 41));
        txt_CURP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CURP.setText("CURP");
        txt_CURP.setBorder(null);
        txt_CURP.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_CURP.setEnabled(false);
        jPanel2.add(txt_CURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 260, -1));

        lblEstado1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(204, 204, 255));
        lblEstado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado1.setText("Registro Federal de Contribuyentes");
        lblEstado1.setToolTipText("");
        jPanel2.add(lblEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        lblEstado2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado2.setForeground(new java.awt.Color(204, 204, 255));
        lblEstado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado2.setText("Clave Única de Registro de Población");
        lblEstado2.setToolTipText("");
        jPanel2.add(lblEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        btn_Listo.setBackground(new java.awt.Color(93, 154, 97));
        btn_Listo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_Listo.setForeground(new java.awt.Color(255, 255, 255));
        btn_Listo.setText("Listo");
        btn_Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 47));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 630, 240));

        pnl_Drag.setBackground(new java.awt.Color(49, 49, 72));
        pnl_Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_DragMouseDragged(evt);
            }
        });
        pnl_Drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_DragMousePressed(evt);
            }
        });

        btn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir.setText("X");
        btn_Salir.setBorder(null);
        btn_Salir.setBorderPainted(false);
        btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalirMouseExited(evt);
            }
        });
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(204, 204, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("RENAPO - Registro Nacional de Población");
        lbl_titulo.setToolTipText("");

        javax.swing.GroupLayout pnl_DragLayout = new javax.swing.GroupLayout(pnl_Drag);
        pnl_Drag.setLayout(pnl_DragLayout);
        pnl_DragLayout.setHorizontalGroup(
            pnl_DragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DragLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_DragLayout.setVerticalGroup(
            pnl_DragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DragLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_titulo))
            .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(pnl_Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //Eventos para la ventana
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void pnl_DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_pnl_DragMouseDragged

    private void btn_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseEntered
        btn_Salir.setBackground(Color.decode("#EF5646"));
    }//GEN-LAST:event_btn_SalirMouseEntered

    private void btn_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseExited
        btn_Salir.setBackground(Color.white);
    }//GEN-LAST:event_btn_SalirMouseExited

    private void pnl_DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnl_DragMousePressed
        //Eventos para calcular RFC Y CURP
    private void btn_ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListoActionPerformed
        String nombre_co1, nombre_co2, apellidoP_co1, apellidoP_co2, apellidoM_co1, apellidoM_co2, fechaD, fechaMM, fechaAAAA; //Variables receptoras.
        String F_nombre_co1, F_nombre_co2, F_apellidoP_co1, F_apellidoP_co2, F_apellidoM_co1, F_apellidoM_co2, F_fechaD, F_fechaMM, F_fechaAAAA; //Variables substraidas.
        int int_fechaAAAA;
            //Nombres
        nombre_co1= txt_Nombre1.getText();
            F_nombre_co1 = nombre_co1.substring(0,1);
        nombre_co2 = txt_Nombre1.getText();
            F_nombre_co2 = nombre_co2.substring(2,3);
            //Apellidos
        apellidoP_co1 = txt_ApellidoP.getText();
            F_apellidoP_co1 = apellidoP_co1.substring(0,2);
        apellidoP_co2 = txt_ApellidoP.getText();
            F_apellidoP_co2 = apellidoP_co2.substring(2,3);
        apellidoM_co1 = txt_ApellidoM.getText();
            F_apellidoM_co1 = apellidoM_co1.substring(0,1);
        apellidoM_co2 = txt_ApellidoM.getText();
            F_apellidoM_co2 = apellidoM_co2.substring(2,3);
            //Fecha de nacimiento.
        fechaD = txt_fechaD.getText();
            F_fechaD = fechaD.substring(0,2);
        fechaMM = txt_fechaMM.getText();
            F_fechaMM = fechaMM.substring(0,2);
        fechaAAAA = txt_fechaAAAA.getText();
            F_fechaAAAA = fechaAAAA.substring(2,4);
                //Convertir año en números.
            int_fechaAAAA = Integer.parseInt(fechaAAAA);
            if(int_fechaAAAA > 1999){
                clave = "A";
            }else{
                clave = "9";
            }
        //Estado de nacimiento.
        switch (cmb_estado.getSelectedIndex()) {
            case 0:
                estado = "MC";  //Estado de México.
                break;
            case 1:
                estado = "DF";  //CDMX.
                break;
            case 2:
                estado = "HG";  //Hidalgo.
                break;
            case 3:
                estado = "CS";  //Chiapas.
                break;
            default:
                //No lo sé.
                break;
        }
            //Sexo.
        if(ckb_hombre.isSelected()){
             sexo = "H";
        }else{
             sexo = "M";
        }
            //Mostrar CURP
        String CURP = F_apellidoP_co1 + F_apellidoM_co1 + F_nombre_co1 + F_fechaAAAA + F_fechaMM + F_fechaD + sexo + estado 
                                 + F_apellidoP_co2 + F_apellidoM_co2 + F_nombre_co2 + clave + "9";
        String RFC =  F_apellidoP_co1 + F_apellidoM_co1 + F_nombre_co1 + " - "
                                 + F_fechaAAAA + F_fechaMM + F_fechaD + " - " + "PL9";
        txt_RFC.setText(RFC);
        txt_CURP.setText(CURP);
    }//GEN-LAST:event_btn_ListoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_registroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_registroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_registroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_registroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_registroSocial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Listo;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JCheckBox cb_mujer;
    private javax.swing.JCheckBox ckb_hombre;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstado2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lbl_ApellidoM;
    private javax.swing.JLabel lbl_ApellidoP;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_Drag;
    private javax.swing.JTextField txt_ApellidoM;
    private javax.swing.JTextField txt_ApellidoP;
    private javax.swing.JTextField txt_CURP;
    private javax.swing.JTextField txt_Nombre1;
    private javax.swing.JTextField txt_RFC;
    private javax.swing.JTextField txt_fechaAAAA;
    private javax.swing.JTextField txt_fechaD;
    private javax.swing.JTextField txt_fechaMM;
    // End of variables declaration//GEN-END:variables
}
