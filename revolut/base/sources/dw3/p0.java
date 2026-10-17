package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 implements xki.c, iq3.d, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentsV1FlowContract$InputData f119478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119479c;
    public final p0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119481h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119482j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119485n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119490t;
    public final e4m.e u;

    public p0(c1 c1Var, iq3.a aVar, ViewController viewController, ConsentsV1FlowContract$InputData consentsV1FlowContract$InputData) {
        this.f119479c = c1Var;
        this.f119477a = aVar;
        this.f119478b = consentsV1FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119480g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119481h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(consentsV1FlowContract$InputData));
        int i2 = 19;
        this.f119482j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119483l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119484m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119485n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119486p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119487q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119488r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119489s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119490t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119489s.get(), (yji.n) this.f119490t.get(), (yji.n) this.f119486p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119481h.get(), (yji.d) this.f119488r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119479c, this.d, 10);
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f119479c, this.d, 2);
    }
}
