package toh;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import th9.t;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f273218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f273219b;

    public g(gte.a featureToggleInteractor, o screenerStatsGroupsProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(screenerStatsGroupsProvider, "screenerStatsGroupsProvider");
        this.f273218a = featureToggleInteractor;
        this.f273219b = w.y0(new t(this, 9));
    }

    public final ArrayList a(zel.f group) {
        Intrinsics.checkNotNullParameter(group, "group");
        List listB = b(group);
        List listA = o.a(group);
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((ScreenerStatsGroup) it8.next()));
        }
        return d0.E0(zhm.w.u(arrayList), listB);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    public final List b(zel.f screenerInstrumentGroup) {
        Intrinsics.checkNotNullParameter(screenerInstrumentGroup, "screenerInstrumentGroup");
        int i = f.f273217a[screenerInstrumentGroup.ordinal()];
        if (i == 1) {
            return ((Boolean) this.f273219b.getValue()).booleanValue() ? v.k(zel.g.INVESTMENT_SUGGESTION, zel.g.TOTAL_EXPECTED_RETURN, zel.g.COUNTRY, zel.g.MARKET_CAP, zel.g.SECTOR) : v.k(zel.g.ANALYST_RATING, zel.g.COUNTRY, zel.g.MARKET_CAP, zel.g.SECTOR);
        }
        if (i == 2) {
            return v.k(zel.g.UNDERLYING_ASSET_TYPE, zel.g.AUM, zel.g.ANNUALIZED_RETURN_5Y, zel.g.CURRENCY, zel.g.EXPENSE_RATIO, zel.g.EXPOSURE_GEO, zel.g.DIVIDEND_TYPE, zel.g.THEME, zel.g.LEVERAGE_TYPE, zel.g.COMMISSION_FREE, zel.g.ISSUER);
        }
        if (i == 3) {
            return v.k(zel.g.ISSUER_TYPE, zel.g.RATING, zel.g.ISSUER_COUNTRY, zel.g.YTM, zel.g.REMAINING_YEARS, zel.g.MATURITY_TYPE, zel.g.COUPON_RATE, zel.g.COUPON_TYPE);
        }
        if (i == 4) {
            return v.k(zel.g.UNDERLYING_ASSET_TYPE, zel.g.VOLATILITY_1D, zel.g.PRICE_CHANGE_52W_HIGH, zel.g.PRICE_CHANGE_52W_LOW, zel.g.PRICE_CHANGE_1H, zel.g.PRICE_CHANGE_4H, zel.g.PRICE_CHANGE_1D, zel.g.PRICE_CHANGE_1W);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, kotlin.Lazy] */
    public final List c(ScreenerStatsGroup statsGroup) {
        Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
        if (statsGroup == ScreenerStatsGroup.Stocks.VALUATION) {
            return v.k(zel.g.PRICE_EARNINGS_RATIO, zel.g.PRICE_EARNINGS_GROWTH_RATIO, zel.g.ENTERPRISE_VALUE, zel.g.PRICE_SALES_RATIO, zel.g.EVS_RATIO, zel.g.PRICE_BOOK_RATIO, zel.g.PRICE_CASH_FLOW_RATIO);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.GROWTH) {
            return v.k(zel.g.REVENUE_GROWTH_1Y, zel.g.EPS_GROWTH_1Y, zel.g.REVENUE_GROWTH_3Y, zel.g.EPS_GROWTH_3Y);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.PROFITABILITY) {
            return v.k(zel.g.OPERATING_PROFIT_MARGIN, zel.g.NET_PROFIT_MARGIN, zel.g.ROE);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.DIVIDEND_INFORMATION) {
            return v.k(zel.g.DIVIDEND_YIELD, zel.g.DIVIDEND_FREQUENCY);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.LIQUIDITY) {
            return u.c(zel.g.AVERAGE_VOLUME);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.ANALYST_METRICS) {
            return ((Boolean) this.f273219b.getValue()).booleanValue() ? v.k(zel.g.ANALYST_RATING, zel.g.TARGET_PRICE_DISTANCE) : u.c(zel.g.TARGET_PRICE_DISTANCE);
        }
        if (statsGroup == ScreenerStatsGroup.Stocks.TECHNICAL_METRICS) {
            return v.k(zel.g.PRICE_CHANGE_1Y, zel.g.PRICE_CHANGE_52W_HIGH, zel.g.PRICE_CHANGE_52W_LOW, zel.g.SHARPE_RATIO);
        }
        if (statsGroup == ScreenerStatsGroup.ETP.PERFORMANCE) {
            return v.k(zel.g.ANNUALIZED_RETURN_1Y, zel.g.ANNUALIZED_RETURN_3Y);
        }
        if (statsGroup == ScreenerStatsGroup.ETP.DIVIDEND_INFO) {
            return v.k(zel.g.DIVIDEND_YIELD, zel.g.DIVIDEND_FREQUENCY);
        }
        if (statsGroup == ScreenerStatsGroup.ETP.TECHNICAL_METRICS) {
            return v.k(zel.g.STANDARD_DEVIATION, zel.g.TRACKING_ERROR, zel.g.BETA_1Y, zel.g.BETA_3Y, zel.g.BETA_5Y);
        }
        if (statsGroup == ScreenerStatsGroup.CFD.PRICE_MOVEMENTS) {
            return v.k(zel.g.PRICE_CHANGE_1H, zel.g.PRICE_CHANGE_4H, zel.g.PRICE_CHANGE_1D, zel.g.PRICE_CHANGE_1W);
        }
        throw new NoWhenBranchMatchedException();
    }
}
