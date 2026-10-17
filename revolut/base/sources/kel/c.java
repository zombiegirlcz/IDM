package kel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f183153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f183154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f183155c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f183156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f183157h;

    public c(b cashHolding, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5, dj0.d dVar6, dj0.d dVar7) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f183153a = cashHolding;
        this.f183154b = dVar;
        this.f183155c = dVar2;
        this.d = dVar3;
        this.e = dVar4;
        this.f = dVar5;
        this.f183156g = dVar6;
        this.f183157h = dVar7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f183153a, cVar.f183153a) && Intrinsics.f(this.f183154b, cVar.f183154b) && Intrinsics.f(this.f183155c, cVar.f183155c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f183156g, cVar.f183156g) && Intrinsics.f(this.f183157h, cVar.f183157h);
    }

    @Override // kel.g
    public final String g() {
        return this.f183153a.f183148a.f183146b;
    }

    @Override // kel.g
    public final String getCurrency() {
        return this.f183153a.f183148a.e;
    }

    @Override // kel.g
    public final String getId() {
        return this.f183153a.f183148a.f183145a;
    }

    public final int hashCode() {
        int iHashCode = this.f183153a.hashCode() * 31;
        dj0.d dVar = this.f183154b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f183155c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.e;
        int iHashCode5 = (iHashCode4 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.f;
        int iHashCode6 = (iHashCode5 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        dj0.d dVar6 = this.f183156g;
        int iHashCode7 = (iHashCode6 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        dj0.d dVar7 = this.f183157h;
        return iHashCode7 + (dVar7 != null ? dVar7.hashCode() : 0);
    }
}
