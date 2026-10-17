package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b2 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayPaymentAmountScreenContract$InputData f176000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176002c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176004h;
    public final e4m.e i;

    public b2(a3 a3Var, e2 e2Var, ViewController viewController, CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData) {
        this.f176001b = a3Var;
        this.f176000a = creditCardRepayPaymentAmountScreenContract$InputData;
        this.f176002c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 0, 3));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 3));
        this.f = e4m.b.b(new f1(a3Var, this, 4, 3));
        this.f176003g = e4m.b.b(new f1(a3Var, this, 5, 3));
        this.f176004h = e4m.b.b(new f1(a3Var, this, 3, 3));
        this.i = e4m.b.b(new f1(a3Var, this, 2, 3));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
