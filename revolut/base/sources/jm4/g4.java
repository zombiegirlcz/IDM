package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class g4 implements rs4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f176095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176096c;
    public CreditCardAnticipationPrepayScreenContract$InputData d;

    public g4(a3 a3Var, b1 b1Var) {
        this.f176094a = a3Var;
        this.f176095b = b1Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176096c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176096c, ViewController.class);
        vc.s.h(this.d, CreditCardAnticipationPrepayScreenContract$InputData.class);
        return new h4(this.f176094a, this.f176095b, this.d);
    }

    @Override // rs4.a
    public final rs4.a p(CreditCardAnticipationPrepayScreenContract$InputData creditCardAnticipationPrepayScreenContract$InputData) {
        creditCardAnticipationPrepayScreenContract$InputData.getClass();
        this.d = creditCardAnticipationPrepayScreenContract$InputData;
        return this;
    }
}
