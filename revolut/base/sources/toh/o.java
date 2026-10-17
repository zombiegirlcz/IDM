package toh;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static List a(zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        int i = n.f273227a[instrumentGroup.ordinal()];
        if (i == 1) {
            return v.k(ScreenerStatsGroup.Stocks.VALUATION, ScreenerStatsGroup.Stocks.GROWTH, ScreenerStatsGroup.Stocks.PROFITABILITY, ScreenerStatsGroup.Stocks.DIVIDEND_INFORMATION, ScreenerStatsGroup.Stocks.LIQUIDITY, ScreenerStatsGroup.Stocks.ANALYST_METRICS, ScreenerStatsGroup.Stocks.TECHNICAL_METRICS);
        }
        if (i == 2) {
            return v.k(ScreenerStatsGroup.ETP.PERFORMANCE, ScreenerStatsGroup.ETP.DIVIDEND_INFO, ScreenerStatsGroup.ETP.TECHNICAL_METRICS);
        }
        if (i == 3 || i == 4) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
