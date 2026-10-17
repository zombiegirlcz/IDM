package zzj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzj.c f326754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rzj.d f326755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326756c;
    public final String d;
    public final String e;
    public final String f;

    public a(rzj.c scope, rzj.d symbolType, String symbol, String ref2, String baseCurrency, String str) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(symbolType, "symbolType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f326754a = scope;
        this.f326755b = symbolType;
        this.f326756c = symbol;
        this.d = ref2;
        this.e = baseCurrency;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f326754a == aVar.f326754a && this.f326755b == aVar.f326755b && Intrinsics.f(this.f326756c, aVar.f326756c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.f326755b.hashCode() + (this.f326754a.hashCode() * 31)) * 31, 31, this.f326756c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
