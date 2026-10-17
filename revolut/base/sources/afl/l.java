package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4612b;

    public l(Double d, Double d5) {
        this.f4611a = d;
        this.f4612b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f4611a, lVar.f4611a) && Intrinsics.f(this.f4612b, lVar.f4612b);
    }

    public final int hashCode() {
        Double d = this.f4611a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f4612b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
