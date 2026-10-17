package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class g2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DirectDebitFailedContract$InputData f118792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118793c;
    public final g2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118795h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118796j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118799n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118804t;
    public final e4m.e u;

    public g2(c1 c1Var, iq3.a aVar, ViewController viewController, DirectDebitFailedContract$InputData directDebitFailedContract$InputData) {
        this.f118793c = c1Var;
        this.f118791a = aVar;
        this.f118792b = directDebitFailedContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118794g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118795h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(directDebitFailedContract$InputData));
        int i2 = 12;
        this.f118796j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118797l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118798m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118799n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118800p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118801q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118802r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118803s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118804t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118803s.get(), (yji.n) this.f118804t.get(), (yji.n) this.f118800p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118795h.get(), (yji.d) this.f118802r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118793c, this.d, 21);
    }
}
