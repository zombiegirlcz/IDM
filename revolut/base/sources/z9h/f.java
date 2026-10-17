package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;
import vc.s;
import z0g.k0;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f320413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f320414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1h.j f320415c;
    public final f1h.f d;
    public final InvestTransactionsListContract$InputData e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f320416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f320417h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f320418j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f320419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f320420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f320421n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f320422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f320423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f320424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f320425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f320426t;
    public final e4m.e u;

    public f(d dVar, ViewController viewController, InvestTransactionsListContract$InputData investTransactionsListContract$InputData, ScreenContentRecyclerView screenContentRecyclerView, f1h.f fVar, s1 s1Var, d1h.j jVar) {
        this.f = dVar;
        this.f320413a = s1Var;
        this.f320414b = screenContentRecyclerView;
        this.f320415c = jVar;
        this.d = fVar;
        this.e = investTransactionsListContract$InputData;
        this.f320416g = e4m.b.b(new k0(dVar, this, 0, 15));
        this.f320417h = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.i = e4m.b.b(new k0(dVar, this, 3, i));
        this.f320418j = e4m.b.b(new k0(dVar, this, 2, i));
        this.k = e4m.b.b(new k0(dVar, this, 1, i));
        this.f320419l = e4m.b.b(new k0(dVar, this, 5, i));
        this.f320420m = e4m.b.b(new k0(dVar, this, 4, i));
        this.f320421n = e4m.b.b(new k0(dVar, this, 6, i));
        this.o = e4m.b.b(new k0(dVar, this, 8, i));
        this.f320422p = e4m.b.b(new k0(dVar, this, 7, i));
        this.f320423q = e4m.b.b(new k0(dVar, this, 9, i));
        this.f320424r = e4m.b.b(new k0(dVar, this, 11, i));
        this.f320425s = e4m.b.b(new k0(dVar, this, 12, i));
        this.f320426t = e4m.b.b(new k0(dVar, this, 13, i));
        this.u = e4m.b.b(new k0(dVar, this, 10, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.f320416g.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, dw3.l.m((d1h.e) this.f320421n.get()), (yji.n) this.f320423q.get(), (yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        u8h.c cVar = this.f.f320409t;
        aah.i iVarD = ((u8h.b) cVar).d();
        s.j(iVarD);
        aah.g gVarL = a0k.b.l(iVarD, this.f320413a, (aah.h) this.f320416g.get());
        yji.d dVar = (yji.d) this.k.get();
        yji.d dVar2 = (yji.d) this.f320420m.get();
        gah.f fVarA = ((u8h.b) cVar).a();
        s.j(fVarA);
        return ImmutableSet.of((yji.d) gVarL, dVar, dVar2, (yji.d) dw3.l.l(fVarA, this.f320415c, (d1h.e) this.f320421n.get()), (yji.d) this.f320422p.get());
    }
}
