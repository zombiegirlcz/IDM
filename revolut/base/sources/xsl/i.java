package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import java.util.Set;
import xf6.t1;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f308643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dtl.d f308644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1h.j f308645c;
    public final htl.g d;
    public final InvestOrdersListFeatureContract$InputData e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f308647h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f308648j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f308649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f308650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f308651n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f308652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f308653q;

    public i(p pVar, InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData, s1 s1Var, htl.g gVar, dtl.d dVar, d1h.j jVar) {
        this.f = pVar;
        this.f308643a = s1Var;
        this.f308644b = dVar;
        this.f308645c = jVar;
        this.d = gVar;
        this.e = investOrdersListFeatureContract$InputData;
        this.f308646g = e4m.b.b(new t1(pVar, this, 0, 25));
        this.f308647h = e4m.b.b(new t1(pVar, this, 3, 25));
        this.i = e4m.b.b(new t1(pVar, this, 2, 25));
        this.f308648j = e4m.b.b(new t1(pVar, this, 1, 25));
        this.k = e4m.b.b(new t1(pVar, this, 4, 25));
        this.f308649l = e4m.b.b(new t1(pVar, this, 6, 25));
        this.f308650m = e4m.b.b(new t1(pVar, this, 5, 25));
        this.f308651n = e4m.b.b(new t1(pVar, this, 7, 25));
        this.o = e4m.b.b(new t1(pVar, this, 9, 25));
        this.f308652p = e4m.b.b(new t1(pVar, this, 10, 25));
        this.f308653q = e4m.b.b(new t1(pVar, this, 8, 25));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.f308646g.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, (yji.n) this.f308651n.get(), dw3.l.m((d1h.e) this.k.get()), (yji.n) this.f308649l.get());
    }

    @Override // xki.e
    public final Set g() {
        u8h.c cVar = this.f.f308703r;
        aah.i iVarD = ((u8h.b) cVar).d();
        vc.s.j(iVarD);
        aah.g gVarL = a0k.b.l(iVarD, this.f308643a, (aah.h) this.f308646g.get());
        yji.d dVar = (yji.d) this.f308648j.get();
        gah.f fVarA = ((u8h.b) cVar).a();
        vc.s.j(fVarA);
        return ImmutableSet.of((yji.d) gVarL, dVar, (yji.d) dw3.l.l(fVarA, this.f308645c, (d1h.e) this.k.get()), (yji.d) this.f308650m.get());
    }
}
