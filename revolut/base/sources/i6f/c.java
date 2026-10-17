package i6f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f158915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabsDelegate f158916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDelegate f158917c;
    public final /* synthetic */ ManagedPortfolioDetailsController d;

    public c(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.d = managedPortfolioDetailsController;
        this.f158915a = managedPortfolioDetailsController.O;
        this.f158916b = managedPortfolioDetailsController.W;
        this.f158917c = managedPortfolioDetailsController.X;
    }

    @Override // j6f.d
    public final TextDelegate A() {
        return this.f158917c;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.d.f91266e0.f52371h.f121375b);
    }

    @Override // j6f.d
    public final RowDelegate c() {
        return this.f158915a;
    }

    @Override // j6f.d
    public final FixedTabsDelegate p() {
        return this.f158916b;
    }
}
