package uv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f283315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f283316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f283317c;
    public final Long d;
    public final Integer e;
    public final dj0.d f;

    public g(dj0.d dVar, Long l2, dj0.d dVar2, Long l3, Integer num, dj0.d dVar3) {
        this.f283315a = dVar;
        this.f283316b = l2;
        this.f283317c = dVar2;
        this.d = l3;
        this.e = num;
        this.f = dVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283315a, gVar.f283315a) && Intrinsics.f(this.f283316b, gVar.f283316b) && Intrinsics.f(this.f283317c, gVar.f283317c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        dj0.d dVar = this.f283315a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Long l2 = this.f283316b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        dj0.d dVar2 = this.f283317c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        dj0.d dVar3 = this.f;
        return iHashCode5 + (dVar3 != null ? dVar3.hashCode() : 0);
    }
}
