package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class g1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentRepayChooseAmountScreenContract$InputData f176083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176085c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176087h;

    public g1(a3 a3Var, y1 y1Var, ViewController viewController, CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData) {
        this.f176084b = a3Var;
        this.f176083a = creditCardInstalmentRepayChooseAmountScreenContract$InputData;
        this.f176085c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 2, 0));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 0));
        this.f = e4m.b.b(new f1(a3Var, this, 0, 0));
        this.f176086g = e4m.b.b(new f1(a3Var, this, 4, 0));
        this.f176087h = e4m.b.b(new f1(a3Var, this, 3, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
