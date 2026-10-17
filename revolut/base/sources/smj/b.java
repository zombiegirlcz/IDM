package smj;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements dli.b {
    public final y o;

    public b(EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, inputData, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
