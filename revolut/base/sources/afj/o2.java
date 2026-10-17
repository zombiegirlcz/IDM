package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class o2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4377c;
    public EsimMobilePlanSummaryScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o2(b bVar, Object obj2, int i) {
        this.f4375a = i;
        this.f4376b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4375a) {
            case 0:
                this.f4377c = viewController;
                break;
            case 1:
                this.f4377c = viewController;
                break;
            default:
                this.f4377c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4375a) {
            case 0:
                vc.s.h(this.f4377c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanSummaryScreenContract$InputData.class);
                return new q2(this.f4376b, (j) this.e, this.d);
            case 1:
                vc.s.h(this.f4377c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanSummaryScreenContract$InputData.class);
                return new q2(this.f4376b, (q) this.e, this.d);
            default:
                vc.s.h(this.f4377c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanSummaryScreenContract$InputData.class);
                return new q2(this.f4376b, (m) this.e, this.d);
        }
    }
}
