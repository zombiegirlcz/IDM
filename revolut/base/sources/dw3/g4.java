package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class g4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MortgageRefinancingDetailsV2FlowContract$InputData f118809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118810c;
    public final g4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118812h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118813j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118816n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118821t;
    public final e4m.e u;

    public g4(c1 c1Var, iq3.a aVar, ViewController viewController, MortgageRefinancingDetailsV2FlowContract$InputData mortgageRefinancingDetailsV2FlowContract$InputData) {
        this.f118810c = c1Var;
        this.f118808a = aVar;
        this.f118809b = mortgageRefinancingDetailsV2FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118811g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118812h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(mortgageRefinancingDetailsV2FlowContract$InputData));
        int i2 = 14;
        this.f118813j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118814l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118815m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118816n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118817p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118818q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118819r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118820s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f118821t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118820s.get(), (yji.n) this.f118821t.get(), (yji.n) this.f118817p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118812h.get(), (yji.d) this.f118819r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118810c, this.d, 16);
    }
}
