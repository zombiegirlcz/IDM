package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements quk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final quk.b f239087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final quk.c f239088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StockDetailsFlowControllerContract$InputData f239089c;
    public final n2h.e d;
    public final n2h.g e;
    public final ltk.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f239090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f239091h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f239092j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f239093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f239094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f239095n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f239096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f239097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f239098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f239099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f239100t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f239101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f239102x;

    public e0(g0 g0Var, quk.b bVar, quk.c cVar, ViewController viewController, StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData, n2h.e eVar, n2h.g gVar, ltk.b bVar2) {
        this.f239090g = g0Var;
        this.f239087a = bVar;
        this.f239088b = cVar;
        this.f239089c = stockDetailsFlowControllerContract$InputData;
        this.d = eVar;
        this.e = gVar;
        this.f = bVar2;
        this.i = e4m.b.b(new ppd.i0(g0Var, this, 1, 28));
        this.f239092j = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.k = e4m.b.b(new ppd.i0(g0Var, this, 4, i));
        this.f239093l = e4m.b.b(new ppd.i0(g0Var, this, 3, i));
        this.f239094m = e4m.b.b(new ppd.i0(g0Var, this, 2, i));
        this.f239095n = e4m.b.b(new ppd.i0(g0Var, this, 6, i));
        this.o = e4m.b.b(new ppd.i0(g0Var, this, 5, i));
        this.f239096p = e4m.b.b(new ppd.i0(g0Var, this, 7, i));
        this.f239097q = e4m.b.b(new ppd.i0(g0Var, this, 0, i));
        this.f239098r = e4m.b.b(new ppd.i0(g0Var, this, 8, i));
        this.f239099s = e4m.b.b(new ppd.i0(g0Var, this, 9, i));
        this.f239100t = e4m.b.b(new ppd.i0(g0Var, this, 10, i));
        this.u = e4m.b.b(new ppd.i0(g0Var, this, 11, i));
        this.v = e4m.b.b(new ppd.i0(g0Var, this, 12, i));
        this.f239101w = e4m.b.b(new ppd.i0(g0Var, this, 13, i));
        this.f239102x = e4m.b.b(new ppd.i0(g0Var, this, 14, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
        builderBuilderWithExpectedSize.add(this.f239100t.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.u.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f239101w.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f239102x.get());
        return j6.a.g(this.f239096p, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f239098r.get(), (yji.d) this.f239099s.get());
    }
}
