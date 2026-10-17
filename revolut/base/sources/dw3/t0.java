package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditAddressFlowContract$InputData f119808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119809c;
    public final t0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119811h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119812j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119815n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119820t;
    public final e4m.e u;

    public t0(c1 c1Var, iq3.a aVar, ViewController viewController, CreditAddressFlowContract$InputData creditAddressFlowContract$InputData) {
        this.f119809c = c1Var;
        this.f119807a = aVar;
        this.f119808b = creditAddressFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119810g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119811h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditAddressFlowContract$InputData));
        int i2 = 23;
        this.f119812j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119813l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119814m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119815n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119816p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119817q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119818r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119819s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119820t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119819s.get(), (yji.n) this.f119820t.get(), (yji.n) this.f119816p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119811h.get(), (yji.d) this.f119818r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119809c, this.d, 1);
    }
}
