package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173508c;
    public final n1 d;

    public m1(String symbol, String ref2, String stockExchangeCode, n1 n1Var) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f173506a = symbol;
        this.f173507b = ref2;
        this.f173508c = stockExchangeCode;
        this.d = n1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f173506a, m1Var.f173506a) && Intrinsics.f(this.f173507b, m1Var.f173507b) && Intrinsics.f(this.f173508c, m1Var.f173508c) && Intrinsics.f(this.d, m1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f173506a.hashCode() * 31, 31, this.f173507b), 31, this.f173508c);
        n1 n1Var = this.d;
        return iC + (n1Var == null ? 0 : n1Var.hashCode());
    }

    @Override // jel.c
    public final String i() {
        return this.f173507b;
    }
}
