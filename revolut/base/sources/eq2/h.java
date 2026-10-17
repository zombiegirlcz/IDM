package eq2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(BankAccountSwitchingTargetSelectionScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new e(inputData.f64072a, wn2.a.PERSONAL, inputData.f64073b, inputData.f64074c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
