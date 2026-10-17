package w5j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$InputData;
import java.util.Set;
import vzc.j;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f295334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CommodityPositionDetailsControllerContract$InputData f295335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f295336c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f295337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f295338h;
    public final e4m.e i;

    public e(b bVar, ViewController viewController, CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData) {
        this.f295336c = bVar;
        this.f295334a = viewController;
        this.f295335b = commodityPositionDetailsControllerContract$InputData;
        int i = 17;
        this.d = e4m.b.b(new j(bVar, this, 2, i));
        this.e = e4m.b.b(new j(bVar, this, 1, i));
        this.f = e4m.b.b(new j(bVar, this, 0, i));
        this.f295337g = e4m.b.b(new j(bVar, this, 3, i));
        this.f295338h = e4m.b.b(new j(bVar, this, 4, i));
        this.i = e4m.b.b(new j(bVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f295337g.get(), (n) this.f295338h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
