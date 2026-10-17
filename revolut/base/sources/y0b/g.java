package y0b;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1b.c f310177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1b.h f310178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartSymbol f310179c;
    public final c1b.d d;
    public final ChartTimeFrameDisplayType e;

    public g(c1b.c advancedChartsProductIdentifier, c1b.h chartInterval, AdvancedChartSymbol chartSymbol, c1b.d persistenceMode, ChartTimeFrameDisplayType chartTimeFrameDisplayType) {
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(persistenceMode, "persistenceMode");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        this.f310177a = advancedChartsProductIdentifier;
        this.f310178b = chartInterval;
        this.f310179c = chartSymbol;
        this.d = persistenceMode;
        this.e = chartTimeFrameDisplayType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f310177a == gVar.f310177a && this.f310178b == gVar.f310178b && Intrinsics.f(this.f310179c, gVar.f310179c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f310179c.hashCode() + ((this.f310178b.hashCode() + (this.f310177a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
