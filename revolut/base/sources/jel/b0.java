package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173413c;
    public final h0 d;
    public final m0 e;
    public final n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f173414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f173415h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f173416j;

    public b0(String symbol, String ref2, String stockExchangeCode, h0 h0Var, m0 m0Var, n0 n0Var, c0 c0Var, j0 j0Var, d0 d0Var, x xVar) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f173411a = symbol;
        this.f173412b = ref2;
        this.f173413c = stockExchangeCode;
        this.d = h0Var;
        this.e = m0Var;
        this.f = n0Var;
        this.f173414g = c0Var;
        this.f173415h = j0Var;
        this.i = d0Var;
        this.f173416j = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f173411a, b0Var.f173411a) && Intrinsics.f(this.f173412b, b0Var.f173412b) && Intrinsics.f(this.f173413c, b0Var.f173413c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f173414g, b0Var.f173414g) && Intrinsics.f(this.f173415h, b0Var.f173415h) && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f173416j, b0Var.f173416j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f173411a.hashCode() * 31, 31, this.f173412b), 31, this.f173413c);
        h0 h0Var = this.d;
        int iHashCode = (iC + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        m0 m0Var = this.e;
        int iHashCode2 = (iHashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        n0 n0Var = this.f;
        int iHashCode3 = (iHashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        c0 c0Var = this.f173414g;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        j0 j0Var = this.f173415h;
        int iHashCode5 = (iHashCode4 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        d0 d0Var = this.i;
        int iHashCode6 = (iHashCode5 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        x xVar = this.f173416j;
        return iHashCode6 + (xVar != null ? xVar.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173412b;
    }
}
