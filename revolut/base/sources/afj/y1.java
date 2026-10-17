package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class y1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4540c;
    public EsimMobilePlanDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y1(b bVar, Object obj2, int i) {
        this.f4538a = i;
        this.f4539b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4538a) {
            case 0:
                this.f4540c = viewController;
                break;
            case 1:
                this.f4540c = viewController;
                break;
            default:
                this.f4540c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4538a) {
            case 0:
                vc.s.h(this.f4540c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanDetailsScreenContract$InputData.class);
                return new z1(this.f4539b, (x0) this.e, this.d);
            case 1:
                vc.s.h(this.f4540c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanDetailsScreenContract$InputData.class);
                return new z1(this.f4539b, (q0) this.e, this.d);
            default:
                vc.s.h(this.f4540c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanDetailsScreenContract$InputData.class);
                return new z1(this.f4539b, (m) this.e, this.d);
        }
    }
}
