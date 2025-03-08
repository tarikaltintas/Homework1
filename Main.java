class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);
    }
}
