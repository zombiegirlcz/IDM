package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements xki.c, iq3.d, ok4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutopayFlowContract$InputData f120033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120034c;
    public final w d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120036h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120037j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120040n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120045t;
    public final e4m.e u;
    public final e4m.e v;

    public w(c1 c1Var, iq3.a aVar, ViewController viewController, AutopayFlowContract$InputData autopayFlowContract$InputData) {
        this.f120034c = c1Var;
        this.f120032a = aVar;
        this.f120033b = autopayFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f120035g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f120036h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(autopayFlowContract$InputData));
        int i2 = 6;
        this.f120037j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f120038l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f120039m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f120040n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f120041p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f120042q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f120043r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f120044s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f120045t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120044s.get(), (yji.n) this.f120045t.get(), (yji.n) this.f120041p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120036h.get(), (yji.d) this.f120043r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f120034c, this.d, 26);
    }

    @Override // ok4.a
    public final k9 s() {
        return new k9(this.f120034c, this.d, 1);
    }
}
