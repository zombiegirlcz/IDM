package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iel.j f126228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126229c;
    public final boolean d;
    public final n e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f126230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f126231h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f126232j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f126233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f126234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f126235n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f126236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f126237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f126238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f126239s;

    public c(String eventId, iel.j type, LocalDate effectiveDate, boolean z, n nVar, e eVar, s sVar, m mVar, u uVar, t tVar, j jVar, k kVar, p pVar, r rVar, a aVar, b bVar, l lVar, i iVar, o oVar) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        this.f126227a = eventId;
        this.f126228b = type;
        this.f126229c = effectiveDate;
        this.d = z;
        this.e = nVar;
        this.f = eVar;
        this.f126230g = sVar;
        this.f126231h = mVar;
        this.i = uVar;
        this.f126232j = tVar;
        this.k = jVar;
        this.f126233l = kVar;
        this.f126234m = pVar;
        this.f126235n = rVar;
        this.o = aVar;
        this.f126236p = bVar;
        this.f126237q = lVar;
        this.f126238r = iVar;
        this.f126239s = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f126227a, cVar.f126227a) && this.f126228b == cVar.f126228b && Intrinsics.f(this.f126229c, cVar.f126229c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f126230g, cVar.f126230g) && Intrinsics.f(this.f126231h, cVar.f126231h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f126232j, cVar.f126232j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f126233l, cVar.f126233l) && Intrinsics.f(this.f126234m, cVar.f126234m) && Intrinsics.f(this.f126235n, cVar.f126235n) && Intrinsics.f(this.o, cVar.o) && Intrinsics.f(this.f126236p, cVar.f126236p) && Intrinsics.f(this.f126237q, cVar.f126237q) && Intrinsics.f(this.f126238r, cVar.f126238r) && Intrinsics.f(this.f126239s, cVar.f126239s);
    }

    public final int hashCode() {
        int iC = j6.a.c(y.a((this.f126228b.hashCode() + (this.f126227a.hashCode() * 31)) * 31, 31, this.f126229c), 31, this.d);
        n nVar = this.e;
        int iHashCode = (iC + (nVar == null ? 0 : nVar.hashCode())) * 31;
        e eVar = this.f;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        s sVar = this.f126230g;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f126231h;
        int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        u uVar = this.i;
        int iHashCode5 = (iHashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        t tVar = this.f126232j;
        int iHashCode6 = (iHashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        j jVar = this.k;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.f126233l;
        int iHashCode8 = (iHashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        p pVar = this.f126234m;
        int iHashCode9 = (iHashCode8 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        r rVar = this.f126235n;
        int iHashCode10 = (iHashCode9 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        a aVar = this.o;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f126236p;
        int iHashCode12 = (iHashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f126237q;
        int iHashCode13 = (iHashCode12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.f126238r;
        int iHashCode14 = (iHashCode13 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        o oVar = this.f126239s;
        return iHashCode14 + (oVar != null ? oVar.hashCode() : 0);
    }
}
