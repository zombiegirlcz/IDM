package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4289c;
    public EsimMobilePlanPaymentsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i2(b bVar, Object obj2, int i) {
        this.f4287a = i;
        this.f4288b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4287a) {
            case 0:
                this.f4289c = viewController;
                break;
            default:
                this.f4289c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4287a) {
            case 0:
                vc.s.h(this.f4289c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanPaymentsScreenContract$InputData.class);
                return new j2(this.f4288b, (q0) this.e, this.d);
            default:
                vc.s.h(this.f4289c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanPaymentsScreenContract$InputData.class);
                return new j2(this.f4288b, (m) this.e, this.d);
        }
    }
}
