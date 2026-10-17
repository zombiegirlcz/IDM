package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4314c;
    public EsimGetPlanScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k1(b bVar, Object obj2, int i) {
        this.f4312a = i;
        this.f4313b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4312a) {
            case 0:
                this.f4314c = viewController;
                break;
            default:
                this.f4314c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4312a) {
            case 0:
                vc.s.h(this.f4314c, ViewController.class);
                vc.s.h(this.d, EsimGetPlanScreenContract$InputData.class);
                return new l1(this.f4313b, (j) this.e, this.d);
            default:
                vc.s.h(this.f4314c, ViewController.class);
                vc.s.h(this.d, EsimGetPlanScreenContract$InputData.class);
                return new l1(this.f4313b, (m) this.e, this.d);
        }
    }
}
