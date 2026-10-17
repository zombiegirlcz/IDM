package r36;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f251185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiExchangeSummaryContract$InputData f251186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f251187c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251189h;
    public final e4m.e i;

    public g(e eVar, f fVar, ViewController viewController, DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData) {
        this.f251187c = eVar;
        this.f251185a = viewController;
        this.f251186b = deFiExchangeSummaryContract$InputData;
        int i = 7;
        this.d = e4m.b.b(new qy7.f(eVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(eVar, this, 2, i));
        this.f = e4m.b.b(new qy7.f(eVar, this, 0, i));
        this.f251188g = e4m.b.b(new qy7.f(eVar, this, 4, i));
        this.f251189h = e4m.b.b(new qy7.f(eVar, this, 3, i));
        this.i = e4m.b.b(new qy7.f(eVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get(), (n) this.f251188g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f251189h.get());
    }
}
