package u01;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartSymbol f276009c;
    public final c1b.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdvancedChartSymbol symbol, c1b.f chartHandlerVersion) {
        super("symbolNameResolved", 8);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        this.f276009c = symbol;
        this.d = chartHandlerVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f276009c, fVar.f276009c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f276009c.hashCode() * 31);
    }
}
