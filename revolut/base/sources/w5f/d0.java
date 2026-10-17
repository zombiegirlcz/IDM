package w5f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f295132c;
    public PortfolioInsightsPerformanceControllerContract$InputData d;
    public final Object e;

    public /* synthetic */ d0(m mVar, Object obj2, int i) {
        this.f295130a = i;
        this.f295131b = mVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f295130a) {
            case 0:
                this.f295132c = viewController;
                break;
            default:
                this.f295132c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f295130a) {
            case 0:
                vc.s.h(this.f295132c, ViewController.class);
                vc.s.h(this.d, PortfolioInsightsPerformanceControllerContract$InputData.class);
                return new e0(this.f295131b, (u) this.e, this.d);
            default:
                vc.s.h(this.f295132c, ViewController.class);
                vc.s.h(this.d, PortfolioInsightsPerformanceControllerContract$InputData.class);
                return new e0(this.f295131b, (s) this.e, this.d);
        }
    }
}
