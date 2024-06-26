package model;

public class Car {

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void go(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int prob = randomNumberGenerator.generate();
        if (prob >= 4){
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
