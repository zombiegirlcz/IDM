package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RejectedRootFlowContract$InputData f119665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119666c;
    public final r5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119668h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119669j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119672n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119677t;
    public final e4m.e u;

    public r5(c1 c1Var, iq3.a aVar, ViewController viewController, RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData) {
        this.f119666c = c1Var;
        this.f119664a = aVar;
        this.f119665b = rejectedRootFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119667g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119668h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(rejectedRootFlowContract$InputData));
        int i2 = 6;
        this.f119669j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119670l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119671m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119672n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119673p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119674q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119675r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119676s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119677t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119676s.get(), (yji.n) this.f119677t.get(), (yji.n) this.f119673p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119668h.get(), (yji.d) this.f119675r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119666c, this.d, 24);
    }
}
