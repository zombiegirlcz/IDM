package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276017c;
    public final String d;
    public final c1b.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String symbol, String str, c1b.f chartHandlerVersion) {
        super("updateLastClosingPriceForSymbol", 8);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        this.f276017c = symbol;
        this.d = str;
        this.e = chartHandlerVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f276017c, nVar.f276017c) && Intrinsics.f(this.d, nVar.d) && this.e == nVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f276017c.hashCode() * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
