package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t4 implements xki.c, iq3.d, u74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutstandingDebtsV2FlowContract$InputData f119832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119833c;
    public final t4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119835h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119836j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119839n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119844t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119846x;

    public t4(c1 c1Var, iq3.a aVar, ViewController viewController, OutstandingDebtsV2FlowContract$InputData outstandingDebtsV2FlowContract$InputData) {
        this.f119833c = c1Var;
        this.f119831a = aVar;
        this.f119832b = outstandingDebtsV2FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119834g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119835h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(outstandingDebtsV2FlowContract$InputData));
        int i2 = 22;
        this.f119836j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119837l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119838m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119839n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119840p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119841q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119842r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119843s = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.f119844t = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.f119845w = e4m.b.b(new g3(c1Var, this, 16, i2));
        this.f119846x = e4m.b.b(new g3(c1Var, this, 17, i2));
    }

    @Override // u74.a
    public final b8 b() {
        return new b8(this.f119833c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119844t.get(), (yji.n) this.u.get(), (yji.n) this.v.get(), (yji.n) this.f119840p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119835h.get(), (yji.d) this.f119842r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119833c, this.d, 13);
    }
}
