package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class e9 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118673c;
    public CreditToRefinanceSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e9(c1 c1Var, Object obj2, int i) {
        this.f118671a = i;
        this.f118672b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118671a) {
            case 0:
                this.f118673c = viewController;
                break;
            default:
                this.f118673c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118671a) {
            case 0:
                vc.s.h(this.f118673c, ViewController.class);
                vc.s.h(this.d, CreditToRefinanceSelectionScreenContract$InputData.class);
                return new f9(this.f118672b, (q4) this.e, this.f118673c, this.d);
            default:
                vc.s.h(this.f118673c, ViewController.class);
                vc.s.h(this.d, CreditToRefinanceSelectionScreenContract$InputData.class);
                return new f9(this.f118672b, (p5) this.e, this.f118673c, this.d);
        }
    }
}
