package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v4 implements xki.c, iq3.d, vf4.a, f54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverdraftOfferFlowContract$InputData f119988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119989c;
    public final v4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119991h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119992j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119995n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120000t;
    public final e4m.e u;
    public final e4m.e v;

    public v4(c1 c1Var, iq3.a aVar, ViewController viewController, OverdraftOfferFlowContract$InputData overdraftOfferFlowContract$InputData) {
        this.f119989c = c1Var;
        this.f119987a = aVar;
        this.f119988b = overdraftOfferFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119990g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119991h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(overdraftOfferFlowContract$InputData));
        int i2 = 24;
        this.f119992j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119993l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119994m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119995n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119996p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119997q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119998r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119999s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f120000t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // vf4.a
    public final c9 D() {
        return new c9(this.f119989c, this.d, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119999s.get(), (yji.n) this.f120000t.get(), (yji.n) this.f119996p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119991h.get(), (yji.d) this.f119998r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119989c, this.d, 3);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f119989c, this.d, 8);
    }
}
