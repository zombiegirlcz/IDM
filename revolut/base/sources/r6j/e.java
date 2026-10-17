package r6j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f251897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CommodityOrderReviewScreenContract$InputData f251898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f251899c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251901h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f251902j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f251903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f251904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f251905n;
    public final e4m.e o;

    public e(c cVar, d dVar, ViewController viewController, CommodityOrderReviewScreenContract$InputData commodityOrderReviewScreenContract$InputData) {
        this.f251899c = cVar;
        this.f251897a = viewController;
        this.f251898b = commodityOrderReviewScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.e = e4m.b.b(new qy7.f(cVar, this, 2, i));
        this.f = e4m.b.b(new qy7.f(cVar, this, 1, i));
        this.f251900g = e4m.b.b(new qy7.f(cVar, this, 0, i));
        this.f251901h = e4m.b.b(new qy7.f(cVar, this, 4, i));
        this.i = e4m.b.b(new qy7.f(cVar, this, 6, i));
        this.f251902j = e4m.b.b(new qy7.f(cVar, this, 5, i));
        this.k = e4m.b.b(new qy7.f(cVar, this, 7, i));
        this.f251903l = e4m.b.b(new qy7.f(cVar, this, 3, i));
        this.f251904m = e4m.b.b(new qy7.f(cVar, this, 8, i));
        this.f251905n = e4m.b.b(new qy7.f(cVar, this, 10, i));
        this.o = e4m.b.b(new qy7.f(cVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f251904m.get(), (n) this.f251902j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f251900g.get(), (yji.d) this.f251903l.get());
    }
}
