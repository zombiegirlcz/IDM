package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f173482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f173483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f173484c;

    public j0(o0 o0Var, d1 d1Var, r0 r0Var) {
        this.f173482a = o0Var;
        this.f173483b = d1Var;
        this.f173484c = r0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f173482a, j0Var.f173482a) && Intrinsics.f(this.f173483b, j0Var.f173483b) && Intrinsics.f(this.f173484c, j0Var.f173484c);
    }

    public final int hashCode() {
        o0 o0Var = this.f173482a;
        int iHashCode = (o0Var == null ? 0 : o0Var.hashCode()) * 31;
        d1 d1Var = this.f173483b;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        r0 r0Var = this.f173484c;
        return iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0);
    }
}
