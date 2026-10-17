package ht0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155139c;
    public final boolean d;
    public final c0 e;

    public e0(float f, float f4, boolean z, boolean z3, c0 c0Var) {
        this.f155137a = f;
        this.f155138b = f4;
        this.f155139c = z;
        this.d = z3;
        this.e = c0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Float.compare(this.f155137a, e0Var.f155137a) == 0 && Float.compare(this.f155138b, e0Var.f155138b) == 0 && this.f155139c == e0Var.f155139c && this.d == e0Var.d && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(m72.b.b(this.f155138b, Float.hashCode(this.f155137a) * 31, 31), 31, this.f155139c), 31, this.d);
        c0 c0Var = this.e;
        return iC + (c0Var == null ? 0 : c0Var.hashCode());
    }
}
