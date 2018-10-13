/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciotablasimbolos;

import java.util.Dictionary;
import java.util.HashMap;

/**
 *
 * @author Rodrigo
 */
public class EjercicioTablaSimbolos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,TablaSimbolo> tablaSimbolos = new HashMap<String,TablaSimbolo>();
        TablaSimbolo simboloAtributos; 
        //int a = 111;
        //int a;
        //int b = 222;
        //int c = 333;
        //String x = 'Rodrigo';
        //a = b+c;
        //a= b*x;
        //z= x;
        
        tablaSimbolos.put("a", new TablaSimbolo("a", "Operando", "Entero", 1,"111"));
        
        tablaSimbolos.put("b", new TablaSimbolo("b", "Operando", "Entero", 2, "222"));
        
        tablaSimbolos.put("c", new TablaSimbolo("c", "Operando", "Entero", 3, "333"));
        
        tablaSimbolos.put("x", new TablaSimbolo("x", "Operando", "String", 4, "Rodrigo"));
        
        if (tablaSimbolos.containsKey("a"))
        {
            System.out.println("Existe");
            System.out.println("Se encuentra declarada en el renglon;"+ tablaSimbolos.get("a").getPosicion());
        }
                  
        else
            System.out.println("No Existe");
        
        
       
        
        System.out.println("Simbolo Valor   Posición    rol  Tipo");
        
         simboloAtributos =  tablaSimbolos.get("a");
        System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
        simboloAtributos.setValor("3");
        System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
         tablaSimbolos.get("a").setValor("4");
         System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
         
         simboloAtributos =  tablaSimbolos.get("b");
         System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
         
         simboloAtributos =  tablaSimbolos.get("c");
         System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
         
         //simboloAtributos =  tablaSimbolos.get("a");
         
         
         simboloAtributos =  tablaSimbolos.get("x");
         simboloAtributos.getTipo();
         
         System.out.println(simboloAtributos.getSimbolo()+" "+simboloAtributos.getValor()+" "+simboloAtributos.getPosicion()+" "+simboloAtributos.getRol()+" "+simboloAtributos.getTipo());
    }
    
}
