package p7c;

import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements yec.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f233746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShippingContactsScreenDescriptor$InputData f233747c;

    public y(r rVar) {
        this.f233745a = rVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233746b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233746b, ViewController.class);
        vc.s.h(this.f233747c, ShippingContactsScreenDescriptor$InputData.class);
        return new bac.g(this.f233745a, this.f233747c);
    }

    @Override // yec.c
    public final yec.c n(ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData) {
        shippingContactsScreenDescriptor$InputData.getClass();
        this.f233747c = shippingContactsScreenDescriptor$InputData;
        return this;
    }
}
