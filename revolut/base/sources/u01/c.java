package u01;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276006c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List historyItems, String symbol) {
        super("receiveBars", 8);
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f276006c = historyItems;
        this.d = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f276006c, cVar.f276006c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276006c.hashCode() * 31);
    }
}
