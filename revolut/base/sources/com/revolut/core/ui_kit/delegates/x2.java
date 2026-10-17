package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55591c;
    public final boolean d;
    public final boolean e;

    public x2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f55589a = z;
        this.f55590b = z3;
        this.f55591c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return this.f55589a == x2Var.f55589a && this.f55590b == x2Var.f55590b && this.f55591c == x2Var.f55591c && this.d == x2Var.d && this.e == x2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f55589a) * 31, 31, this.f55590b), 31, this.f55591c), 31, this.d);
    }
}
