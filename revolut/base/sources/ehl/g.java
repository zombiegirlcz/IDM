package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f126248c;

    public g(String symbol, String ref2, jo3.b amount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f126246a = symbol;
        this.f126247b = ref2;
        this.f126248c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f126246a, gVar.f126246a) && Intrinsics.f(this.f126247b, gVar.f126247b) && Intrinsics.f(this.f126248c, gVar.f126248c);
    }

    public final int hashCode() {
        return this.f126248c.hashCode() + p.a.c(this.f126246a.hashCode() * 31, 31, this.f126247b);
    }
}
