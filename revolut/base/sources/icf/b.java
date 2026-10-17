package icf;

import a83.j0;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import kotlin.jvm.internal.Intrinsics;
import mbf.c;
import rd0.e;
import xbf.g;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends ncf.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ncf.a f160264l;

    public b(ncf.a screen, c tradingProUpsellingBannerProvider, g tradingProUpsellingNavigationProvider) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(tradingProUpsellingBannerProvider, "tradingProUpsellingBannerProvider");
        Intrinsics.checkNotNullParameter(tradingProUpsellingNavigationProvider, "tradingProUpsellingNavigationProvider");
        this.f160264l = screen;
    }

    @Override // yji.n
    public final void H2() {
        TabInvestController tabInvestController = (TabInvestController) this.f160264l;
        n.l2(this, new j0(new bk6.c(e.b(tabInvestController.X.f51699c), 4), 9), null, new a(this, null, 0), 3);
        n.l2(this, new j0(new bk6.c(e.b(tabInvestController.X.e), 5), 10), null, new a(this, null, 1), 3);
    }
}
