package a8f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetricValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2195a;

    public f(b portfolioInsightItemMapper) {
        Intrinsics.checkNotNullParameter(portfolioInsightItemMapper, "portfolioInsightItemMapper");
        this.f2195a = portfolioInsightItemMapper;
    }

    @Override // a8f.c
    public final TextLocalisedClause r() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_annual_return_title, null, null, 14);
    }

    @Override // a8f.c
    public final List s(PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        PortfolioInsightPerformanceMetric.AverageAnnualReturnBreakdown portfolioInsightPerformanceMetric2 = (PortfolioInsightPerformanceMetric.AverageAnnualReturnBreakdown) portfolioInsightPerformanceMetric;
        Intrinsics.checkNotNullParameter(portfolioInsightPerformanceMetric2, "portfolioInsightPerformanceMetric");
        PortfolioInsightPerformanceMetricValue.Percentage percentage = new PortfolioInsightPerformanceMetricValue.Percentage(portfolioInsightPerformanceMetric2.f91399a);
        int i = R$string.wealth_robo_insights_description_annual_return_average_title;
        int i2 = R$string.wealth_robo_insights_description_annual_return_average_subtitle;
        b bVar = this.f2195a;
        List listA = bVar.a(percentage, i, i2);
        List listA2 = bVar.a(new PortfolioInsightPerformanceMetricValue.Percentage(portfolioInsightPerformanceMetric2.f91400b), R$string.wealth_robo_insights_description_management_fee_title, R$string.wealth_robo_insights_description_management_fee_description);
        PortfolioInsightPerformanceMetric.ProductFeeRange productFeeRange = portfolioInsightPerformanceMetric2.f91401c;
        List[] elements = {listA, listA2, productFeeRange != null ? bVar.a(new PortfolioInsightPerformanceMetricValue.PercentageRange(productFeeRange.f91405a, productFeeRange.f91406b), R$string.wealth_robo_insights_description_product_fee_title, R$string.wealth_robo_insights_description_product_fee_description) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w.u(kotlin.collections.d.L(elements));
    }

    @Override // a8f.c
    public final TextLocalisedClause t() {
        return new TextLocalisedClause(R$string.wealth_robo_insights_description_annual_return_subtitle, null, null, 14);
    }
}
