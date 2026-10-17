package r6j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityTargetPriceScreenContract$InputData f251909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f251910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251911c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(c cVar, d dVar, ViewController viewController, CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData) {
        this.f251910b = cVar;
        this.f251909a = commodityTargetPriceScreenContract$InputData;
        this.f251911c = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.d = e4m.b.b(new qy7.f(cVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(cVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(cVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
