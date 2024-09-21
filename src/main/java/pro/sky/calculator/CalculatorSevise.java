package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorSevise {


    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Double divide(Integer num1, Integer num2) {
        return (double) num1 / num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
}
