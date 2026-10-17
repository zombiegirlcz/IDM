package a8f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetricValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2194a;

    public e(b portfolioInsightItemMapper) {
        Intrinsics.checkNotNullParameter(portfolioInsightItemMapper, "portfolioInsightItemMapper");
        this.f2194a = portfolioInsightItemMapper;
    }

    @Override // a8f.c
    public final TextLocalisedClause r() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_sharpe_ratio_title, null, null, 14);
    }

    @Override // a8f.c
    public final List s(PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        PortfolioInsightPerformanceMetric.SharpeRatio item = (PortfolioInsightPerformanceMetric.SharpeRatio) portfolioInsightPerformanceMetric;
        Intrinsics.checkNotNullParameter(item, "item");
        PortfolioInsightPerformanceMetricValue.Ratio ratio = new PortfolioInsightPerformanceMetricValue.Ratio(item.f91408a);
        int i = R$string.wealth_robo_insights_description_sharpe_ratio_sharpe_ratio_title;
        int i2 = R$string.wealth_robo_insights_description_sharpe_ratio_sharpe_ratio_subtitle;
        b bVar = this.f2194a;
        List[] elements = {bVar.a(ratio, i, i2), bVar.a(new PortfolioInsightPerformanceMetricValue.Percentage(item.f91409b), R$string.wealth_robo_insights_description_sharpe_ratio_risk_free_title, R$string.wealth_robo_insights_description_sharpe_ratio_risk_free_subtitle), bVar.a(new PortfolioInsightPerformanceMetricValue.Percentage(item.f91410c), R$string.wealth_robo_insights_description_sharpe_ratio_volatility_title, R$string.wealth_robo_insights_description_sharpe_ratio_volatility_subtitle)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w.u(kotlin.collections.d.L(elements));
    }

    @Override // a8f.c
    public final TextLocalisedClause t() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_sharpe_ratio_subtitle, null, null, 14);
    }
}
