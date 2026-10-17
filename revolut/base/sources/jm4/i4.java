package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class i4 implements rs4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f176125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CreditCardAnticipationPrepayScreenContract$InputData f176126c;

    public i4(a3 a3Var) {
        this.f176124a = a3Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176125b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176125b, ViewController.class);
        vc.s.h(this.f176126c, CreditCardAnticipationPrepayScreenContract$InputData.class);
        return new h4(this.f176124a, this.f176126c);
    }

    @Override // rs4.a
    public final rs4.a p(CreditCardAnticipationPrepayScreenContract$InputData creditCardAnticipationPrepayScreenContract$InputData) {
        creditCardAnticipationPrepayScreenContract$InputData.getClass();
        this.f176126c = creditCardAnticipationPrepayScreenContract$InputData;
        return this;
    }
}
