package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4646c;

    public t(Double d, Double d5, Double d6) {
        this.f4644a = d;
        this.f4645b = d5;
        this.f4646c = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f4644a, tVar.f4644a) && Intrinsics.f(this.f4645b, tVar.f4645b) && Intrinsics.f(this.f4646c, tVar.f4646c);
    }

    public final int hashCode() {
        Double d = this.f4644a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4645b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f4646c;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
