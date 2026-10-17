package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218825c;
    public TransferReasonsAdditionalInfoScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i(b bVar, Object obj2, int i) {
        this.f218823a = i;
        this.f218824b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218823a) {
            case 0:
                this.f218825c = viewController;
                break;
            default:
                this.f218825c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218823a) {
            case 0:
                vc.s.h(this.f218825c, ViewController.class);
                vc.s.h(this.d, TransferReasonsAdditionalInfoScreenContract$InputData.class);
                return new j(this.f218824b, (f) this.e, this.d);
            default:
                vc.s.h(this.f218825c, ViewController.class);
                vc.s.h(this.d, TransferReasonsAdditionalInfoScreenContract$InputData.class);
                return new j(this.f218824b, (d) this.e, this.d);
        }
    }
}
