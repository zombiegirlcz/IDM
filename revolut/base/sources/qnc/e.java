package qnc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements c {
    @Override // jki.p
    public final m a(i iVar) {
        RowDelegate.Model model;
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<yoc.f> list = domainState.f247933a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (yoc.f riskMetricsField : list) {
            Intrinsics.checkNotNullParameter(riskMetricsField, "riskMetricsField");
            switch (rnc.a.f255589a[riskMetricsField.ordinal()]) {
                case 1:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_average_annual_return, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_average_annual_return_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 2:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_median_return, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_median_return_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 3:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_best_year_return, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_best_year_return_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 4:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_max_drawdown, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_max_drawdown_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 5:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_average_drawdown, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_average_drawdown_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 6:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_beta, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_beta_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 7:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_standard_deviation, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_standard_deviation_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 8:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_sharpe_ratio, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_sharpe_ratio_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 9:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_value_at_risk_expanded, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_value_at_risk_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 10:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_dividend_yield, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_dividend_yield_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                case 11:
                    model = new RowDelegate.Model("ROW_" + riskMetricsField, null, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_cagr_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_cagr_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new d(arrayList);
    }
}
