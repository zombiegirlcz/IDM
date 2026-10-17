package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4609c;

    public k(Double d, Double d5, Double d6) {
        this.f4607a = d;
        this.f4608b = d5;
        this.f4609c = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f4607a, kVar.f4607a) && Intrinsics.f(this.f4608b, kVar.f4608b) && Intrinsics.f(this.f4609c, kVar.f4609c);
    }

    public final int hashCode() {
        Double d = this.f4607a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4608b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f4609c;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
