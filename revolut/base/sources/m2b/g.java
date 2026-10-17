package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5b.f f201821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5b.c f201822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1h.f f201823c;
    public final CfdCashBalanceControllerContract$InputData d;
    public final v e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201825h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201826j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f201827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f201828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f201829n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f201830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f201831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f201832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f201833s;

    public g(v vVar, ViewController viewController, CfdCashBalanceControllerContract$InputData cfdCashBalanceControllerContract$InputData, h1h.f fVar, h5b.f fVar2, h5b.c cVar) {
        this.e = vVar;
        this.f201821a = fVar2;
        this.f201822b = cVar;
        this.f201823c = fVar;
        this.d = cfdCashBalanceControllerContract$InputData;
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.f201824g = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.f201825h = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.i = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f201826j = e4m.b.b(new lzk.b(vVar, this, 4, i));
        this.k = e4m.b.b(new lzk.b(vVar, this, 3, i));
        this.f201827l = e4m.b.b(new lzk.b(vVar, this, 6, i));
        this.f201828m = e4m.b.b(new lzk.b(vVar, this, 5, i));
        this.f201829n = e4m.b.b(e4m.c.a(fVar));
        int i2 = 3;
        this.o = e4m.b.b(new lzk.b(vVar, this, 8, i2));
        this.f201830p = e4m.b.b(new lzk.b(vVar, this, 7, i2));
        this.f201831q = e4m.b.b(new lzk.b(vVar, this, 11, i2));
        this.f201832r = e4m.b.b(new lzk.b(vVar, this, 10, i2));
        this.f201833s = e4m.b.b(new lzk.b(vVar, this, 9, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f201826j.get(), (yji.n) this.f201827l.get(), (yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.k.get(), (yji.d) this.f201828m.get(), (yji.d) this.f201830p.get());
    }
}
