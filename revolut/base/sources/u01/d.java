package u01;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276007c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List historyItems, String symbol) {
        super("receiveLatestBars", 8);
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f276007c = historyItems;
        this.d = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f276007c, dVar.f276007c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276007c.hashCode() * 31);
    }
}
