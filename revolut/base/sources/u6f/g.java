package u6f;

import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements e {
    public final y o;

    public g(ManagedPortfolioFeesInfoControllerContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f91321a, inputData.f91322b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
