package w7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import w50.g;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final emc.e f295520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PortfolioInsightsFlowContract$InputData f295521n;
    public final vki.a o;

    public f(emc.e templatesInteractor, PortfolioInsightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f295520m = templatesInteractor;
        this.f295521n = inputData;
        this.o = pyd.c.a(this, new a(null));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, this.f295520m.a(this.f295521n.f91377a), null, new g(this, (Continuation) null, 6), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
