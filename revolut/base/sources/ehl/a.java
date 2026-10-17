package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126223b;

    public a(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f126222a = symbol;
        this.f126223b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f126222a, aVar.f126222a) && Intrinsics.f(this.f126223b, aVar.f126223b);
    }

    public final int hashCode() {
        return this.f126223b.hashCode() + (this.f126222a.hashCode() * 31);
    }
}
