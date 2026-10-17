package m3c;

import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f202356c;
    public OrderConfirmationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k(j jVar, Object obj2, int i) {
        this.f202354a = i;
        this.f202355b = jVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f202354a) {
            case 0:
                this.f202356c = viewController;
                break;
            default:
                this.f202356c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f202354a) {
            case 0:
                s.h(this.f202356c, ViewController.class);
                s.h(this.d, OrderConfirmationScreenContract$InputData.class);
                return new l(this.f202355b, (g) this.e, this.f202356c, this.d);
            default:
                s.h(this.f202356c, ViewController.class);
                s.h(this.d, OrderConfirmationScreenContract$InputData.class);
                return new l(this.f202355b, (e) this.e, this.f202356c, this.d);
        }
    }
}
