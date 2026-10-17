package us6;

import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f282452c;
    public InvoiceEmailMessageScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a3(g2 g2Var, Object obj2, int i) {
        this.f282450a = i;
        this.f282451b = g2Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f282450a) {
            case 0:
                this.f282452c = viewController;
                break;
            default:
                this.f282452c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f282450a) {
            case 0:
                vc.s.h(this.f282452c, ViewController.class);
                vc.s.h(this.d, InvoiceEmailMessageScreenContract$InputData.class);
                return new b3(this.f282451b, (u2) this.e, this.d);
            default:
                vc.s.h(this.f282452c, ViewController.class);
                vc.s.h(this.d, InvoiceEmailMessageScreenContract$InputData.class);
                return new b3(this.f282451b, (h2) this.e, this.d);
        }
    }
}
