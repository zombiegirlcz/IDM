package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final doc.g f116000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final doc.i f116001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1h.a f116002c;
    public final noc.e d;
    public final s1 e;
    public final PortfolioStrategyInformationScreenContract$Input f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f116003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f116004h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f116005j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f116006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f116007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f116008n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f116009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f116010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f116011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f116012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f116013t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f116014w;

    public m(r rVar, ViewController viewController, PortfolioStrategyInformationScreenContract$Input portfolioStrategyInformationScreenContract$Input, doc.i iVar, doc.g gVar, noc.e eVar, s1 s1Var, v1h.a aVar) {
        this.f116003g = rVar;
        this.f116000a = gVar;
        this.f116001b = iVar;
        this.f116002c = aVar;
        this.d = eVar;
        this.e = s1Var;
        this.f = portfolioStrategyInformationScreenContract$Input;
        this.f116004h = e4m.b.b(e4m.c.a(viewController));
        this.i = e4m.b.b(new db1.f(rVar, this, 3, 21));
        this.f116005j = e4m.b.b(new db1.f(rVar, this, 2, 21));
        this.k = e4m.b.b(new db1.f(rVar, this, 1, 21));
        this.f116006l = e4m.b.b(new db1.f(rVar, this, 0, 21));
        this.f116007m = e4m.b.b(new db1.f(rVar, this, 4, 21));
        this.f116008n = e4m.b.b(new db1.f(rVar, this, 6, 21));
        this.o = e4m.b.b(new db1.f(rVar, this, 5, 21));
        this.f116009p = e4m.b.b(new db1.f(rVar, this, 8, 21));
        this.f116010q = e4m.b.b(new db1.f(rVar, this, 7, 21));
        this.f116011r = e4m.b.b(new db1.f(rVar, this, 9, 21));
        this.f116012s = e4m.b.b(new db1.f(rVar, this, 10, 21));
        this.f116013t = e4m.b.b(new db1.f(rVar, this, 11, 21));
        this.u = e4m.b.b(new db1.f(rVar, this, 12, 21));
        this.v = e4m.b.b(new db1.f(rVar, this, 14, 21));
        this.f116014w = e4m.b.b(new db1.f(rVar, this, 13, 21));
    }

    public final r10.r b() {
        return new r10.r(new f61.a(new ioc.b(new goc.b(), new yoc.p())), new joc.a(new goc.b()), new ioc.d(new ioc.b(new goc.b(), new yoc.p())));
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.f116012s.get();
        yji.n nVar2 = (yji.n) this.f116013t.get();
        yji.n nVar3 = (yji.n) this.u.get();
        aah.h hVar = (aah.h) this.f116011r.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((aah.h) nVar, (aah.h) nVar2, (aah.h) nVar3, hVar);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f116006l.get();
        yji.d dVar2 = (yji.d) this.f116007m.get();
        yji.d dVar3 = (yji.d) this.o.get();
        yji.d dVar4 = (yji.d) this.f116010q.get();
        aah.i iVarD = ((u8h.b) this.f116003g.i).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, (aah.g) dVar2, (aah.g) dVar3, (aah.g) dVar4, a0k.b.l(iVarD, this.e, (aah.h) this.f116011r.get()));
    }
}
