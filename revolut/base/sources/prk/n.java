package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements ptk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2h.g f239240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2h.e f239241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ptk.b f239242c;
    public final ptk.c d;
    public final ltk.b e;
    public final EtfDetailsFlowControllerContract$InputData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f239243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f239244h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f239245j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f239246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f239247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f239248n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f239249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f239250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f239251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f239252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f239253t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f239254w;

    public n(g0 g0Var, ptk.b bVar, ptk.c cVar, ViewController viewController, EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData, n2h.e eVar, n2h.g gVar, ltk.b bVar2) {
        this.f239243g = g0Var;
        this.f239240a = gVar;
        this.f239241b = eVar;
        this.f239242c = bVar;
        this.d = cVar;
        this.e = bVar2;
        this.f = etfDetailsFlowControllerContract$InputData;
        this.i = e4m.b.b(new ppd.i0(g0Var, this, 2, 22));
        this.f239245j = e4m.b.b(new ppd.i0(g0Var, this, 1, 22));
        this.k = e4m.b.b(new ppd.i0(g0Var, this, 0, 22));
        this.f239246l = e4m.b.b(e4m.c.a(viewController));
        this.f239247m = e4m.b.b(new ppd.i0(g0Var, this, 5, 22));
        this.f239248n = e4m.b.b(new ppd.i0(g0Var, this, 4, 22));
        this.o = e4m.b.b(new ppd.i0(g0Var, this, 3, 22));
        this.f239249p = e4m.b.b(new ppd.i0(g0Var, this, 6, 22));
        this.f239250q = e4m.b.b(new ppd.i0(g0Var, this, 7, 22));
        this.f239251r = e4m.b.b(new ppd.i0(g0Var, this, 9, 22));
        this.f239252s = e4m.b.b(new ppd.i0(g0Var, this, 8, 22));
        this.f239253t = e4m.b.b(new ppd.i0(g0Var, this, 11, 22));
        this.u = e4m.b.b(new ppd.i0(g0Var, this, 10, 22));
        this.v = e4m.b.b(new ppd.i0(g0Var, this, 12, 22));
        this.f239254w = e4m.b.b(new ppd.i0(g0Var, this, 13, 22));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize.add(this.f239249p.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f239250q.get());
        builderBuilderWithExpectedSize.add(this.f239252s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.f239245j.get());
        return j6.a.g(this.v, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.k.get(), (yji.d) this.o.get());
    }
}
