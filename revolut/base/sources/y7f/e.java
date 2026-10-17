package y7f;

import cli.g;
import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qee.s;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(PortfolioInsightsPerformanceControllerContract$InputData inputData, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f91398b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
