/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;

/**
 *
 * @author GAARA
 */
public class datos {
   String nombre;
    String fechadenacimiento;
    String curp;

    public datos(String nombre, String fechadenacimiento, String curp) {
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
        this.curp = curp;
    }

    public datos() {
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfechadenacimiernto() {
        return fechadenacimiento;
    }

    public void setfechadenacimieot(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getcurp() {
        return curp;
    }

    public void setcurp(String curp) {
        this.curp = curp;
    }
    
    
}
    

