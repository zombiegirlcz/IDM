package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218856c;
    public TransferReasonsSearchScreenContract$InputData d;
    public Flow e;
    public final Object f;

    public /* synthetic */ s(b bVar, Object obj2, int i) {
        this.f218854a = i;
        this.f218855b = bVar;
        this.f = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218854a) {
            case 0:
                this.f218856c = viewController;
                break;
            default:
                this.f218856c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218854a) {
            case 0:
                vc.s.h(this.f218856c, ViewController.class);
                vc.s.h(this.d, TransferReasonsSearchScreenContract$InputData.class);
                vc.s.h(this.e, Flow.class);
                return new t(this.f218855b, (f) this.f, this.d, this.e);
            default:
                vc.s.h(this.f218856c, ViewController.class);
                vc.s.h(this.d, TransferReasonsSearchScreenContract$InputData.class);
                vc.s.h(this.e, Flow.class);
                return new t(this.f218855b, (d) this.f, this.d, this.e);
        }
    }
}
