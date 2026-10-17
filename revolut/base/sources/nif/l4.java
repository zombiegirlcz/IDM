package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f215930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f215931b;

    public l4(Double d, Double d5) {
        this.f215930a = d;
        this.f215931b = d5;
    }

    public final Double a() {
        return this.f215931b;
    }

    public final Double b() {
        return this.f215930a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.f215930a, l4Var.f215930a) && Intrinsics.f(this.f215931b, l4Var.f215931b);
    }

    public final int hashCode() {
        Double d = this.f215930a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f215931b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
