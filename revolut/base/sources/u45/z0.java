package u45;

import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f277265c;
    public CreateMandateConfirmationControllerContract$InputData d;
    public final Object e;

    public /* synthetic */ z0(h hVar, Object obj2, int i) {
        this.f277263a = i;
        this.f277264b = hVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f277263a) {
            case 0:
                this.f277265c = viewController;
                break;
            default:
                this.f277265c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f277263a) {
            case 0:
                vc.s.h(this.f277265c, ViewController.class);
                vc.s.h(this.d, CreateMandateConfirmationControllerContract$InputData.class);
                return new a1(this.f277264b, (l0) this.e, this.d);
            default:
                vc.s.h(this.f277265c, ViewController.class);
                vc.s.h(this.d, CreateMandateConfirmationControllerContract$InputData.class);
                return new a1(this.f277264b, (w) this.e, this.d);
        }
    }
}
