package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class Bbox {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    final float f50940x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    final float f50941x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    final float f50942y1;
    final float y2;

    public Bbox(float f, float f4, float f5, float f6) {
        this.f50940x1 = f;
        this.f50942y1 = f4;
        this.f50941x2 = f5;
        this.y2 = f6;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Bbox)) {
            return false;
        }
        Bbox bbox = (Bbox) obj2;
        return this.f50940x1 == bbox.f50940x1 && this.f50942y1 == bbox.f50942y1 && this.f50941x2 == bbox.f50941x2 && this.y2 == bbox.y2;
    }

    public float getX1() {
        return this.f50940x1;
    }

    public float getX2() {
        return this.f50941x2;
    }

    public float getY1() {
        return this.f50942y1;
    }

    public float getY2() {
        return this.y2;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y2) + ((Float.floatToIntBits(this.f50941x2) + ((Float.floatToIntBits(this.f50942y1) + ((Float.floatToIntBits(this.f50940x1) + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Bbox{x1=");
        sb6.append(this.f50940x1);
        sb6.append(",y1=");
        sb6.append(this.f50942y1);
        sb6.append(",x2=");
        sb6.append(this.f50941x2);
        sb6.append(",y2=");
        return n.t(this.y2, "}", sb6);
    }
}
