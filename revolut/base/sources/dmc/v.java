package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116073a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f116074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f116075c;
    public final PortfolioAllocationsDetailsScreenContract$InputData d;
    public final r e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f116076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f116077h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f116078j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f116079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f116080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f116081n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f116082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f116083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f116084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f116085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f116086t;

    public v(r rVar, i iVar, BaseScreen baseScreen, PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData, s1 s1Var) {
        this.e = rVar;
        this.f116074b = baseScreen;
        this.f116075c = s1Var;
        this.d = portfolioAllocationsDetailsScreenContract$InputData;
        this.f = e4m.b.b(e4m.c.a(baseScreen));
        int i = 25;
        this.f116076g = e4m.b.b(new db1.f(rVar, this, 3, i));
        this.f116077h = e4m.b.b(new db1.f(rVar, this, 2, i));
        this.i = e4m.b.b(new db1.f(rVar, this, 4, i));
        this.f116078j = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.k = e4m.b.b(new db1.f(rVar, this, 0, i));
        this.f116079l = e4m.b.b(new db1.f(rVar, this, 5, i));
        this.f116080m = e4m.b.b(new db1.f(rVar, this, 6, i));
        this.f116081n = e4m.b.b(new db1.f(rVar, this, 7, i));
        this.o = e4m.b.b(new db1.f(rVar, this, 10, i));
        this.f116082p = e4m.b.b(new db1.f(rVar, this, 11, i));
        this.f116083q = e4m.b.b(new db1.f(rVar, this, 12, i));
        this.f116084r = e4m.b.b(new db1.f(rVar, this, 9, i));
        this.f116085s = e4m.b.b(new db1.f(rVar, this, 13, i));
        this.f116086t = e4m.b.b(new db1.f(rVar, this, 8, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f116073a) {
            case 0:
                yji.n nVar = (yji.n) this.f116081n.get();
                aah.h hVar = (aah.h) this.f116080m.get();
                a0k.b.m(hVar);
                return ImmutableSet.of((aah.h) nVar, hVar);
            default:
                yji.n nVar2 = (yji.n) this.f116081n.get();
                aah.h hVar2 = (aah.h) this.f116080m.get();
                a0k.b.m(hVar2);
                return ImmutableSet.of((aah.h) nVar2, hVar2);
        }
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f116073a) {
            case 0:
                yji.d dVar = (yji.d) this.k.get();
                yji.d dVar2 = (yji.d) this.f116079l.get();
                aah.i iVarD = ((u8h.b) this.e.i).d();
                vc.s.j(iVarD);
                return ImmutableSet.of((aah.g) dVar, (aah.g) dVar2, a0k.b.k(iVarD, this.f116075c, (aah.h) this.f116080m.get()));
            default:
                yji.d dVar3 = (yji.d) this.k.get();
                yji.d dVar4 = (yji.d) this.f116079l.get();
                aah.i iVarD2 = ((u8h.b) this.e.i).d();
                vc.s.j(iVarD2);
                return ImmutableSet.of((aah.g) dVar3, (aah.g) dVar4, a0k.b.k(iVarD2, this.f116075c, (aah.h) this.f116080m.get()));
        }
    }

    public v(r rVar, BaseScreen baseScreen, PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData, s1 s1Var) {
        this.e = rVar;
        this.f116074b = baseScreen;
        this.f116075c = s1Var;
        this.d = portfolioAllocationsDetailsScreenContract$InputData;
        this.f = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.f116076g = e4m.b.b(new db1.f(rVar, this, 3, i));
        this.f116077h = e4m.b.b(new db1.f(rVar, this, 2, i));
        this.i = e4m.b.b(new db1.f(rVar, this, 4, i));
        this.f116078j = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.k = e4m.b.b(new db1.f(rVar, this, 0, i));
        this.f116079l = e4m.b.b(new db1.f(rVar, this, 5, i));
        this.f116080m = e4m.b.b(new db1.f(rVar, this, 6, i));
        this.f116081n = e4m.b.b(new db1.f(rVar, this, 7, i));
        this.o = e4m.b.b(new db1.f(rVar, this, 10, i));
        this.f116082p = e4m.b.b(new db1.f(rVar, this, 11, i));
        this.f116083q = e4m.b.b(new db1.f(rVar, this, 12, i));
        this.f116084r = e4m.b.b(new db1.f(rVar, this, 9, i));
        this.f116085s = e4m.b.b(new db1.f(rVar, this, 13, i));
        this.f116086t = e4m.b.b(new db1.f(rVar, this, 8, i));
    }
}
