package i6f;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements t6f.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsChevronDelegate f158911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f158912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlainTextDelegate f158913c;
    public final SmallActionButtonDelegate d;
    public final /* synthetic */ ManagedPortfolioDetailsController e;

    public b(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.e = managedPortfolioDetailsController;
        this.f158911a = managedPortfolioDetailsController.V;
        this.f158912b = managedPortfolioDetailsController.f91266e0;
        this.f158913c = managedPortfolioDetailsController.U;
        this.d = managedPortfolioDetailsController.g0;
    }

    @Override // t6f.l
    public final CellDetailsChevronDelegate D() {
        return this.f158911a;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f158912b.f52371h.f121375b);
    }

    @Override // t6f.l
    public final PlainTextDelegate M() {
        return this.f158913c;
    }

    @Override // t6f.l
    public final void V1(String investorUpdateId) {
        Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
        this.e.c3(new w(investorUpdateId));
    }

    @Override // t6f.l
    public final SmallActionButtonDelegate q() {
        return this.d;
    }
}
