package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements z7f.a, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRevealFlowContract$InputData f295241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f295243c = this;
    public final e4m.e d;

    public u(m mVar, PortfolioRevealFlowContract$InputData portfolioRevealFlowContract$InputData) {
        this.f295242b = mVar;
        this.f295241a = portfolioRevealFlowContract$InputData;
        this.d = e4m.b.b(new vtc.n(mVar, this, 20));
    }

    @Override // z7f.a
    public final d0 b() {
        return new d0(this.f295242b, this.f295243c, 0);
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
