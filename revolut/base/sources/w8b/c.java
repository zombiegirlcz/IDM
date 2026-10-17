package w8b;

import c1b.d;
import c1b.h;
import com.revolut.feature.retail.advanced_charts.api.AdvancedChartsApi$Toggles;
import com.revolut.feature.retail.advanced_charts.api.navigation.AdvancedChartsConfig$Destination;
import com.revolut.feature.retail.crypto.advanced_charts.api.models.CryptoAdvancedChartSymbol;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qta.f;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f295638a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f295638a = featureToggleInteractor;
    }

    public final AdvancedChartsConfig$Destination.AdvancedCharts a(f plotDuration, xi0.b baseCurrency, xi0.b quoteCurrency) {
        h hVar;
        Intrinsics.checkNotNullParameter(plotDuration, "plotDuration");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        d dVar = ((jte.d) this.f295638a).c(AdvancedChartsApi$Toggles.TradingAdvancedChartsPersistentIndicators.f82057c) ? d.SUPPORTED_IN_FULLSCREEN_CHART : d.ONLY_STYLE;
        c1b.c cVar = c1b.c.CRYPTO;
        switch (b.f295637a[plotDuration.ordinal()]) {
            case 1:
                hVar = h.FIVE_MINUTES;
                break;
            case 2:
            case 3:
                hVar = h.ONE_HOUR;
                break;
            case 4:
            case 5:
            case 6:
                hVar = h.ONE_DAY;
                break;
            case 7:
            case 8:
                hVar = h.ONE_WEEK;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new AdvancedChartsConfig$Destination.AdvancedCharts(cVar, hVar, new CryptoAdvancedChartSymbol(baseCurrency, quoteCurrency), dVar);
    }
}
