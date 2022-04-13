package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.turnRight(180);
        zofka.move(100);
        for(int i=0;i<3;i++) {

        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        }


    }

}
