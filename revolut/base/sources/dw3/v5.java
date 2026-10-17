package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RolleeFlowContract$InputData f120002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120003c;
    public final v5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120005h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120006j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120009n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120014t;
    public final e4m.e u;

    public v5(c1 c1Var, iq3.a aVar, ViewController viewController, RolleeFlowContract$InputData rolleeFlowContract$InputData) {
        this.f120003c = c1Var;
        this.f120001a = aVar;
        this.f120002b = rolleeFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f120004g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f120005h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(rolleeFlowContract$InputData));
        int i2 = 8;
        this.f120006j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f120007l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f120008m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f120009n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f120010p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f120011q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f120012r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f120013s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f120014t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120013s.get(), (yji.n) this.f120014t.get(), (yji.n) this.f120010p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120005h.get(), (yji.d) this.f120012r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f120003c, this.d, 29);
    }
}
