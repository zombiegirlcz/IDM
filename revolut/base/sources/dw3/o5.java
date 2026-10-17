package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o5 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefinancingAccountDocumentsScreenContract$InputData f119446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f119448c;
    public final e4m.e d;
    public final e4m.e e;
    public final g5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g5 f119450h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119451j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119454n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119457r;

    public o5(c1 c1Var, m5 m5Var, ViewController viewController, RefinancingAccountDocumentsScreenContract$InputData refinancingAccountDocumentsScreenContract$InputData) {
        this.f119447b = c1Var;
        this.f119446a = refinancingAccountDocumentsScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f119448c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 3;
        this.e = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f = new g5(c1Var, this, 3, i);
        this.f119449g = e4m.b.b(new g5(c1Var, this, 4, i));
        this.f119450h = new g5(c1Var, this, 5, i);
        this.i = e4m.b.b(new g5(c1Var, this, 6, i));
        this.f119451j = e4m.b.b(this.f119448c);
        this.k = e4m.b.b(new g5(c1Var, this, 7, i));
        this.f119452l = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119453m = e4m.b.b(new g5(c1Var, this, 0, i));
        this.f119454n = e4m.b.b(new g5(c1Var, this, 8, i));
        this.o = e4m.b.b(new g5(c1Var, this, 9, i));
        this.f119455p = e4m.b.b(new g5(c1Var, this, 10, i));
        this.f119456q = e4m.b.b(new g5(c1Var, this, 12, i));
        this.f119457r = e4m.b.b(new g5(c1Var, this, 11, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f119447b.f118443h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f119454n.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.o.get(), (yji.n) this.f119455p.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119453m.get(), (yji.d) this.f119454n.get());
    }

    public final nli.e j() {
        l70.e eVar = this.f119447b.f118443h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f119449g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
