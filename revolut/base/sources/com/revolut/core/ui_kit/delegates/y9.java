package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55640c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f55642h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f55643j;
    public final boolean k;

    public y9(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f55638a = z;
        this.f55639b = z3;
        this.f55640c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f55641g = z29;
        this.f55642h = z31;
        this.i = z41;
        this.f55643j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj2;
        return this.f55638a == y9Var.f55638a && this.f55639b == y9Var.f55639b && this.f55640c == y9Var.f55640c && this.d == y9Var.d && this.e == y9Var.e && this.f == y9Var.f && this.f55641g == y9Var.f55641g && this.f55642h == y9Var.f55642h && this.i == y9Var.i && this.f55643j == y9Var.f55643j && this.k == y9Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f55638a) * 31, 31, this.f55639b), 31, this.f55640c), 31, this.d), 31, this.e), 31, this.f), 31, this.f55641g), 31, this.f55642h), 31, this.i), 31, this.f55643j);
    }
}
