package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218831c;
    public TransferReasonsAmountAllocationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k(b bVar, Object obj2, int i) {
        this.f218829a = i;
        this.f218830b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218829a) {
            case 0:
                this.f218831c = viewController;
                break;
            default:
                this.f218831c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218829a) {
            case 0:
                vc.s.h(this.f218831c, ViewController.class);
                vc.s.h(this.d, TransferReasonsAmountAllocationScreenContract$InputData.class);
                return new l(this.f218830b, (f) this.e, this.d);
            default:
                vc.s.h(this.f218831c, ViewController.class);
                vc.s.h(this.d, TransferReasonsAmountAllocationScreenContract$InputData.class);
                return new l(this.f218830b, (d) this.e, this.d);
        }
    }
}
