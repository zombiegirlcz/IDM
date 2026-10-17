package n6f;

import cli.y;
import cli.z;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements z {
    public final y o;

    public k(RebalanceDialogScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f91298a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
