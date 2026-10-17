package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173500c;
    public final h d;
    public final i e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f173501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f173502h;
    public final d i;

    public m(String symbol, String ref2, String stockExchangeCode, h issue, i issuer, e coupon, j primaryStats, l lVar, d dVar) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        Intrinsics.checkNotNullParameter(primaryStats, "primaryStats");
        this.f173498a = symbol;
        this.f173499b = ref2;
        this.f173500c = stockExchangeCode;
        this.d = issue;
        this.e = issuer;
        this.f = coupon;
        this.f173501g = primaryStats;
        this.f173502h = lVar;
        this.i = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f173498a, mVar.f173498a) && Intrinsics.f(this.f173499b, mVar.f173499b) && Intrinsics.f(this.f173500c, mVar.f173500c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f173501g, mVar.f173501g) && Intrinsics.f(this.f173502h, mVar.f173502h) && Intrinsics.f(this.i, mVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f173501g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f173498a.hashCode() * 31, 31, this.f173499b), 31, this.f173500c)) * 31)) * 31)) * 31)) * 31;
        l lVar = this.f173502h;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        d dVar = this.i;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173499b;
    }
}
