package us6;

import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f282480c;
    public InvoicePaymentMethodsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ c3(g2 g2Var, Object obj2, int i) {
        this.f282478a = i;
        this.f282479b = g2Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f282478a) {
            case 0:
                this.f282480c = viewController;
                break;
            default:
                this.f282480c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f282478a) {
            case 0:
                vc.s.h(this.f282480c, ViewController.class);
                vc.s.h(this.d, InvoicePaymentMethodsScreenContract$InputData.class);
                return new d3(this.f282479b, (u2) this.e, this.d);
            default:
                vc.s.h(this.f282480c, ViewController.class);
                vc.s.h(this.d, InvoicePaymentMethodsScreenContract$InputData.class);
                return new d3(this.f282479b, (h2) this.e, this.d);
        }
    }
}
