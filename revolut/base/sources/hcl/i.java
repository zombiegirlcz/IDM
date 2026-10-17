package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151009c;
    public final e d;
    public final f e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f151010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f151011h;
    public final c i;

    public i(String ref2, String symbol, String stockExchangeCode, e issue, f issuer, d coupon, g primaryStats, h hVar, c cVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        Intrinsics.checkNotNullParameter(primaryStats, "primaryStats");
        this.f151007a = ref2;
        this.f151008b = symbol;
        this.f151009c = stockExchangeCode;
        this.d = issue;
        this.e = issuer;
        this.f = coupon;
        this.f151010g = primaryStats;
        this.f151011h = hVar;
        this.i = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f151007a, iVar.f151007a) && Intrinsics.f(this.f151008b, iVar.f151008b) && Intrinsics.f(this.f151009c, iVar.f151009c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f151010g, iVar.f151010g) && Intrinsics.f(this.f151011h, iVar.f151011h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f151010g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f151007a.hashCode() * 31, 31, this.f151008b), 31, this.f151009c)) * 31)) * 31)) * 31)) * 31;
        h hVar = this.f151011h;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        c cVar = this.i;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
