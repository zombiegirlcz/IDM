package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightsAssetIndicatorControllerContract$InputData f130181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f130182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130183c;
    public final e4m.e d;

    public e(h hVar, k kVar, PortfolioInsightsAssetIndicatorControllerContract$InputData portfolioInsightsAssetIndicatorControllerContract$InputData) {
        this.f130182b = hVar;
        this.f130181a = portfolioInsightsAssetIndicatorControllerContract$InputData;
        this.f130183c = e4m.b.b(new ehe.o(hVar, kVar, this, 1, 4));
        this.d = e4m.b.b(new ehe.o(hVar, kVar, this, 0, 4));
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
