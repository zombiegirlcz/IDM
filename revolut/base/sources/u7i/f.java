package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import h6i.r0;
import java.util.Set;
import m6i.h0;
import m6i.k0;
import m6i.n0;
import n7i.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.e {
    public final e4m.e A;
    public final e4m.e B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveAmountScreenContract$InputData f277785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f277786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f277787c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277789h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277790j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f277791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f277792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f277793n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f277794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f277795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f277796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f277797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f277798t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f277799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f277800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f277801y;
    public final e4m.e z;

    public f(l lVar, m mVar, ViewController viewController, MoveAmountScreenContract$InputData moveAmountScreenContract$InputData) {
        this.f277786b = lVar;
        this.f277787c = mVar;
        this.f277785a = moveAmountScreenContract$InputData;
        this.d = t61.a.k(lVar, mVar, this, 2);
        this.e = t61.a.k(lVar, mVar, this, 1);
        this.f = t61.a.k(lVar, mVar, this, 0);
        this.f277788g = e4m.b.b(e4m.c.a(viewController));
        this.f277789h = t61.a.k(lVar, mVar, this, 4);
        this.i = t61.a.k(lVar, mVar, this, 3);
        this.f277790j = t61.a.k(lVar, mVar, this, 6);
        this.k = t61.a.k(lVar, mVar, this, 5);
        this.f277791l = t61.a.k(lVar, mVar, this, 9);
        this.f277792m = t61.a.k(lVar, mVar, this, 8);
        this.f277793n = t61.a.k(lVar, mVar, this, 7);
        this.o = t61.a.k(lVar, mVar, this, 10);
        this.f277794p = t61.a.k(lVar, mVar, this, 14);
        this.f277795q = t61.a.k(lVar, mVar, this, 13);
        int i = 11;
        this.f277796r = e4m.b.b(new r7d.w(lVar, mVar, this, 12, i));
        this.f277797s = t61.a.k(lVar, mVar, this, 11);
        this.f277798t = t61.a.k(lVar, mVar, this, 16);
        this.u = t61.a.k(lVar, mVar, this, 15);
        this.v = t61.a.k(lVar, mVar, this, 18);
        this.f277799w = t61.a.k(lVar, mVar, this, 17);
        this.f277800x = t61.a.k(lVar, mVar, this, 19);
        this.f277801y = t61.a.k(lVar, mVar, this, 20);
        this.z = t61.a.k(lVar, mVar, this, 22);
        this.A = e4m.b.b(new r7d.w(lVar, mVar, this, 23, i));
        this.B = e4m.b.b(new r7d.w(lVar, mVar, this, 21, i));
    }

    public final jul.o b() {
        return new jul.o(this.f277786b.Q.i(), new za7.c());
    }

    public final m6i.j c() {
        m mVar = this.f277787c;
        MoveMoneyInputData moveMoneyInputData = mVar.f277845a;
        l lVar = this.f277786b;
        v7i.a aVar = lVar.z;
        w5i.c cVarC = aVar.c();
        vc.s.j(cVarC);
        h6i.o oVarH = aVar.h();
        w5i.a aVarA = aVar.a();
        vc.s.j(aVarA);
        r0 r0Var = new r0(aVar.h());
        hd.r rVarQ = q();
        h6i.o oVarH2 = aVar.h();
        h0 h0VarJ = mVar.j();
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) lVar.W).c();
        vc.s.j(aVarC);
        m6i.w wVar = new m6i.w(aVarC, aVar.h(), j(), lVar.Q.i(), new za7.c(), q());
        fk3.a aVarA2 = lVar.i.a();
        vc.s.j(aVarA2);
        m6i.r rVar = new m6i.r(oVarH2, h0VarJ, wVar, new m6i.l(aVarA2, new n6i.o(lVar.G.b(), lVar.f277840s.c(), mVar.b())), b());
        h0 h0VarJ2 = mVar.j();
        n7i.e eVar = new n7i.e(new n7i.f());
        kbb.c cVar = new kbb.c(aVar.h(), new k0(), q(), b());
        gte.a aVarB = lVar.f277830j.b();
        vc.s.j(aVarB);
        return new m6i.j(moveMoneyInputData, cVarC, oVarH, aVarA, r0Var, rVarQ, rVar, h0VarJ2, eVar, cVar, aVarB, new n0(mVar.f277845a, aVar.h(), lVar.G.b(), new u5k.d(lVar.X.a())), b());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.o.get(), (yji.n) this.f277797s.get(), (yji.n) this.u.get(), (yji.n) this.f277799w.get(), (yji.n) this.f277800x.get(), (yji.n) this.f277801y.get(), (yji.n) this.f277795q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get(), (yji.d) this.k.get(), (yji.d) this.f277793n.get());
    }

    public final r7i.u j() {
        l lVar = this.f277786b;
        w5i.b bVarB = lVar.z.b();
        vc.s.j(bVarB);
        j0 j0Var = new j0(bVarB);
        n8b.a aVarA = lVar.V.a();
        vc.s.j(aVarA);
        return new r7i.u(j0Var, new c8i.n(aVarA, 0));
    }

    public final hd.r q() {
        m mVar = this.f277787c;
        h0 h0VarJ = mVar.j();
        l lVar = this.f277786b;
        wsg.n nVarB = lVar.G.b();
        v7i.a aVar = lVar.z;
        h6i.o oVarH = aVar.h();
        fk3.a aVarA = lVar.i.a();
        vc.s.j(aVarA);
        return new hd.r(h0VarJ, nVarB, oVarH, new m6i.l(aVarA, new n6i.o(lVar.G.b(), lVar.f277840s.c(), mVar.b())), new k7i.i(aVar.h(), j()), b());
    }
}
