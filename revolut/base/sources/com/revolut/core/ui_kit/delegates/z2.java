package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55665c;
    public final boolean d;

    public z2(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f55663a = z;
        this.f55664b = z3;
        this.f55665c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.f55663a == z2Var.f55663a && this.f55664b == z2Var.f55664b && this.f55665c == z2Var.f55665c && this.d == z2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f55663a) * 31, 31, this.f55664b), 31, this.f55665c);
    }
}
