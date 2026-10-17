package rzj;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f258690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f258692c;
    public final xi0.b d;
    public final String e;

    public b(d symbolType, String symbol, String ref2, xi0.b baseCurrency, String str) {
        Intrinsics.checkNotNullParameter(symbolType, "symbolType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f258690a = symbolType;
        this.f258691b = symbol;
        this.f258692c = ref2;
        this.d = baseCurrency;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f258690a == bVar.f258690a && Intrinsics.f(this.f258691b, bVar.f258691b) && Intrinsics.f(this.f258692c, bVar.f258692c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iJ = l.j(this.d, p.a.c(p.a.c(this.f258690a.hashCode() * 31, 31, this.f258691b), 31, this.f258692c), 31);
        String str = this.e;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
