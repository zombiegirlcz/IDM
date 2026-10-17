package y77;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$InputData;
import java.util.Set;
import om4.d0;
import vc.s;
import xsl.q;
import yji.n;
import z0h.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h87.d f311398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f311399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MarketDetailsRedesignScreenContract$InputData f311400c;
    public final c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f311401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f311402h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f311403j;
    public final e4m.e k;

    public g(c cVar, d dVar, MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData, h87.d dVar2, s1 s1Var) {
        this.d = cVar;
        this.f311398a = dVar2;
        this.f311399b = s1Var;
        this.f311400c = marketDetailsRedesignScreenContract$InputData;
        int i = 13;
        this.e = e4m.b.b(new q(cVar, this, 2, i));
        this.f = e4m.b.b(new q(cVar, this, 1, i));
        this.f311401g = e4m.b.b(new q(cVar, this, 0, i));
        this.f311402h = e4m.b.b(new q(cVar, this, 3, i));
        this.i = e4m.b.b(new q(cVar, this, 4, i));
        this.f311403j = e4m.b.b(new q(cVar, this, 6, i));
        this.k = e4m.b.b(new q(cVar, this, 5, i));
    }

    public final ou5.b b() {
        c cVar = this.d;
        yhl.e eVar = (yhl.e) cVar.d.E.get();
        s.j(eVar);
        zjh.c cVarA = cVar.e.a();
        e9h.d dVarD = cVar.f311362b.D();
        mk0.a aVarA = cVar.f.a();
        s.j(aVarA);
        d0 d0Var = new d0(aVarA);
        gte.a aVarB = cVar.f311364g.b();
        s.j(aVarB);
        return new ou5.b(eVar, cVarA, dVarD, d0Var, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        n nVar = (n) this.i.get();
        aah.h hVar = (aah.h) this.f311402h.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((aah.h) nVar, hVar);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f311401g.get();
        aah.i iVarD = ((u8h.b) this.d.f311366j).d();
        s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, a0k.b.l(iVarD, this.f311399b, (aah.h) this.f311402h.get()));
    }
}
