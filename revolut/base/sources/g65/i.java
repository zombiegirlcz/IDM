package g65;

import cli.n;
import cli.y;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements g {
    public final y o;

    public i(n stateMapper, LoanSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f70367a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
