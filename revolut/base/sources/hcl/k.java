package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151028c;
    public final String d;
    public final String e;

    public k(String ref2, String symbol, String stockExchangeCode, String str, String str2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f151026a = ref2;
        this.f151027b = symbol;
        this.f151028c = stockExchangeCode;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f151026a, kVar.f151026a) && Intrinsics.f(this.f151027b, kVar.f151027b) && Intrinsics.f(this.f151028c, kVar.f151028c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151026a.hashCode() * 31, 31, this.f151027b), 31, this.f151028c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
