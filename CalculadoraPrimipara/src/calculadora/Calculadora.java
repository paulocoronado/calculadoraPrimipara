/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    
    int dato1;
    int dato2;
    double resultado;
    
    void sumar(){
        
        resultado=dato1+dato2;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
