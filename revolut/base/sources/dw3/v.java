package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AkahuFlowContract$InputData f119946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119947c;
    public final v d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119949h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119950j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119953n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119958t;
    public final e4m.e u;

    public v(c1 c1Var, iq3.a aVar, ViewController viewController, AkahuFlowContract$InputData akahuFlowContract$InputData) {
        this.f119947c = c1Var;
        this.f119945a = aVar;
        this.f119946b = akahuFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119948g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119949h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(akahuFlowContract$InputData));
        int i2 = 5;
        this.f119950j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119951l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119952m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119953n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119954p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119955q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119956r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119957s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119958t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119957s.get(), (yji.n) this.f119958t.get(), (yji.n) this.f119954p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119949h.get(), (yji.d) this.f119956r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119947c, this.d, 28);
    }
}
