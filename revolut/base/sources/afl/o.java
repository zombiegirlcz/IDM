package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4622b;

    public o(Double d, Double d5) {
        this.f4621a = d;
        this.f4622b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f4621a, oVar.f4621a) && Intrinsics.f(this.f4622b, oVar.f4622b);
    }

    public final int hashCode() {
        Double d = this.f4621a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4622b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
