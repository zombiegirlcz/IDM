package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class e8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118670c;
    public CalculatorScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e8(c1 c1Var, Object obj2, int i) {
        this.f118668a = i;
        this.f118669b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118668a) {
            case 0:
                this.f118670c = viewController;
                break;
            case 1:
                this.f118670c = viewController;
                break;
            default:
                this.f118670c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118668a) {
            case 0:
                vc.s.h(this.f118670c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new f8(this.f118669b, (p5) this.e, this.f118670c, this.d);
            case 1:
                vc.s.h(this.f118670c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new f8(this.f118669b, (n4) this.e, this.f118670c, this.d);
            default:
                vc.s.h(this.f118670c, ViewController.class);
                vc.s.h(this.d, CalculatorScreenContract$InputData.class);
                return new f8(this.f118669b, (b0) this.e, this.f118670c, this.d);
        }
    }
}
