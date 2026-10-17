package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class t2 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54732c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54734h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54735j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f54736l;

    public t2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f54730a = z;
        this.f54731b = z3;
        this.f54732c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f54733g = z29;
        this.f54734h = z31;
        this.i = z41;
        this.f54735j = z49;
        this.k = z54;
        this.f54736l = z74;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f54736l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return this.f54730a == t2Var.f54730a && this.f54731b == t2Var.f54731b && this.f54732c == t2Var.f54732c && this.d == t2Var.d && this.e == t2Var.e && this.f == t2Var.f && this.f54733g == t2Var.f54733g && this.f54734h == t2Var.f54734h && this.i == t2Var.i && this.f54735j == t2Var.f54735j && this.k == t2Var.k && this.f54736l == t2Var.f54736l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54736l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f54730a) * 31, 31, this.f54731b), 31, this.f54732c), 31, this.d), 31, this.e), 31, this.f), 31, this.f54733g), 31, this.f54734h), 31, this.i), 31, this.f54735j), 31, this.k);
    }
}
