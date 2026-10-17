package tz2;

import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;
import x13.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f275817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SetPinScreenContract$InputData f275818c;
    public final Object d;
    public final Object e;

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f275816a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f275816a) {
            case 0:
                this.f275817b = viewController;
                break;
            default:
                this.f275817b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f275816a) {
            case 0:
                s.h(this.f275817b, ViewController.class);
                s.h(this.f275818c, SetPinScreenContract$InputData.class);
                return new q((e) this.d, (k) this.e, this.f275817b, this.f275818c);
            default:
                s.h(this.f275817b, ViewController.class);
                s.h(this.f275818c, SetPinScreenContract$InputData.class);
                return new c0((x13.p) this.d, (x13.q) this.e, this.f275817b, this.f275818c);
        }
    }
}
