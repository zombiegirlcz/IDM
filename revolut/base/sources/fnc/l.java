package fnc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements mkd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f136639b;

    public /* synthetic */ l(ViewController viewController, int i) {
        this.f136638a = i;
        this.f136639b = viewController;
    }

    @Override // mkd.g
    public final efm.r F1() {
        switch (this.f136638a) {
            case 0:
                return ((PortfolioDetailsScreen) this.f136639b).j0.i;
            default:
                return ((ManagedPortfolioDetailsController) this.f136639b).l0.i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        switch (this.f136638a) {
            case 0:
                return ((dli.c) ((PortfolioDetailsScreen) this.f136639b).f85162k0.getValue()).w().f;
            default:
                return ((tki.b) ((tki.a) ((ManagedPortfolioDetailsController) this.f136639b).f91269n0.getValue())).f271959b.f.f;
        }
    }
}
