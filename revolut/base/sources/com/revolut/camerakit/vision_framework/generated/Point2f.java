package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class Point2f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final float f50945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final float f50946y;

    public Point2f(float f, float f4) {
        this.f50945x = f;
        this.f50946y = f4;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Point2f)) {
            return false;
        }
        Point2f point2f = (Point2f) obj2;
        return this.f50945x == point2f.f50945x && this.f50946y == point2f.f50946y;
    }

    public float getX() {
        return this.f50945x;
    }

    public float getY() {
        return this.f50946y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f50946y) + ((Float.floatToIntBits(this.f50945x) + 527) * 31);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Point2f{x=");
        sb6.append(this.f50945x);
        sb6.append(",y=");
        return n.t(this.f50946y, "}", sb6);
    }
}
