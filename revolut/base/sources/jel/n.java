package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173514c;
    public final String d;
    public final String e;

    public n(String symbol, String ref2, String stockExchangeCode, String str, String str2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f173512a = symbol;
        this.f173513b = ref2;
        this.f173514c = stockExchangeCode;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f173512a, nVar.f173512a) && Intrinsics.f(this.f173513b, nVar.f173513b) && Intrinsics.f(this.f173514c, nVar.f173514c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f173512a.hashCode() * 31, 31, this.f173513b), 31, this.f173514c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173513b;
    }
}
