package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f4634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f4635c;

    public r(Double d, dj0.d dVar, Double d5) {
        this.f4633a = d;
        this.f4634b = dVar;
        this.f4635c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f4633a, rVar.f4633a) && Intrinsics.f(this.f4634b, rVar.f4634b) && Intrinsics.f(this.f4635c, rVar.f4635c);
    }

    public final int hashCode() {
        Double d = this.f4633a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        dj0.d dVar = this.f4634b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Double d5 = this.f4635c;
        return iHashCode2 + (d5 != null ? d5.hashCode() : 0);
    }
}
