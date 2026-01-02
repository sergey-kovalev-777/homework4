import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nHomework4");

        System.out.println("\nЗадача 1");

        int age;
        age = 16;
        if (age >= 18) { System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний");}
        else  { System.out.println("Если возраст человека равен " +age+ ", то он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println("\nЗадача 2");

        int temperature;
        temperature = 10;
        if (temperature <=5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature >5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

            System.out.println("\nЗадача 3");

        int speed;
        speed = 70;
        if (speed <= 60) {System.out.println("Если скорость "+speed+", можно ездить спокойно");}
        else {System.out.println("Если скорость "+speed+", придется заплатить штраф");}

        System.out.println("\nЗадача 4");

        int ageLife;
        ageLife = 99;
        if (ageLife >=2 && ageLife <=6) { System.out.println("Если возраст человека равен "+ageLife+", то ему нужно ходить в детский сад"); }
        else  if (ageLife >=7 && ageLife <=17) { System.out.println("Если возраст человека равен "+ageLife+", то ему нужно ходить в школу"); }
        else if (ageLife >=18 && ageLife <=24) { System.out.println("Если возраст человека равен "+ageLife+", то ему нужно ходить в университет"); }
        else { System.out.println("Если возраст человека равен "+ageLife+", то ему нужно ходить на работу"); }

    // не особо понял, почему последнее else зереботало без условия в скобках, изначально задавал больше 24, результат этого чисто перебор написания

        System.out.println("\nЗадача 5");

        int childYear;
        childYear = 25;
        if (childYear <5) { System.out.println("Если возраст ребенка равен "+childYear+", то ему нельзя кататься на аттракционе"); }
        else if (childYear >= 5 && childYear <= 14) { System.out.println("Если возраст ребенка равен " + childYear + ", то ему можно кататься на аттракционе в сопровождении взрослого"); }
        else if (childYear > 14) { System.out.println("Если возраст ребенка равен " + childYear + ", то ему можно кататься на аттракционе без сопровождения взрослого"); }

        System.out.println("\nЗадача 6");

        byte wagonCapacity = 102;
        byte seatPlaces = 60;
        int passenger;
        passenger = 85;
        if (passenger == 102) { System.out.println("Вагон заполнен полностью"); }
        else if (passenger < 60) { System.out.println("В вагоне есть сидячие и стоячие места"); }
        else if (passenger >=60 && passenger <102) { System.out.println("В вагоне есть стоячие места"); }

        System.out.println("\nЗадача 7");

        int one = 11;
        int two = 24;
        int three = 8;

        if (one > two && one > three) { System.out.println("Первое число самое большое"); }
        else if (two > one && two > three) { System.out.println("Второе число самое большое"); }
        else { System.out.println("Третье число самое большое"); }

        //этот ответ я нашел с помощью Германа)) вот и думаю, а как тогда быть с большим количеством сравниваемых?....
    }
}