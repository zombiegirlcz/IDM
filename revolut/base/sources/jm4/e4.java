package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class e4 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176064c;
    public CreditCardChooseInstalmentsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e4(a3 a3Var, Object obj2, int i) {
        this.f176062a = i;
        this.f176063b = a3Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f176062a) {
            case 0:
                this.f176064c = viewController;
                break;
            default:
                this.f176064c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f176062a) {
            case 0:
                vc.s.h(this.f176064c, ViewController.class);
                vc.s.h(this.d, CreditCardChooseInstalmentsScreenContract$InputData.class);
                return new f4(this.f176063b, (b1) this.e, this.d);
            default:
                vc.s.h(this.f176064c, ViewController.class);
                vc.s.h(this.d, CreditCardChooseInstalmentsScreenContract$InputData.class);
                return new f4(this.f176063b, (h1) this.e, this.d);
        }
    }
}
