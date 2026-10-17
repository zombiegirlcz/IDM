package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg.f f130184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioInsightsDashboardContract$InputData f130185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f130186c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130187g;

    public f(h hVar, k kVar, PortfolioInsightsDashboardContract$InputData portfolioInsightsDashboardContract$InputData, pyg.f fVar) {
        this.f130186c = hVar;
        this.f130184a = fVar;
        this.f130185b = portfolioInsightsDashboardContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new ea2.p(hVar, this, 2, i));
        this.e = e4m.b.b(new ea2.p(hVar, this, 1, i));
        this.f = e4m.b.b(new ea2.p(hVar, this, 0, i));
        this.f130187g = e4m.b.b(new ea2.p(hVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
