package a8f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetricValue;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2193a;

    public d(b portfolioInsightItemMapper) {
        Intrinsics.checkNotNullParameter(portfolioInsightItemMapper, "portfolioInsightItemMapper");
        this.f2193a = portfolioInsightItemMapper;
    }

    @Override // a8f.c
    public final TextLocalisedClause r() {
        return new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_metrics_risk, null, null, 14);
    }

    @Override // a8f.c
    public final List s(PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        PortfolioInsightPerformanceMetric.RiskLevel item = (PortfolioInsightPerformanceMetric.RiskLevel) portfolioInsightPerformanceMetric;
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f2193a.a(new PortfolioInsightPerformanceMetricValue.RiskLevel(item.f91407a), com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_insights_risk_risk_level, com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_insights_description_risk_first_item_subtitle);
    }

    @Override // a8f.c
    public final TextLocalisedClause t() {
        return new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_insights_description_risk_subtitle, null, null, 14);
    }
}
