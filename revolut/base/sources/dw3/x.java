package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements u54.a {
    public final e4m.e A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerFlowContract$InputData f120095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120096c;
    public final x d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120098h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120099j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120102n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120107t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f120108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f120109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f120110y;
    public final e4m.e z;

    public x(c1 c1Var, iq3.a aVar, ViewController viewController, BannerFlowContract$InputData bannerFlowContract$InputData) {
        this.f120096c = c1Var;
        this.f120094a = aVar;
        this.f120095b = bannerFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f120097g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f120098h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(bannerFlowContract$InputData));
        int i2 = 7;
        this.f120099j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f120100l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f120101m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f120102n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f120103p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f120104q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f120105r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f120106s = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.f120107t = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f120108w = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f120109x = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
        this.f120110y = e4m.b.b(new dmc.b0(c1Var, this, 18, i2));
        this.z = e4m.b.b(new dmc.b0(c1Var, this, 19, i2));
        this.A = e4m.b.b(new dmc.b0(c1Var, this, 20, i2));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f120107t.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.f120108w.get());
        builderBuilderWithExpectedSize.add(this.f120109x.get());
        builderBuilderWithExpectedSize.add(this.f120110y.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.add(this.f120103p.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120098h.get(), (yji.d) this.f120105r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f120096c, this.d, 11);
    }
}
