package u01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1b.b f276015c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d1b.b historyItem, String symbol) {
        super("updateLastBarForSymbol", 8);
        Intrinsics.checkNotNullParameter(historyItem, "historyItem");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f276015c = historyItem;
        this.d = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f276015c, lVar.f276015c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276015c.hashCode() * 31);
    }
}
