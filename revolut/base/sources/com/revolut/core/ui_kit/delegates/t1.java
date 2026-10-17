package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54726c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54728h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54729j;

    public t1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f54724a = z;
        this.f54725b = z3;
        this.f54726c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f54727g = z29;
        this.f54728h = z31;
        this.i = z41;
        this.f54729j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return this.f54724a == t1Var.f54724a && this.f54725b == t1Var.f54725b && this.f54726c == t1Var.f54726c && this.d == t1Var.d && this.e == t1Var.e && this.f == t1Var.f && this.f54727g == t1Var.f54727g && this.f54728h == t1Var.f54728h && this.i == t1Var.i && this.f54729j == t1Var.f54729j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54729j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f54724a) * 31, 31, this.f54725b), 31, this.f54726c), 31, this.d), 31, this.e), 31, this.f), 31, this.f54727g), 31, this.f54728h), 31, this.i);
    }
}
