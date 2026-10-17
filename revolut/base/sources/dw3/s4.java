package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutstandingDebtsFlowContract$InputData f119750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119751c;
    public final s4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119753h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119754j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119757n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119762t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119764x;

    public s4(c1 c1Var, iq3.a aVar, ViewController viewController, OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData) {
        this.f119751c = c1Var;
        this.f119749a = aVar;
        this.f119750b = outstandingDebtsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119752g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119753h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(outstandingDebtsFlowContract$InputData));
        int i2 = 21;
        this.f119754j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119755l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119756m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119757n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119758p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119759q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119760r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119761s = e4m.b.b(new g3(c1Var, this, 14, i2));
        this.f119762t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.f119763w = e4m.b.b(new g3(c1Var, this, 16, i2));
        this.f119764x = e4m.b.b(new g3(c1Var, this, 17, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f119763w.get(), (yji.n) this.f119758p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119753h.get(), (yji.d) this.f119760r.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119751c, this.d, 12);
    }
}
