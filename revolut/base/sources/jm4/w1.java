package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPseRepayContract$InputData f176415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176417c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public w1(a3 a3Var, v1 v1Var, ViewController viewController, CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData) {
        this.f176416b = a3Var;
        this.f176415a = creditCardPseRepayContract$InputData;
        this.f176417c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 1, 2));
        this.e = e4m.b.b(new f1(a3Var, this, 0, 2));
        this.f = e4m.b.b(new f1(a3Var, this, 2, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
