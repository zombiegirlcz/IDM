package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f4618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f4619c;
    public final t0 d;
    public final Double e;

    public n(dj0.d dVar, t0 t0Var, t0 t0Var2, t0 t0Var3, Double d) {
        this.f4617a = dVar;
        this.f4618b = t0Var;
        this.f4619c = t0Var2;
        this.d = t0Var3;
        this.e = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f4617a, nVar.f4617a) && Intrinsics.f(this.f4618b, nVar.f4618b) && Intrinsics.f(this.f4619c, nVar.f4619c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f4617a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        t0 t0Var = this.f4618b;
        int iHashCode2 = (iHashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        t0 t0Var2 = this.f4619c;
        int iHashCode3 = (iHashCode2 + (t0Var2 == null ? 0 : t0Var2.hashCode())) * 31;
        t0 t0Var3 = this.d;
        int iHashCode4 = (iHashCode3 + (t0Var3 == null ? 0 : t0Var3.hashCode())) * 31;
        Double d = this.e;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }
}
