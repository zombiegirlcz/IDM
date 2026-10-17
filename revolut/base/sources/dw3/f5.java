package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductArticlesFlowContract$InputData f118731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118732c;
    public final f5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118734h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118735j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118738n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118743t;
    public final e4m.e u;

    public f5(c1 c1Var, iq3.a aVar, ViewController viewController, ProductArticlesFlowContract$InputData productArticlesFlowContract$InputData) {
        this.f118732c = c1Var;
        this.f118730a = aVar;
        this.f118731b = productArticlesFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118733g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118734h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(productArticlesFlowContract$InputData));
        int i2 = 29;
        this.f118735j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118736l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118737m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118738n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118739p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118740q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118741r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118742s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f118743t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118742s.get(), (yji.n) this.f118743t.get(), (yji.n) this.f118739p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118734h.get(), (yji.d) this.f118741r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118732c, this.d, 7);
    }
}
