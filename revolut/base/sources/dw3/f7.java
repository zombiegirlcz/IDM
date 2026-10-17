package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f7 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VisiblePrequalificationFlowContract$InputData f118748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118749c;
    public final f7 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118751h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118752j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118755n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118760t;
    public final e4m.e u;

    public f7(c1 c1Var, iq3.a aVar, ViewController viewController, VisiblePrequalificationFlowContract$InputData visiblePrequalificationFlowContract$InputData) {
        this.f118749c = c1Var;
        this.f118747a = aVar;
        this.f118748b = visiblePrequalificationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f118750g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f118751h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(visiblePrequalificationFlowContract$InputData));
        int i2 = 26;
        this.f118752j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f118753l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f118754m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f118755n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f118756p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f118757q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f118758r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f118759s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f118760t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118759s.get(), (yji.n) this.f118760t.get(), (yji.n) this.f118756p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118751h.get(), (yji.d) this.f118758r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118749c, this.d, 19);
    }
}
