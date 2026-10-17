package bac;

import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import p7c.r;
import p7c.x;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements yec.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f14030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShippingContactsScreenDescriptor$InputData f14031c;
    public final Object d;
    public final Object e;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f14029a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f14029a) {
            case 0:
                this.f14030b = viewController;
                break;
            default:
                this.f14030b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f14029a) {
            case 0:
                s.h(this.f14030b, ViewController.class);
                s.h(this.f14031c, ShippingContactsScreenDescriptor$InputData.class);
                return new g((b) this.d, (c) this.e, this.f14031c);
            default:
                s.h(this.f14030b, ViewController.class);
                s.h(this.f14031c, ShippingContactsScreenDescriptor$InputData.class);
                return new g((r) this.d, (x) this.e, this.f14031c);
        }
    }

    @Override // yec.c
    public final yec.c n(ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData) {
        switch (this.f14029a) {
            case 0:
                shippingContactsScreenDescriptor$InputData.getClass();
                this.f14031c = shippingContactsScreenDescriptor$InputData;
                break;
            default:
                shippingContactsScreenDescriptor$InputData.getClass();
                this.f14031c = shippingContactsScreenDescriptor$InputData;
                break;
        }
        return this;
    }
}
