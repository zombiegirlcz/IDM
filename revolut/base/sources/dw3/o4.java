package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o4 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f119437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119439c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f119440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119441h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119442j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119445n;
    public final e4m.e o;

    public o4(c1 c1Var, n4 n4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f119438b = c1Var;
        this.f119437a = offerContentScreenContract$InputData;
        this.f119439c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new e0(c1Var, n4Var, this, 2, i));
        this.e = e4m.b.b(new e0(c1Var, n4Var, this, 1, i));
        this.f = e4m.b.b(new e0(c1Var, n4Var, this, 0, i));
        e0 e0Var = new e0(c1Var, n4Var, this, 4, i);
        this.f119440g = e0Var;
        this.f119441h = e4m.b.b(e0Var);
        this.i = e4m.b.b(new e0(c1Var, n4Var, this, 3, i));
        this.f119442j = e4m.b.b(new e0(c1Var, n4Var, this, 5, i));
        this.k = e4m.b.b(new e0(c1Var, n4Var, this, 6, i));
        this.f119443l = e4m.b.b(this.f119440g);
        this.f119444m = e4m.b.b(new e0(c1Var, n4Var, this, 9, i));
        this.f119445n = e4m.b.b(new e0(c1Var, n4Var, this, 8, i));
        this.o = e4m.b.b(new e0(c1Var, n4Var, this, 7, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f119442j.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get(), (yji.n) this.f119443l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get(), (yji.d) this.f119442j.get());
    }
}
