package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 implements xki.c, iq3.d, f54.a, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentsFlowContract$InputData f119382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119383c;
    public final o0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119385h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119386j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119389n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119394t;
    public final e4m.e u;

    public o0(c1 c1Var, iq3.a aVar, ViewController viewController, ConsentsFlowContract$InputData consentsFlowContract$InputData) {
        this.f119383c = c1Var;
        this.f119381a = aVar;
        this.f119382b = consentsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119384g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119385h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(consentsFlowContract$InputData));
        int i2 = 18;
        this.f119386j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119387l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119388m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119389n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119390p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119391q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119392r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119393s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119394t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119393s.get(), (yji.n) this.f119394t.get(), (yji.n) this.f119390p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119385h.get(), (yji.d) this.f119392r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119383c, this.d, 27);
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f119383c, this.d, 3);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f119383c, this.d, 4);
    }
}
