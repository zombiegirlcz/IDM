package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iel.j f126303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126304c;
    public final n d;
    public final e e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f126305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f126306h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f126307j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f126308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f126309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f126310n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f126311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f126312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f126313r;

    public x(String eventId, iel.j type, LocalDate effectiveDate, n nVar, e eVar, s sVar, m mVar, u uVar, t tVar, j jVar, k kVar, p pVar, r rVar, a aVar, b bVar, l lVar, i iVar, o oVar) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        this.f126302a = eventId;
        this.f126303b = type;
        this.f126304c = effectiveDate;
        this.d = nVar;
        this.e = eVar;
        this.f = sVar;
        this.f126305g = mVar;
        this.f126306h = uVar;
        this.i = tVar;
        this.f126307j = jVar;
        this.k = kVar;
        this.f126308l = pVar;
        this.f126309m = rVar;
        this.f126310n = aVar;
        this.o = bVar;
        this.f126311p = lVar;
        this.f126312q = iVar;
        this.f126313r = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f126302a, xVar.f126302a) && this.f126303b == xVar.f126303b && Intrinsics.f(this.f126304c, xVar.f126304c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f126305g, xVar.f126305g) && Intrinsics.f(this.f126306h, xVar.f126306h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f126307j, xVar.f126307j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f126308l, xVar.f126308l) && Intrinsics.f(this.f126309m, xVar.f126309m) && Intrinsics.f(this.f126310n, xVar.f126310n) && Intrinsics.f(this.o, xVar.o) && Intrinsics.f(this.f126311p, xVar.f126311p) && Intrinsics.f(this.f126312q, xVar.f126312q) && Intrinsics.f(this.f126313r, xVar.f126313r);
    }

    public final int hashCode() {
        int iA = y.a((this.f126303b.hashCode() + (this.f126302a.hashCode() * 31)) * 31, 31, this.f126304c);
        n nVar = this.d;
        int iHashCode = (iA + (nVar == null ? 0 : nVar.hashCode())) * 31;
        e eVar = this.e;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        s sVar = this.f;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f126305g;
        int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        u uVar = this.f126306h;
        int iHashCode5 = (iHashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        t tVar = this.i;
        int iHashCode6 = (iHashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        j jVar = this.f126307j;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.k;
        int iHashCode8 = (iHashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        p pVar = this.f126308l;
        int iHashCode9 = (iHashCode8 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        r rVar = this.f126309m;
        int iHashCode10 = (iHashCode9 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        a aVar = this.f126310n;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.o;
        int iHashCode12 = (iHashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f126311p;
        int iHashCode13 = (iHashCode12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.f126312q;
        int iHashCode14 = (iHashCode13 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        o oVar = this.f126313r;
        return iHashCode14 + (oVar != null ? oVar.hashCode() : 0);
    }

    public /* synthetic */ x(String str, iel.j jVar, LocalDate localDate, n nVar, e eVar, s sVar, m mVar, u uVar, t tVar, j jVar2, k kVar, p pVar, r rVar, a aVar, b bVar, l lVar, i iVar, o oVar, int i) {
        this(str, jVar, localDate, (i & 8) != 0 ? null : nVar, (i & 16) != 0 ? null : eVar, (i & 32) != 0 ? null : sVar, (i & 64) != 0 ? null : mVar, (i & 128) != 0 ? null : uVar, (i & 256) != 0 ? null : tVar, (i & 512) != 0 ? null : jVar2, (i & 1024) != 0 ? null : kVar, (i & 2048) != 0 ? null : pVar, (i & 4096) != 0 ? null : rVar, (i & 8192) != 0 ? null : aVar, (i & 16384) != 0 ? null : bVar, (32768 & i) != 0 ? null : lVar, (65536 & i) != 0 ? null : iVar, (i & 131072) != 0 ? null : oVar);
    }
}
