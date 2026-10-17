package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c2 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayPaymentReviewScreenContract$InputData f176019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176021c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176023h;

    public c2(a3 a3Var, e2 e2Var, ViewController viewController, CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData) {
        this.f176020b = a3Var;
        this.f176019a = creditCardRepayPaymentReviewScreenContract$InputData;
        this.f176021c = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.d = e4m.b.b(new f1(a3Var, this, 0, i));
        this.e = e4m.b.b(new f1(a3Var, this, 1, i));
        this.f = e4m.b.b(new f1(a3Var, this, 4, i));
        this.f176022g = e4m.b.b(new f1(a3Var, this, 3, i));
        this.f176023h = e4m.b.b(new f1(a3Var, this, 2, i));
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
