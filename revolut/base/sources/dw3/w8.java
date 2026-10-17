package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class w8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f120093c;
    public CalculatorScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w8(c1 c1Var, Object obj2, int i) {
        this.f120091a = i;
        this.f120092b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f120091a) {
            case 0:
                this.f120093c = viewController;
                break;
            case 1:
                this.f120093c = viewController;
                break;
            default:
                this.f120093c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f120091a) {
            case 0:
                vc.s.h(this.f120093c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new x8(this.f120092b, (f4) this.e, this.f120093c, this.d);
            case 1:
                vc.s.h(this.f120093c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new x8(this.f120092b, (s0) this.e, this.f120093c, this.d);
            default:
                vc.s.h(this.f120093c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new x8(this.f120092b, (q4) this.e, this.f120093c, this.d);
        }
    }
}
