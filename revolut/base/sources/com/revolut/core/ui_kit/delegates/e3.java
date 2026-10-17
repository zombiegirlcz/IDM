package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54078b;

    public e3(int i, int i2) {
        this.f54077a = i;
        this.f54078b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return this.f54077a == e3Var.f54077a && this.f54078b == e3Var.f54078b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54078b) + (Integer.hashCode(this.f54077a) * 31);
    }
}
