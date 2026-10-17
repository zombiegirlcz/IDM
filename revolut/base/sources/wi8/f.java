package wi8;

import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements fj8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f297853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f297854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f297855c;
    public JuniorPaymentLinkCustomAmountScreenContract$Input d;

    public f(e eVar, a aVar) {
        this.f297853a = eVar;
        this.f297854b = aVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f297855c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f297855c, ViewController.class);
        s.h(this.d, JuniorPaymentLinkCustomAmountScreenContract$Input.class);
        return new g(this.f297853a, this.f297854b, this.f297855c, this.d);
    }

    @Override // fj8.a
    public final fj8.a m(JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input) {
        juniorPaymentLinkCustomAmountScreenContract$Input.getClass();
        this.d = juniorPaymentLinkCustomAmountScreenContract$Input;
        return this;
    }
}
