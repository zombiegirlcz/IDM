package b7f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import i6f.u0;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final emc.e f13038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfolioPerformanceExtensionContract$InputData f13039n;
    public final vki.a o;

    public h(emc.e templatesInteractor, ManagedPortfolioPerformanceExtensionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f13038m = templatesInteractor;
        this.f13039n = inputData;
        this.o = pyd.c.a(this, new c(new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, Z2(this.f13038m.d(this.f13039n.f91337a)), null, new b74.e(this, null, 4), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
