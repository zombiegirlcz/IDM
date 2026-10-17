package n8f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements r6f.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f213365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f213366b;

    public d(StrategyOverviewScreen strategyOverviewScreen) {
        this.f213365a = strategyOverviewScreen.f91486d0;
        this.f213366b = strategyOverviewScreen.O;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f213365a.f52371h.f121375b);
    }

    @Override // r6f.h
    public final ListSubheaderDelegate j0() {
        return this.f213366b;
    }
}
