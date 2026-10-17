package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f174090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f174091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f174092c;
    public final k d;
    public final l e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f174093g;

    public t(p pVar, r rVar, m mVar, k kVar, l lVar, q qVar, g gVar) {
        this.f174090a = pVar;
        this.f174091b = rVar;
        this.f174092c = mVar;
        this.d = kVar;
        this.e = lVar;
        this.f = qVar;
        this.f174093g = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f174090a, tVar.f174090a) && Intrinsics.f(this.f174091b, tVar.f174091b) && Intrinsics.f(this.f174092c, tVar.f174092c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f174093g, tVar.f174093g);
    }

    public final int hashCode() {
        p pVar = this.f174090a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        r rVar = this.f174091b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        m mVar = this.f174092c;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.f174080a.hashCode())) * 31;
        k kVar = this.d;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.e;
        int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.f174079a.hashCode())) * 31;
        q qVar = this.f;
        int iHashCode6 = (iHashCode5 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        g gVar = this.f174093g;
        return iHashCode6 + (gVar != null ? gVar.hashCode() : 0);
    }
}
