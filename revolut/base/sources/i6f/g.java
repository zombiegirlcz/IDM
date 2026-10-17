package i6f;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements v6f.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate f158929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioDetailsController f158930b;

    public g(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.f158930b = managedPortfolioDetailsController;
        this.f158929a = managedPortfolioDetailsController.S;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f158930b.f91266e0.f52371h.f121375b);
    }

    @Override // v6f.h
    public final CellDetailsDelegate j() {
        return this.f158929a;
    }
}
