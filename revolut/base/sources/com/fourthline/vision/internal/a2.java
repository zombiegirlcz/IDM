package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35933b;

    public a2(int i, int i2) {
        this.f35932a = i;
        this.f35933b = i2;
    }

    public static /* synthetic */ a2 copy$default(a2 a2Var, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = a2Var.f35932a;
        }
        if ((i3 & 2) != 0) {
            i2 = a2Var.f35933b;
        }
        return a2Var.copy(i, i2);
    }

    public final int component1() {
        return this.f35932a;
    }

    public final int component2() {
        return this.f35933b;
    }

    @NotNull
    public final a2 copy(int i, int i2) {
        return new a2(i, i2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return this.f35932a == a2Var.f35932a && this.f35933b == a2Var.f35933b;
    }

    public final int getX() {
        return this.f35932a;
    }

    public final int getY() {
        return this.f35933b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f35932a) * 31) + Integer.hashCode(this.f35933b);
    }

    @NotNull
    public String toString() {
        return "Coordinate(x=" + this.f35932a + ", y=" + this.f35933b + ")";
    }
}
