package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4660c;

    public x(Double d, Double d5, Double d6) {
        this.f4658a = d;
        this.f4659b = d5;
        this.f4660c = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f4658a, xVar.f4658a) && Intrinsics.f(this.f4659b, xVar.f4659b) && Intrinsics.f(this.f4660c, xVar.f4660c);
    }

    public final int hashCode() {
        Double d = this.f4658a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4659b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f4660c;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
