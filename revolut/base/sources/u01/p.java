package u01;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartSymbol f276019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AdvancedChartSymbol symbol) {
        super("updateSymbol", 8);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f276019c = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f276019c, ((p) obj2).f276019c);
    }

    public final int hashCode() {
        return this.f276019c.hashCode();
    }
}
