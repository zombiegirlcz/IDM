package g85;

import cli.y;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public g(StrategyPickerContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new b(inputData.f70561a, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
