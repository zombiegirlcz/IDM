package t1f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsTransferScreenContract$InputData f267322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f267323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f267324c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f267325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f267326h;
    public final e4m.e i;

    public l(h hVar, e eVar, ViewController viewController, TradeRevPointsTransferScreenContract$InputData tradeRevPointsTransferScreenContract$InputData) {
        this.f267323b = hVar;
        this.f267322a = tradeRevPointsTransferScreenContract$InputData;
        this.f267324c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new t0b.l(hVar, this, 1, i));
        this.e = e4m.b.b(new t0b.l(hVar, this, 0, i));
        this.f = e4m.b.b(new t0b.l(hVar, this, 3, i));
        this.f267325g = e4m.b.b(new t0b.l(hVar, this, 2, i));
        this.f267326h = e4m.b.b(new t0b.l(hVar, this, 5, i));
        this.i = e4m.b.b(new t0b.l(hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f267325g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
