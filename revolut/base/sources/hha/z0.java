package hha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152380c;
    public final String d;
    public final y0 e;
    public final x0 f;

    public z0(String planId, boolean z, boolean z3, String displayCode, y0 loyaltyRate, x0 x0Var) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(displayCode, "displayCode");
        Intrinsics.checkNotNullParameter(loyaltyRate, "loyaltyRate");
        this.f152378a = planId;
        this.f152379b = z;
        this.f152380c = z3;
        this.d = displayCode;
        this.e = loyaltyRate;
        this.f = x0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f152378a, z0Var.f152378a) && this.f152379b == z0Var.f152379b && this.f152380c == z0Var.f152380c && Intrinsics.f(this.d, z0Var.d) && Intrinsics.f(this.e, z0Var.e) && Intrinsics.f(this.f, z0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(j6.a.c(j6.a.c(this.f152378a.hashCode() * 31, 31, this.f152379b), 31, this.f152380c), 31, this.d)) * 31;
        x0 x0Var = this.f;
        return iHashCode + (x0Var == null ? 0 : x0Var.hashCode());
    }
}
