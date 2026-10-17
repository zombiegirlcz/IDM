package jm4;

import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class u3 implements uq4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f176387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CreditCardLimitDecreaseAmountScreenContract$InputData f176388c;

    public u3(a3 a3Var) {
        this.f176386a = a3Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176387b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176387b, ViewController.class);
        vc.s.h(this.f176388c, CreditCardLimitDecreaseAmountScreenContract$InputData.class);
        return new t3(this.f176386a, this.f176388c);
    }

    @Override // uq4.a
    public final uq4.a q0(CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData) {
        this.f176388c = creditCardLimitDecreaseAmountScreenContract$InputData;
        return this;
    }
}
