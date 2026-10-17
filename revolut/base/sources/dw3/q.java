package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements xki.c, iq3.d {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddEvidenceFlowContract$InputData f119540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119541c;
    public final q d = this;
    public final e4m.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119543h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119544j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119547n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119552t;
    public final dmc.b0 u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dmc.b0 f119553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f119555y;
    public final e4m.e z;

    public q(c1 c1Var, iq3.a aVar, ViewController viewController, AddEvidenceFlowContract$InputData addEvidenceFlowContract$InputData) {
        this.f119541c = c1Var;
        this.f119539a = aVar;
        this.f119540b = addEvidenceFlowContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.e = cVarA;
        this.f = e4m.b.b(cVarA);
        int i = 1;
        this.f119542g = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119543h = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.i = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.f119544j = e4m.b.b(e4m.c.a(addEvidenceFlowContract$InputData));
        int i2 = 1;
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.f119545l = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119546m = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119547n = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.f119548p = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119549q = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119550r = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119551s = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119552t = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.u = new dmc.b0(c1Var, this, 15, i2);
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f119553w = new dmc.b0(c1Var, this, 17, i2);
        this.f119554x = e4m.b.b(new dmc.b0(c1Var, this, 18, i2));
        this.f119555y = e4m.b.b(this.e);
        this.z = e4m.b.b(new dmc.b0(c1Var, this, 19, i2));
        this.A = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.B = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.C = e4m.b.b(new dmc.b0(c1Var, this, 20, i2));
        this.D = e4m.b.b(new dmc.b0(c1Var, this, 21, i2));
        this.E = e4m.b.b(new dmc.b0(c1Var, this, 22, i2));
        this.F = e4m.b.b(new dmc.b0(c1Var, this, 24, i2));
        this.G = e4m.b.b(new dmc.b0(c1Var, this, 23, i2));
    }

    public final u96.b b() {
        l70.e eVar = this.f119541c.f118443h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f119541c.f118443h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.v.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.C.get(), (yji.n) this.D.get(), (yji.n) this.E.get(), (yji.n) this.f119549q.get(), (yji.n) this.f119545l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f119551s.get(), (yji.d) this.B.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119541c, this.d, 19);
    }
}
