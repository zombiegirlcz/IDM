package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfirmationFlowContract$InputData f119145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119146c;
    public final l0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119148h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119149j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119152n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119157t;
    public final e4m.e u;

    public l0(c1 c1Var, iq3.a aVar, ViewController viewController, ConfirmationFlowContract$InputData confirmationFlowContract$InputData) {
        this.f119146c = c1Var;
        this.f119144a = aVar;
        this.f119145b = confirmationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119147g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119148h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(confirmationFlowContract$InputData));
        int i2 = 16;
        this.f119149j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119150l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119151m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119152n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119153p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119154q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119155r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119156s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119157t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119156s.get(), (yji.n) this.f119157t.get(), (yji.n) this.f119153p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119148h.get(), (yji.d) this.f119155r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119146c, this.d, 2);
    }
}
