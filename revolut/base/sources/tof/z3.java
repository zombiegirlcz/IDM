package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f273193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f273194b;

    public z3(dj0.d dVar, Double d) {
        this.f273193a = d;
        this.f273194b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f273193a, z3Var.f273193a) && Intrinsics.f(this.f273194b, z3Var.f273194b);
    }

    public final int hashCode() {
        Double d = this.f273193a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        dj0.d dVar = this.f273194b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
