package qr4;

import cli.g;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(FeeWaiverBottomDialogScreenContract$InputData inputData, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f69293a, inputData.f69294b, inputData.f69295c, inputData.d, inputData.e), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
