package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DownPaymentSourceFlowContract$InputData f119410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119411c;
    public final o2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119413h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119414j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119417n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119422t;
    public final e4m.e u;

    public o2(c1 c1Var, iq3.a aVar, ViewController viewController, DownPaymentSourceFlowContract$InputData downPaymentSourceFlowContract$InputData) {
        this.f119411c = c1Var;
        this.f119409a = aVar;
        this.f119410b = downPaymentSourceFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119412g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119413h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(downPaymentSourceFlowContract$InputData));
        int i2 = 18;
        this.f119414j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119415l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119416m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119417n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119418p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119419q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119420r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119421s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119422t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119421s.get(), (yji.n) this.f119422t.get(), (yji.n) this.f119418p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119413h.get(), (yji.d) this.f119420r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119411c, this.d, 18);
    }
}
