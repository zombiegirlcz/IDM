package r6j;

import b7j.j;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData;
import java.util.Set;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityOrderEditScreenContract$InputData f251868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f251869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251870c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251872h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f251873j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f251874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f251875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f251876n;

    public b(c cVar, d dVar, ViewController viewController, CommodityOrderEditScreenContract$InputData commodityOrderEditScreenContract$InputData) {
        this.f251869b = cVar;
        this.f251868a = commodityOrderEditScreenContract$InputData;
        this.f251870c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new qy7.f(cVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(cVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(cVar, this, 3, i));
        this.f251871g = e4m.b.b(new qy7.f(cVar, this, 2, i));
        this.f251872h = e4m.b.b(new qy7.f(cVar, this, 5, i));
        this.i = e4m.b.b(new qy7.f(cVar, this, 6, i));
        this.f251873j = e4m.b.b(new qy7.f(cVar, this, 7, i));
        this.k = e4m.b.b(new qy7.f(cVar, this, 9, i));
        this.f251874l = e4m.b.b(new qy7.f(cVar, this, 10, i));
        this.f251875m = e4m.b.b(new qy7.f(cVar, this, 8, i));
        this.f251876n = e4m.b.b(new qy7.f(cVar, this, 4, i));
    }

    public final j b() {
        c cVar = this.f251869b;
        n nVarB = cVar.f251881h.b();
        fk3.a aVarA = cVar.f251878b.a();
        s.j(aVarA);
        return new j(nVarB, aVarA, (l6j.b) cVar.H.get());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f251871g.get());
    }
}
