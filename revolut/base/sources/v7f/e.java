package v7f;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import i6f.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import v25.k;
import v6l.b0;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final emc.e f286629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PortfolioInsightsFlowContract$InputData f286630n;
    public final vki.a o;

    public e(emc.e templatesInteractor, PortfolioInsightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f286629m = templatesInteractor;
        this.f286630n = inputData;
        this.o = pyd.c.a(this, new a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, pdh.c.FIVE_YEARS, true));
    }

    @Override // yji.n
    public final void H2() {
        Flow flowB = this.o.B(new b0(26));
        PortfolioInsightsFlowContract$InputData portfolioInsightsFlowContract$InputData = this.f286630n;
        String str = portfolioInsightsFlowContract$InputData.f91377a;
        emc.e eVar = this.f286629m;
        n.l2(this, t1.h(Z2(boh.f.e(zh9.u0.m(flowB, eVar.a(str)), new k(this, 20))), 200L, new b0(27)), null, new d(this, null, 0), 3);
        n.l2(this, Z2(eVar.d(portfolioInsightsFlowContract$InputData.f91377a)), null, new d(this, null, 1), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
