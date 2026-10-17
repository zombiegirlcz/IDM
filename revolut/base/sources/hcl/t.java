package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151155c;
    public final w d;
    public final y e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f151156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f151157h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f151158j;

    public t(String ref2, String symbol, String stockExchangeCode, w wVar, y yVar, z zVar, u uVar, x xVar, v vVar, s sVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f151153a = ref2;
        this.f151154b = symbol;
        this.f151155c = stockExchangeCode;
        this.d = wVar;
        this.e = yVar;
        this.f = zVar;
        this.f151156g = uVar;
        this.f151157h = xVar;
        this.i = vVar;
        this.f151158j = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f151153a, tVar.f151153a) && Intrinsics.f(this.f151154b, tVar.f151154b) && Intrinsics.f(this.f151155c, tVar.f151155c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f151156g, tVar.f151156g) && Intrinsics.f(this.f151157h, tVar.f151157h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f151158j, tVar.f151158j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151153a.hashCode() * 31, 31, this.f151154b), 31, this.f151155c);
        w wVar = this.d;
        int iHashCode = (iC + (wVar == null ? 0 : wVar.hashCode())) * 31;
        y yVar = this.e;
        int iHashCode2 = (iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        z zVar = this.f;
        int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        u uVar = this.f151156g;
        int iHashCode4 = (iHashCode3 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        x xVar = this.f151157h;
        int iHashCode5 = (iHashCode4 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        v vVar = this.i;
        int iHashCode6 = (iHashCode5 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        s sVar = this.f151158j;
        return iHashCode6 + (sVar != null ? sVar.hashCode() : 0);
    }
}
