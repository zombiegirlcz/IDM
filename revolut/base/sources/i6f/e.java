package i6f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements o6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedTabsDelegate f158919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrendViewDelegate f158920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FullScreenStateDelegate f158921c;

    public e(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.f158919a = managedPortfolioDetailsController.W;
        this.f158920b = managedPortfolioDetailsController.Y;
        this.f158921c = managedPortfolioDetailsController.f91266e0;
    }

    @Override // o6f.d
    public final TrendViewDelegate L() {
        return this.f158920b;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f158921c.f52371h.f121375b);
    }

    @Override // o6f.d
    public final FixedTabsDelegate p() {
        return this.f158919a;
    }
}
