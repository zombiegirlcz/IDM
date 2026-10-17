package wi8;

import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements fj8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f297861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f297862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JuniorPaymentLinkCustomAmountScreenContract$Input f297863c;

    public h(e eVar) {
        this.f297861a = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f297862b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f297862b, ViewController.class);
        s.h(this.f297863c, JuniorPaymentLinkCustomAmountScreenContract$Input.class);
        return new g(this.f297861a, this.f297862b, this.f297863c);
    }

    @Override // fj8.a
    public final fj8.a m(JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input) {
        juniorPaymentLinkCustomAmountScreenContract$Input.getClass();
        this.f297863c = juniorPaymentLinkCustomAmountScreenContract$Input;
        return this;
    }
}
