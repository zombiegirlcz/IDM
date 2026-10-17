package f7f;

import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(ManagedPortfolioDetailsActionsScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f91349a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
