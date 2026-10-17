package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f273006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f273007b;

    public q3(Double d, xi0.b bVar) {
        this.f273006a = d;
        this.f273007b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f273006a, q3Var.f273006a) && Intrinsics.f(this.f273007b, q3Var.f273007b);
    }

    public final int hashCode() {
        Double d = this.f273006a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        xi0.b bVar = this.f273007b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
