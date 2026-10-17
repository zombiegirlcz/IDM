package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class i8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118990c;
    public CreditPdfDocumentControllerContract$InputData d;
    public final Object e;

    public /* synthetic */ i8(c1 c1Var, Object obj2, int i) {
        this.f118988a = i;
        this.f118989b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118988a) {
            case 0:
                this.f118990c = viewController;
                break;
            case 1:
                this.f118990c = viewController;
                break;
            default:
                this.f118990c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118988a) {
            case 0:
                vc.s.h(this.f118990c, ViewController.class);
                vc.s.h(this.d, CreditPdfDocumentControllerContract$InputData.class);
                return new j8(this.f118989b, (e1) this.e, this.f118990c, this.d);
            case 1:
                vc.s.h(this.f118990c, ViewController.class);
                vc.s.h(this.d, CreditPdfDocumentControllerContract$InputData.class);
                return new j8(this.f118989b, (f4) this.e, this.f118990c, this.d);
            default:
                vc.s.h(this.f118990c, ViewController.class);
                vc.s.h(this.d, CreditPdfDocumentControllerContract$InputData.class);
                return new j8(this.f118989b, (h4) this.e, this.f118990c, this.d);
        }
    }
}
