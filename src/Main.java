public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Task 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task 1:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Task 2:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Task 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Task 3:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Task 4
        System.out.println("Task 4:");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        //Task 5
        System.out.println("Task 5:");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        //Task 6
        System.out.println("Task 6:");

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        var weightDifference = weightFirstBoxer - weightSecondBoxer;

        System.out.println("weightFirstBoxer = " + weightFirstBoxer);
        System.out.println("weightSecondBoxer = " + weightSecondBoxer);
        System.out.println("totalWeight = " + totalWeight);
        System.out.println("weightDifference = " + weightDifference);

        //Task 7
        System.out.println("Task 7:");

        weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("weightDifference = " + weightDifference);
        weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("weightDifference = " + weightDifference);

        // Task 8
        System.out.println("Task 8:");
        var allEmployeeHours = 640;
        var oneEmployeeHours = 8;
        var countEmployee = allEmployeeHours / oneEmployeeHours;

        System.out.println("Всего работников в компании — " + countEmployee + " человек");

        countEmployee = countEmployee + 94;

        //в критериях проверки задачи не указано, что требуется выполнять умножение
        // поэтому оставил то же самое число часов как и было в начальных условиях
        System.out.println("Если в компании работает " + countEmployee + " человек, то всего " + allEmployeeHours + " часов работы может быть поделено между сотрудниками");

    }
}