package id.ac.polinema.idealbodyweight.util;

public class BmiIndex {
    private int mass;
    private int height;
    private float result;
    private String index;

    public BmiIndex(int mass, int height) {
        this.mass = mass;
        this.height = height;
        this.index = calculate();
    }

    public String getIndex() {
        return index;
    }

    private String calculate() {
        result = mass / (height/100);
        index = "default";
        if (result < 18.50){
            index = "Underweight";
        }else if (result > 18.50 && result < 24.99){
            index = "Healthy Weight";
        }else if (result > 25.00) {
            index = "Overweight";
        }else {
            index = "Unknown";
        }
        return index;
    }
}
