package com.revolut.core.ui_kit.delegates.widgets;

/* JADX INFO: loaded from: classes19.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55495c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f55497h;

    public r4(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f55493a = z;
        this.f55494b = z3;
        this.f55495c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f55496g = z29;
        this.f55497h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return this.f55493a == r4Var.f55493a && this.f55494b == r4Var.f55494b && this.f55495c == r4Var.f55495c && this.d == r4Var.d && this.e == r4Var.e && this.f == r4Var.f && this.f55496g == r4Var.f55496g && this.f55497h == r4Var.f55497h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55497h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f55493a) * 31, 31, this.f55494b), 31, this.f55495c), 31, this.d), 31, this.e), 31, this.f), 31, this.f55496g);
    }
}
