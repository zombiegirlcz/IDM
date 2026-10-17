package w6f;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.return_breakdown.ManagedPortfolioReturnBreakdownControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(n stateMapper, ManagedPortfolioReturnBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f91324a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
