package n8f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f213362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabsDelegate f213363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDelegate f213364c;
    public final /* synthetic */ StrategyOverviewScreen d;

    public b(StrategyOverviewScreen strategyOverviewScreen) {
        this.d = strategyOverviewScreen;
        this.f213362a = strategyOverviewScreen.M;
        this.f213363b = strategyOverviewScreen.W;
        this.f213364c = strategyOverviewScreen.X;
    }

    @Override // j6f.d
    public final TextDelegate A() {
        return this.f213364c;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.d.f91486d0.f52371h.f121375b);
    }

    @Override // j6f.d
    public final RowDelegate c() {
        return this.f213362a;
    }

    @Override // j6f.d
    public final FixedTabsDelegate p() {
        return this.f213363b;
    }
}
