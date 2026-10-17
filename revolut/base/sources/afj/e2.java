package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class e2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4225c;
    public EsimMobilePlanInvoicesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e2(b bVar, Object obj2, int i) {
        this.f4223a = i;
        this.f4224b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4223a) {
            case 0:
                this.f4225c = viewController;
                break;
            default:
                this.f4225c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4223a) {
            case 0:
                vc.s.h(this.f4225c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanInvoicesScreenContract$InputData.class);
                return new f2(this.f4224b, (q0) this.e, this.d);
            default:
                vc.s.h(this.f4225c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanInvoicesScreenContract$InputData.class);
                return new f2(this.f4224b, (m) this.e, this.d);
        }
    }
}
