package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class j4 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176160c;
    public CreditCardRepayDetailsControllerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ j4(a3 a3Var, Object obj2, int i) {
        this.f176158a = i;
        this.f176159b = a3Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f176158a) {
            case 0:
                this.f176160c = viewController;
                break;
            default:
                this.f176160c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f176158a) {
            case 0:
                vc.s.h(this.f176160c, ViewController.class);
                vc.s.h(this.d, CreditCardRepayDetailsControllerScreenContract$InputData.class);
                return new k4(this.f176159b, (a2) this.e, this.f176160c, this.d);
            default:
                vc.s.h(this.f176160c, ViewController.class);
                vc.s.h(this.d, CreditCardRepayDetailsControllerScreenContract$InputData.class);
                return new k4(this.f176159b, (y1) this.e, this.f176160c, this.d);
        }
    }
}
