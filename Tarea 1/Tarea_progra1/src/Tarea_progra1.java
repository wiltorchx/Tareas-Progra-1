/*Buenas profe, le hice unos cambios al programa basandome en lo que he aprendido */

import javax.swing.*;
class Tarea_progra1 {

    public static void main(String[] args) {
      menu();
    }
   
    
          public static void menu(){
         int opcion ;  
         
           do{
              opcion = Integer.parseInt(JOptionPane.showInputDialog(null,""
                      + "\n Digite una opcion "
                      + "\n 1-Sumar "
                      + "\n 2-Restar  "
                      + "\n 3-Multiplicar "
                      + "\n 4-Dividir "
                      + "\n 5-CondicionIf"
                      + "\n 6-Condicionswitch"
                      + "\n 7-Ciclowhile"
                      + "\n 8-Salir" ));
              
               switch (opcion){
               case 1: sumar();
               break;
               case 2: restar();
               break;
               case 3: multiplicar();
               break;
               case 4: dividir();
               break;
               case 5: condicionIf();
               break;
               case 6: condicionswitch();
               break;
               case 7: ciclowhile();
               break;
               case 8: 
                      JOptionPane.showMessageDialog(null,"Gracias por usar el programa!");
                            break;  
               default: 
                      JOptionPane.showMessageDialog(null,"Opcion invalida... \n Presione enter para regresar al menu");
                      break;
                }
            }while (opcion !=8);
       }
       
       public static void sumar() {
       
         int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
           
         int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
          

        int total = num1 + num2;

        JOptionPane.showMessageDialog(null, "Total de la suma: " + total);
       }
       
       public static void restar() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
          
        int total = num1 - num2;
           
        JOptionPane.showMessageDialog(null, "Total de la resta: " + total);
       }
       
       public static void multiplicar() {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
           
        int total = num1 * num2;
           
        JOptionPane.showMessageDialog(null, "Total de la multiplicacion: " + total);
        
       }
       
       public static void dividir() {
           
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
          
        int total = num1 / num2;
           
        JOptionPane.showMessageDialog(null, "Total de la Division: " + total);
       }
       
        public static void condicionIf() {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
            int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Tercer número: "));
            
            if((num1> num2)&&(num1>num3)){
            
             JOptionPane.showMessageDialog(null,num1 + " es mayor que " + num2);
            }
            else if((num2> num1)&&(num2>num3)){
            
            JOptionPane.showMessageDialog(null,num2 + " es el mayor " );
            }
            else if((num3> num1)&&(num3>num2)){
            
            JOptionPane.showMessageDialog(null,num3 + " es el mayor " );
            }
            else if((num1== num2)&&(num2== num3)){
            
            JOptionPane.showMessageDialog(null,num3 + " Los tres numeros son iguales " ); }
             }
    
        public static void ciclowhile() {
   
       int x =0;
       x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
       while (x <=20){
           if((x>5) &&(x <10)){
           JOptionPane.showMessageDialog(null,"Valor " + x);
           }
           x = x + 1;
         }
   }
       public static void condicionswitch() {
       
       byte dia = 0;
       dia = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite el día: "));
      
       
       switch (dia){
       
           case 1:
               JOptionPane.showMessageDialog(null,"El dia es Lunes"); 
           break;
           case 2:
               JOptionPane.showMessageDialog(null,"El dia es Martes"); 
           break;
           case 3:
               JOptionPane.showMessageDialog(null,"El dia es Miercoles"); 
           break;
           case 4:
               JOptionPane.showMessageDialog(null,"El dia es Jueves"); 
           break;
           case 5:
               JOptionPane.showMessageDialog(null,"El dia es Viernes"); 
           break;
           case 6:
               JOptionPane.showMessageDialog(null,"El dia esSabado"); 
           break;
           case 7:
               JOptionPane.showMessageDialog(null,"El dia es Domingo"); 
           break;
           
           default:
               JOptionPane.showMessageDialog(null,"Dia invalido \n Regresando al menu..."); 
           break;
       }
    
    }     
    }  
