package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements z7f.a, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightsFlowContract$InputData f295233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f295235c = this;
    public final e4m.e d = e4m.b.b(new vrg.a(this, 21));

    public s(m mVar, PortfolioInsightsFlowContract$InputData portfolioInsightsFlowContract$InputData) {
        this.f295234b = mVar;
        this.f295233a = portfolioInsightsFlowContract$InputData;
    }

    @Override // z7f.a
    public final d0 b() {
        return new d0(this.f295234b, this.f295235c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
