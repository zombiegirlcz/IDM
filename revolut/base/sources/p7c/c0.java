package p7c;

import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements hdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f233591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AddPaymentMethodControllerDescriptor$InputData f233592c;

    public c0(r rVar) {
        this.f233590a = rVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233591b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233591b, ViewController.class);
        vc.s.h(this.f233592c, AddPaymentMethodControllerDescriptor$InputData.class);
        return new a0(this.f233590a, this.f233592c);
    }

    @Override // hdc.a
    public final hdc.a o0(AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData) {
        addPaymentMethodControllerDescriptor$InputData.getClass();
        this.f233592c = addPaymentMethodControllerDescriptor$InputData;
        return this;
    }
}
