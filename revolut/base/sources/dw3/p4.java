package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p4 implements xki.e, b84.c, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f119499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f119500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119501c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f119503h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119504j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119507n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119510r;

    public p4(c1 c1Var, n4 n4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f119501c = c1Var;
        this.f119499a = viewController;
        this.f119500b = offerContentScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.e = e4m.b.b(new e0(c1Var, n4Var, this, 2, i));
        this.f = e4m.b.b(new e0(c1Var, n4Var, this, 1, i));
        this.f119502g = e4m.b.b(new e0(c1Var, n4Var, this, 0, i));
        e0 e0Var = new e0(c1Var, n4Var, this, 4, i);
        this.f119503h = e0Var;
        this.i = e4m.b.b(e0Var);
        this.f119504j = e4m.b.b(new e0(c1Var, n4Var, this, 3, i));
        this.k = e4m.b.b(new e0(c1Var, n4Var, this, 5, i));
        this.f119505l = e4m.b.b(new e0(c1Var, n4Var, this, 7, i));
        this.f119506m = e4m.b.b(new e0(c1Var, n4Var, this, 6, i));
        this.f119507n = e4m.b.b(new e0(c1Var, n4Var, this, 8, i));
        this.o = e4m.b.b(this.f119503h);
        this.f119508p = e4m.b.b(new e0(c1Var, n4Var, this, 11, i));
        this.f119509q = e4m.b.b(new e0(c1Var, n4Var, this, 10, i));
        this.f119510r = e4m.b.b(new e0(c1Var, n4Var, this, 9, i));
    }

    @Override // b84.c
    public final a84.a b() {
        return (a84.a) this.f119506m.get();
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119507n.get(), (yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119502g.get(), (yji.d) this.f119504j.get(), (yji.d) this.k.get(), (yji.d) this.f119506m.get());
    }
}
