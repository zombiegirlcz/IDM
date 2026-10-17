package jm4;

import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class s3 implements uq4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f176356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176357c;
    public CreditCardLimitDecreaseAmountScreenContract$InputData d;

    public s3(a3 a3Var, k1 k1Var) {
        this.f176355a = a3Var;
        this.f176356b = k1Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176357c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176357c, ViewController.class);
        vc.s.h(this.d, CreditCardLimitDecreaseAmountScreenContract$InputData.class);
        return new t3(this.f176355a, this.f176356b, this.d);
    }

    @Override // uq4.a
    public final uq4.a q0(CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData) {
        this.d = creditCardLimitDecreaseAmountScreenContract$InputData;
        return this;
    }
}
