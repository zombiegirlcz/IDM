package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentReviewContract$InputData f194788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194790c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194792h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f194793j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f194794l;

    public r(m mVar, q qVar, ViewController viewController, PaymentReviewContract$InputData paymentReviewContract$InputData) {
        this.f194789b = mVar;
        this.f194788a = paymentReviewContract$InputData;
        this.f194790c = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.d = e4m.b.b(new ld1.q(mVar, qVar, this, 2, i));
        this.e = e4m.b.b(new ld1.q(mVar, qVar, this, 1, i));
        this.f = e4m.b.b(new ld1.q(mVar, qVar, this, 0, i));
        this.f194791g = e4m.b.b(new ld1.q(mVar, qVar, this, 4, i));
        this.f194792h = e4m.b.b(new ld1.q(mVar, qVar, this, 3, i));
        this.i = e4m.b.b(new ld1.q(mVar, qVar, this, 8, i));
        this.f194793j = e4m.b.b(new ld1.q(mVar, qVar, this, 7, i));
        this.k = e4m.b.b(new ld1.q(mVar, qVar, this, 6, i));
        this.f194794l = e4m.b.b(new ld1.q(mVar, qVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194792h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
