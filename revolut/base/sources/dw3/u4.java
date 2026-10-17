package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutstandingDebtsV3FlowContract$InputData f119905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119906c;
    public final u4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119908h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119909j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119912n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119917t;
    public final e4m.e u;

    public u4(c1 c1Var, iq3.a aVar, ViewController viewController, OutstandingDebtsV3FlowContract$InputData outstandingDebtsV3FlowContract$InputData) {
        this.f119906c = c1Var;
        this.f119904a = aVar;
        this.f119905b = outstandingDebtsV3FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119907g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119908h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(outstandingDebtsV3FlowContract$InputData));
        int i2 = 23;
        this.f119909j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119910l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119911m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119912n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119913p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119914q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119915r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119916s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119917t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119916s.get(), (yji.n) this.f119917t.get(), (yji.n) this.f119913p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119908h.get(), (yji.d) this.f119915r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119906c, this.d, 16);
    }
}
