package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HomeInsuranceFlowContract$InputData f119187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119188c;
    public final l3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119190h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119191j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119194n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119199t;
    public final e4m.e u;

    public l3(c1 c1Var, iq3.a aVar, ViewController viewController, HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData) {
        this.f119188c = c1Var;
        this.f119186a = aVar;
        this.f119187b = homeInsuranceFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119189g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119190h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(homeInsuranceFlowContract$InputData));
        int i2 = 3;
        this.f119191j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119192l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119193m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119194n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119195p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119196q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119197r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119198s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119199t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119198s.get(), (yji.n) this.f119199t.get(), (yji.n) this.f119195p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119190h.get(), (yji.d) this.f119197r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119188c, this.d, 21);
    }
}
