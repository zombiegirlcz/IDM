package iq4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends oki.h implements e {
    public final y o;

    public f(SkipRepaymentConfirmationDialogScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f69163a, inputData.f69164b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
