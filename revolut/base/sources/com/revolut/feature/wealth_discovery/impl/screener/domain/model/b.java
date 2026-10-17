package com.revolut.feature.wealth_discovery.impl.screener.domain.model;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static int a(ScreenerStatsGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        if (group == ScreenerStatsGroup.Stocks.VALUATION) {
            return R$string.screener_section_stats_content_valuation_title;
        }
        if (group == ScreenerStatsGroup.Stocks.GROWTH) {
            return R$string.screener_section_stats_content_growth_title;
        }
        if (group == ScreenerStatsGroup.Stocks.PROFITABILITY) {
            return R$string.screener_section_stats_content_profitability_title;
        }
        if (group == ScreenerStatsGroup.Stocks.DIVIDEND_INFORMATION) {
            return R$string.screener_section_stats_content_dividend_information_title;
        }
        if (group == ScreenerStatsGroup.Stocks.LIQUIDITY) {
            return R$string.screener_section_stats_content_liquidity_title;
        }
        if (group == ScreenerStatsGroup.Stocks.ANALYST_METRICS) {
            return R$string.screener_section_stats_content_analyst_metrics_title;
        }
        if (group == ScreenerStatsGroup.Stocks.TECHNICAL_METRICS) {
            return R$string.screener_section_stats_content_technical_metrics_title;
        }
        if (group == ScreenerStatsGroup.ETP.PERFORMANCE) {
            return R$string.screener_section_stats_content_performance_title;
        }
        if (group == ScreenerStatsGroup.ETP.DIVIDEND_INFO) {
            return R$string.screener_section_stats_content_dividend_information_title;
        }
        if (group == ScreenerStatsGroup.ETP.TECHNICAL_METRICS) {
            return R$string.screener_section_stats_content_technical_metrics_title;
        }
        if (group == ScreenerStatsGroup.CFD.PRICE_MOVEMENTS) {
            return R$string.screener_section_stats_content_price_movements_title;
        }
        throw new NoWhenBranchMatchedException();
    }
}
