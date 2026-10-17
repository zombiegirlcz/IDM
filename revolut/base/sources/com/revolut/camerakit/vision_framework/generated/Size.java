package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class Size {
    final double height;
    final double width;

    public Size(double d, double d5) {
        this.width = d;
        this.height = d5;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Size)) {
            return false;
        }
        Size size = (Size) obj2;
        return this.width == size.width && this.height == size.height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((527 + ((int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32)));
    }

    public String toString() {
        return "Size{width=" + this.width + ",height=" + this.height + "}";
    }
}
