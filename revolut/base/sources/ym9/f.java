package ym9;

import cli.y;
import com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet.PayeesOverviewInfoBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(h stateMapper, PayeesOverviewInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f79023a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
