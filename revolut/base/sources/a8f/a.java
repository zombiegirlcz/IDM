package a8f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetricValue;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2191a;

    public a(b portfolioInsightItemMapper) {
        Intrinsics.checkNotNullParameter(portfolioInsightItemMapper, "portfolioInsightItemMapper");
        this.f2191a = portfolioInsightItemMapper;
    }

    @Override // a8f.c
    public final TextLocalisedClause r() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_max_drawdown_title, null, null, 14);
    }

    @Override // a8f.c
    public final List s(PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        PortfolioInsightPerformanceMetric.MaxDrawdown item = (PortfolioInsightPerformanceMetric.MaxDrawdown) portfolioInsightPerformanceMetric;
        Intrinsics.checkNotNullParameter(item, "item");
        PortfolioInsightPerformanceMetricValue.Percentage percentage = new PortfolioInsightPerformanceMetricValue.Percentage(item.f91402a);
        int i = R$string.wealth_robo_insights_description_max_drawdown_maximum_drawdown_title;
        int i2 = R$string.wealth_robo_insights_description_max_drawdown_maximum_drawdown_subtitle;
        b bVar = this.f2191a;
        List listA = bVar.a(percentage, i, i2);
        Integer num = item.e;
        List listA2 = num != null ? bVar.a(new PortfolioInsightPerformanceMetricValue.RecoveryPeriodMonths(num.intValue()), R$string.wealth_robo_insights_description_max_drawdown_recovery_period_title, R$string.wealth_robo_insights_description_max_drawdown_recovery_period_subtitle) : null;
        List listA3 = bVar.a(new PortfolioInsightPerformanceMetricValue.Percentage(item.f91403b), R$string.wealth_robo_insights_description_max_drawdown_average_drawdown_title, R$string.wealth_robo_insights_description_max_drawdown_average_drawdown_subtitle);
        BigDecimal bigDecimal = item.f91404c;
        List[] elements = {listA, listA2, listA3, bigDecimal != null ? bVar.a(new PortfolioInsightPerformanceMetricValue.Ratio(bigDecimal), R$string.wealth_robo_insights_description_max_drawdown_beta_title, R$string.wealth_robo_insights_description_max_drawdown_beta_subtitle) : null, bVar.a(new PortfolioInsightPerformanceMetricValue.Percentage(item.d), R$string.wealth_robo_insights_description_max_drawdown_var_title, R$string.wealth_robo_insights_description_max_drawdown_var_subtitle)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w.u(kotlin.collections.d.L(elements));
    }

    @Override // a8f.c
    public final TextLocalisedClause t() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_max_drawdown_subtitle, null, null, 14);
    }
}
