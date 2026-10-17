package h5b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$MaintenanceMargin$Destination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f149532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2b.j f149533n;
    public final nlh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f149534p;

    public m(c input, p2b.j cfdShareablePerformanceInteractor, nlh.b wealthTradeCommandProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cfdShareablePerformanceInteractor, "cfdShareablePerformanceInteractor");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        this.f149532m = input;
        this.f149533n = cfdShareablePerformanceInteractor;
        this.o = wealthTradeCommandProvider;
        this.f149534p = new Data(null, null, false, 7, null);
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, nim.a.v(p2b.j.b(this.f149533n, this.f149532m.f149524a, null, 6), new h3d.a(18)), null, new gul.n(this, null, 18), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f149534p;
    }

    @Override // h5b.b
    public final void e3() {
        V2(new gvc.m(this, null, 6), new yi5.b(29));
    }

    @Override // h5b.b
    public final void f3() {
        A2(new CfdTradingFeatureConfig$MaintenanceMargin$Destination(this.f149532m.f149524a));
    }
}
