package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class w7 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f120090c;
    public CreditAmountInputScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w7(c1 c1Var, Object obj2, int i) {
        this.f120088a = i;
        this.f120089b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f120088a) {
            case 0:
                this.f120090c = viewController;
                break;
            case 1:
                this.f120090c = viewController;
                break;
            case 2:
                this.f120090c = viewController;
                break;
            case 3:
                this.f120090c = viewController;
                break;
            case 4:
                this.f120090c = viewController;
                break;
            case 5:
                this.f120090c = viewController;
                break;
            case 6:
                this.f120090c = viewController;
                break;
            case 7:
                this.f120090c = viewController;
                break;
            case 8:
                this.f120090c = viewController;
                break;
            default:
                this.f120090c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f120088a) {
            case 0:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (s0) this.e, this.f120090c, this.d);
            case 1:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (p5) this.e, this.f120090c, this.d);
            case 2:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (n4) this.e, this.f120090c, this.d);
            case 3:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (q4) this.e, this.f120090c, this.d);
            case 4:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (o0) this.e, this.f120090c, this.d);
            case 5:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (e3) this.e, this.f120090c, this.d);
            case 6:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (e1) this.e, this.f120090c, this.d);
            case 7:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (f4) this.e, this.f120090c, this.d);
            case 8:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (v4) this.e, this.f120090c, this.d);
            default:
                vc.s.h(this.f120090c, ViewController.class);
                vc.s.h(this.d, CreditAmountInputScreenContract$InputData.class);
                return new x7(this.f120089b, (b0) this.e, this.f120090c, this.d);
        }
    }
}
