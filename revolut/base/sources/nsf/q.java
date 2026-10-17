package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218849c;
    public TransferReasonsScreenContract$InputData d;
    public Flow e;
    public Flow f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f218850g;

    public /* synthetic */ q(b bVar, Object obj2, int i) {
        this.f218847a = i;
        this.f218848b = bVar;
        this.f218850g = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218847a) {
            case 0:
                this.f218849c = viewController;
                break;
            default:
                this.f218849c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218847a) {
            case 0:
                vc.s.h(this.f218849c, ViewController.class);
                vc.s.h(this.d, TransferReasonsScreenContract$InputData.class);
                vc.s.h(this.e, Flow.class);
                vc.s.h(this.f, Flow.class);
                return new r(this.f218848b, (f) this.f218850g, this.d, this.e, this.f);
            default:
                vc.s.h(this.f218849c, ViewController.class);
                vc.s.h(this.d, TransferReasonsScreenContract$InputData.class);
                vc.s.h(this.e, Flow.class);
                vc.s.h(this.f, Flow.class);
                return new r(this.f218848b, (d) this.f218850g, this.d, this.e, this.f);
        }
    }
}
