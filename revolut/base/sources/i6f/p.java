package i6f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import i6f.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements b7f.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate f158955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f158956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioDetailsController f158957c;

    public p(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.f158957c = managedPortfolioDetailsController;
        this.f158955a = managedPortfolioDetailsController.g0;
        this.f158956b = managedPortfolioDetailsController.f91266e0;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f158956b.f52371h.f121375b);
    }

    @Override // b7f.f
    public final void N(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f158957c.c3(v.a.f158985a);
    }

    @Override // b7f.f
    public final SmallActionButtonDelegate q() {
        return this.f158955a;
    }
}
