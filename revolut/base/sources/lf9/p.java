package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentAmountContract$InputData f194764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f194766c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194768h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f194769j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f194770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f194771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f194772n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f194773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f194774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f194775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f194776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f194777t;
    public final e4m.e u;

    public p(m mVar, q qVar, ViewController viewController, PaymentAmountContract$InputData paymentAmountContract$InputData) {
        this.f194765b = mVar;
        this.f194766c = qVar;
        this.f194764a = paymentAmountContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.e = e4m.b.b(new ld1.q(mVar, qVar, this, 1, i));
        this.f = e4m.b.b(new ld1.q(mVar, qVar, this, 0, i));
        this.f194767g = e4m.b.b(new ld1.q(mVar, qVar, this, 3, i));
        this.f194768h = e4m.b.b(new ld1.q(mVar, qVar, this, 2, i));
        this.i = e4m.b.b(new ld1.q(mVar, qVar, this, 6, i));
        this.f194769j = e4m.b.b(new ld1.q(mVar, qVar, this, 5, i));
        this.k = e4m.b.b(new ld1.q(mVar, qVar, this, 4, i));
        this.f194770l = e4m.b.b(new ld1.q(mVar, qVar, this, 8, i));
        this.f194771m = e4m.b.b(new ld1.q(mVar, qVar, this, 7, i));
        this.f194772n = e4m.b.b(new ld1.q(mVar, qVar, this, 11, i));
        this.o = e4m.b.b(new ld1.q(mVar, qVar, this, 10, i));
        this.f194773p = e4m.b.b(new ld1.q(mVar, qVar, this, 9, i));
        this.f194774q = e4m.b.b(new ld1.q(mVar, qVar, this, 13, i));
        this.f194775r = e4m.b.b(new ld1.q(mVar, qVar, this, 14, i));
        this.f194776s = e4m.b.b(new ld1.q(mVar, qVar, this, 16, i));
        this.f194777t = e4m.b.b(new ld1.q(mVar, qVar, this, 15, i));
        this.u = e4m.b.b(new ld1.q(mVar, qVar, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194771m.get(), (yji.n) this.f194773p.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f194768h.get(), (yji.d) this.k.get());
    }
}
