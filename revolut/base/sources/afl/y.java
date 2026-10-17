package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4663c;
    public final Double d;

    public y(Double d, Double d5, Double d6, Double d10) {
        this.f4661a = d;
        this.f4662b = d5;
        this.f4663c = d6;
        this.d = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f4661a, yVar.f4661a) && Intrinsics.f(this.f4662b, yVar.f4662b) && Intrinsics.f(this.f4663c, yVar.f4663c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        Double d = this.f4661a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4662b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f4663c;
        int iHashCode3 = (iHashCode2 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.d;
        return iHashCode3 + (d10 != null ? d10.hashCode() : 0);
    }
}
