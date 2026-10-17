package g7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import g06.k;
import i6f.q;
import i6f.t0;
import i6f.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends t0 {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f141196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f141197h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v7f.c view, v7f.e model) {
        super(view, model, "DrawdownControllerExtensionContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f141196g = view;
        this.f141197h = model;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        switch (this.f) {
            case 0:
                super.M();
                yji.d.H(this, new fo6.d(rd0.e.b(((q) ((f) this.f141196g)).f158958a.d), 26), new k(this, null, 24), 3);
                break;
            case 1:
                super.M();
                o6f.d dVar = (o6f.d) this.f141196g;
                yji.d.H(this, rd0.e.b(dVar.p().f52339c.f121375b), new nwc.f(this, null, 25), 3);
                yji.d.H(this, rd0.e.b(dVar.L().r()), new o6f.e(this, null), 3);
                break;
            default:
                super.M();
                PortfolioInsightsScreen portfolioInsightsScreen = (PortfolioInsightsScreen) ((v7f.c) this.f141196g);
                yji.d.H(this, rd0.e.b(portfolioInsightsScreen.L.f52339c.f121375b), new v44.e(this, null, 9), 3);
                yji.d.H(this, rd0.e.b(portfolioInsightsScreen.N.d), new uwe.f(this, null, 11), 3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o6f.d view, o6f.b model) {
        super(view, model, "ManagedPortfolioDetailsChartContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f141196g = view;
        this.f141197h = model;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f view, h model) {
        super(view, model, "ManagedPortfolioReferenceExtensionContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f141196g = view;
        this.f141197h = model;
    }
}
