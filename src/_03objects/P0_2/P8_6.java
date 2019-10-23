package _03objects.P0_2;

public class P8_6 {

    private final float fuelEfficiency;
    private float fuelLevel;

    public P8_6(float f){
        fuelEfficiency = f;
        fuelLevel = 0;
    }
    public void drive(float dist){
        float gasSpent = dist / fuelEfficiency ;
        fuelLevel -= gasSpent;
    }

    public void addGas(float fill){
        fuelLevel += fill;
    }
    public float getGasLevel(){
        return fuelLevel;
    }

    public static void main(String[] args) {
        P8_6 myHybrid = new P8_6(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        System.out.println("amout of gas left in the car is " + myHybrid.getGasLevel());

    }
}
