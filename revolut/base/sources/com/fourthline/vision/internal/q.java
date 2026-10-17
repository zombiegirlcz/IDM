package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f36721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f36722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f36723c;
    private final float d;

    public q(float f, float f4, float f5, float f6) {
        this.f36721a = f;
        this.f36722b = f4;
        this.f36723c = f5;
        this.d = f6;
    }

    public static /* synthetic */ q copy$default(q qVar, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = qVar.f36721a;
        }
        if ((i & 2) != 0) {
            f4 = qVar.f36722b;
        }
        if ((i & 4) != 0) {
            f5 = qVar.f36723c;
        }
        if ((i & 8) != 0) {
            f6 = qVar.d;
        }
        return qVar.copy(f, f4, f5, f6);
    }

    public final float component1() {
        return this.f36721a;
    }

    public final float component2() {
        return this.f36722b;
    }

    public final float component3() {
        return this.f36723c;
    }

    public final float component4() {
        return this.d;
    }

    @NotNull
    public final q copy(float f, float f4, float f5, float f6) {
        return new q(f, f4, f5, f6);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Float.compare(this.f36721a, qVar.f36721a) == 0 && Float.compare(this.f36722b, qVar.f36722b) == 0 && Float.compare(this.f36723c, qVar.f36723c) == 0 && Float.compare(this.d, qVar.d) == 0;
    }

    public final float getBottom() {
        return this.d;
    }

    public final float getLeft() {
        return this.f36721a;
    }

    public final float getRight() {
        return this.f36723c;
    }

    public final float getTop() {
        return this.f36722b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f36721a) * 31) + Float.hashCode(this.f36722b)) * 31) + Float.hashCode(this.f36723c)) * 31) + Float.hashCode(this.d);
    }

    @NotNull
    public String toString() {
        return "BoundingBox(left=" + this.f36721a + ", top=" + this.f36722b + ", right=" + this.f36723c + ", bottom=" + this.d + ")";
    }
}
