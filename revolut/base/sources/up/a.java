package up;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f281667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f281668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f281669c;
    public final Long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f281670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f281671h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f281672j;

    public a(long j2, long j3, long j5, Long l2, Long l3, Long l4, Long l5, Long l22, Long l31, Long l37) {
        this.f281667a = j2;
        this.f281668b = j3;
        this.f281669c = j5;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.f281670g = l5;
        this.f281671h = l22;
        this.i = l31;
        this.f281672j = l37;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f281667a == aVar.f281667a && this.f281668b == aVar.f281668b && this.f281669c == aVar.f281669c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f281670g, aVar.f281670g) && Intrinsics.f(this.f281671h, aVar.f281671h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f281672j, aVar.f281672j);
    }

    public final int hashCode() {
        int iC = d.c(d.c(Long.hashCode(this.f281667a) * 31, 31, this.f281668b), 31, this.f281669c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f281670g;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.f281671h;
        int iHashCode5 = (iHashCode4 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.i;
        int iHashCode6 = (iHashCode5 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.f281672j;
        return iHashCode6 + (l37 != null ? l37.hashCode() : 0);
    }
}
