package y7f;

import cli.j;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightPerformanceMetric f311507a;

    public c(PortfolioInsightPerformanceMetric portfolioInsightPerformanceMetric) {
        Intrinsics.checkNotNullParameter(portfolioInsightPerformanceMetric, "portfolioInsightPerformanceMetric");
        this.f311507a = portfolioInsightPerformanceMetric;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f311507a, ((c) obj2).f311507a);
    }

    public final int hashCode() {
        return this.f311507a.hashCode();
    }
}
