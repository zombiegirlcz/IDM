package i6f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements r6f.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f158925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f158926b;

    public f(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.f158925a = managedPortfolioDetailsController.f91266e0;
        this.f158926b = managedPortfolioDetailsController.Q;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f158925a.f52371h.f121375b);
    }

    @Override // r6f.h
    public final ListSubheaderDelegate j0() {
        return this.f158926b;
    }
}
