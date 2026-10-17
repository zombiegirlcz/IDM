package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import et6.h1;
import h6i.q0;
import java.util.Set;
import m6i.h0;
import n7i.k0;
import n7i.l0;
import n7i.m0;
import u45.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f277845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f277846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f277847c;
    public final od0.i d;
    public final l e;
    public final m f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277849h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277850j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f277851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f277852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f277853n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f277854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f277855q;

    public m(l lVar, ViewController viewController, MoveMoneyInputData moveMoneyInputData, od0.i iVar, od0.i iVar2, od0.i iVar3) {
        this.e = lVar;
        this.f277845a = moveMoneyInputData;
        this.f277846b = iVar;
        this.f277847c = iVar2;
        this.d = iVar3;
        int i = 5;
        this.f277848g = e4m.b.b(new w0(lVar, this, 0, i));
        this.f277849h = e4m.b.b(new w0(lVar, this, 1, i));
        this.i = e4m.b.b(new w0(lVar, this, 2, i));
        this.f277850j = e4m.b.b(new w0(lVar, this, 3, i));
        this.k = e4m.b.b(new w0(lVar, this, 4, i));
        this.f277851l = e4m.b.b(new w0(lVar, this, 5, i));
        this.f277852m = e4m.b.b(new w0(lVar, this, 7, i));
        this.f277853n = e4m.b.b(new w0(lVar, this, 6, i));
        this.o = e4m.b.b(e4m.c.a(viewController));
        int i2 = 5;
        this.f277854p = e4m.b.b(new w0(lVar, this, 9, i2));
        this.f277855q = e4m.b.b(new w0(lVar, this, 8, i2));
    }

    public final q0 b() {
        l lVar = this.e;
        return new q0(lVar.K.a(), lVar.N.h());
    }

    public final g8i.a c() {
        oyh.a aVar = new oyh.a();
        gte.a aVarB = this.e.f277830j.b();
        vc.s.j(aVarB);
        return new g8i.a(aVar, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get(), (yji.n) this.f277851l.get(), (yji.n) this.f277853n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f277848g.get(), (yji.d) this.f277849h.get(), (yji.d) this.i.get(), (yji.d) this.f277850j.get());
    }

    public final h0 j() {
        l lVar = this.e;
        v7i.a aVar = lVar.z;
        h6i.o oVarH = aVar.h();
        usg.a aVar2 = lVar.G;
        wsg.n nVarB = aVar2.b();
        mj8.b bVar = lVar.H;
        hj8.a aVarA = bVar.a();
        vc.s.j(aVarA);
        te8.v vVarD = lVar.I.d();
        vc.s.j(vVarD);
        anb.s sVar = lVar.J;
        djb.n nVarA = sVar.a();
        vc.s.j(nVarA);
        hj8.a aVarA2 = bVar.a();
        vc.s.j(aVarA2);
        wsg.n nVarB2 = aVar2.b();
        bw9.a aVar3 = lVar.K;
        jpc.e eVar = new jpc.e(aVarA2, nVarB2, aVar3.a());
        fpg.c cVar = lVar.v;
        ppg.b bVarB = ((wpg.l) cVar).b();
        vc.s.j(bVarB);
        jla.h hVarA = lVar.L.a();
        cw9.d dVarA = aVar3.a();
        ite.a aVar4 = lVar.f277830j;
        gte.a aVarB = aVar4.b();
        vc.s.j(aVarB);
        k6i.k kVar = new k6i.k(nVarB, aVarA, vVarD, nVarA, eVar, bVarB, hVarA, dVarA, aVarB);
        wsg.b bVarA = aVar2.a();
        xqe.b bVarA2 = lVar.M.a();
        vc.s.j(bVarA2);
        ppg.b bVarB2 = ((wpg.l) cVar).b();
        vc.s.j(bVarB2);
        gte.a aVarB2 = aVar4.b();
        vc.s.j(aVarB2);
        o6i.f fVar = new o6i.f(bVarA, bVarA2, bVarB2, aVarB2);
        ppg.b bVarB3 = ((wpg.l) cVar).b();
        vc.s.j(bVarB3);
        n6i.x xVar = new n6i.x(bVarB3, b());
        djb.n nVarA2 = sVar.a();
        vc.s.j(nVarA2);
        n6i.s sVar2 = new n6i.s(nVarA2);
        wsg.n nVarB3 = aVar2.b();
        h1 h1VarN = lVar.O.n();
        vc.s.j(h1VarN);
        w5i.c cVarC = aVar.c();
        vc.s.j(cVarC);
        w5i.a aVarA3 = aVar.a();
        vc.s.j(aVarA3);
        lVar.P.a();
        return new h0(oVarH, kVar, fVar, xVar, sVar2, nVarB3, h1VarN, cVarC, aVarA3, new n6i.h(), lVar.Q.i(), new za7.c());
    }

    public final k0 q() {
        l lVar = this.e;
        v60.e eVarA = lVar.u.a();
        vc.s.j(eVarA);
        hpg.b bVar = (hpg.b) ((wpg.l) lVar.v).Z.get();
        vc.s.j(bVar);
        MoveMoneyInputData moveMoneyInputData = this.f277845a;
        l0 l0Var = new l0(moveMoneyInputData, new n7i.g0(moveMoneyInputData), new m0());
        u8h.c cVar = lVar.f277832l;
        usc.a aVarF = ((u8h.b) cVar).f();
        gah.f fVarA = ((u8h.b) cVar).a();
        vc.s.j(fVarA);
        return new k0(eVarA, bVar, l0Var, new n7i.d(aVarF, trl.f.v(fVarA)));
    }
}
