package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormFlowContract$InputData f119097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119098c;
    public final k3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119100h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119101j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119104n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119109t;
    public final e4m.e u;

    public k3(c1 c1Var, iq3.a aVar, ViewController viewController, FormFlowContract$InputData formFlowContract$InputData) {
        this.f119098c = c1Var;
        this.f119096a = aVar;
        this.f119097b = formFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119099g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119100h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(formFlowContract$InputData));
        int i2 = 2;
        this.f119101j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119102l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119103m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119104n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119105p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119106q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119107r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119108s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119109t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119108s.get(), (yji.n) this.f119109t.get(), (yji.n) this.f119105p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119100h.get(), (yji.d) this.f119107r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119098c, this.d, 20);
    }
}
