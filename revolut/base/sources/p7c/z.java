package p7c;

import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements hdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f233749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233750c;
    public AddPaymentMethodControllerDescriptor$InputData d;
    public final Object e;

    public /* synthetic */ z(r rVar, Object obj2, int i) {
        this.f233748a = i;
        this.f233749b = rVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f233748a) {
            case 0:
                this.f233750c = viewController;
                break;
            default:
                this.f233750c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f233748a) {
            case 0:
                vc.s.h(this.f233750c, ViewController.class);
                vc.s.h(this.d, AddPaymentMethodControllerDescriptor$InputData.class);
                return new a0(this.f233749b, (x) this.e, this.d);
            default:
                vc.s.h(this.f233750c, ViewController.class);
                vc.s.h(this.d, AddPaymentMethodControllerDescriptor$InputData.class);
                return new b0(this.f233749b, (j) this.e, this.d);
        }
    }

    @Override // hdc.a
    public final hdc.a o0(AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData) {
        switch (this.f233748a) {
            case 0:
                addPaymentMethodControllerDescriptor$InputData.getClass();
                this.d = addPaymentMethodControllerDescriptor$InputData;
                break;
            default:
                addPaymentMethodControllerDescriptor$InputData.getClass();
                this.d = addPaymentMethodControllerDescriptor$InputData;
                break;
        }
        return this;
    }
}
