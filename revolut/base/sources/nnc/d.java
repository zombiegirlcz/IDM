package nnc;

import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yoc.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static a a(RiskMetrics riskMetrics, f riskMetricsField) {
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        Intrinsics.checkNotNullParameter(riskMetricsField, "riskMetricsField");
        switch (c.f217517a[riskMetricsField.ordinal()]) {
            case 1:
                return new a("AVERAGE_ANNUAL_RETURN", R$string.wealth_robo_porfolio_risk_metrics_average_annual_return, true, true, riskMetrics.f85030a);
            case 2:
                return new a("MEDIAN_RETURN", R$string.wealth_robo_porfolio_risk_metrics_median_return, true, true, riskMetrics.d);
            case 3:
                return new a("BEST_YEAR_RETURN", R$string.wealth_robo_porfolio_risk_metrics_best_year_return, true, true, riskMetrics.e);
            case 4:
                return new a("MAX_DRAWDOWN", R$string.wealth_robo_porfolio_risk_metrics_max_drawdown, true, false, riskMetrics.f);
            case 5:
                return new a("AVERAGE_DRAWDOWN", R$string.wealth_robo_porfolio_risk_metrics_average_drawdown, true, false, riskMetrics.f85033g);
            case 6:
                return new a("BETA", R$string.wealth_robo_porfolio_risk_metrics_beta, false, false, riskMetrics.f85034h);
            case 7:
                return new a("STANDARD_DEVIATION", R$string.wealth_robo_porfolio_risk_metrics_standard_deviation, true, false, riskMetrics.f85031b);
            case 8:
                return new a("SHARPE_RATIO", R$string.wealth_robo_porfolio_risk_metrics_sharpe_ratio, false, false, riskMetrics.i);
            case 9:
                return new a("VA_R", R$string.wealth_robo_porfolio_risk_metrics_value_at_risk_acronym, true, false, riskMetrics.f85035j);
            case 10:
                return new a("DIVIDEND_YIELD", R$string.wealth_robo_portfolio_risk_metrics_dividend_yield, true, true, riskMetrics.f85036l);
            case 11:
                return new a("CAGR", R$string.wealth_robo_portfolio_risk_metrics_cagr, true, true, riskMetrics.k);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
