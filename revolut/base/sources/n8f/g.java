package n8f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;
import kotlin.jvm.internal.Intrinsics;
import n8f.i;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements b7f.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate f213367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f213368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StrategyOverviewScreen f213369c;

    public g(StrategyOverviewScreen strategyOverviewScreen) {
        this.f213369c = strategyOverviewScreen;
        this.f213367a = strategyOverviewScreen.U;
        this.f213368b = strategyOverviewScreen.f91486d0;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f213368b.f52371h.f121375b);
    }

    @Override // b7f.f
    public final void N(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f213369c.c3(i.b.f213374a);
    }

    @Override // b7f.f
    public final SmallActionButtonDelegate q() {
        return this.f213367a;
    }
}
