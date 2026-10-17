package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55678c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f55680h;

    public z7(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f55676a = z;
        this.f55677b = z3;
        this.f55678c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f55679g = z29;
        this.f55680h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj2;
        return this.f55676a == z7Var.f55676a && this.f55677b == z7Var.f55677b && this.f55678c == z7Var.f55678c && this.d == z7Var.d && this.e == z7Var.e && this.f == z7Var.f && this.f55679g == z7Var.f55679g && this.f55680h == z7Var.f55680h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55680h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f55676a) * 31, 31, this.f55677b), 31, this.f55678c), 31, this.d), 31, this.e), 31, this.f), 31, this.f55679g);
    }
}
