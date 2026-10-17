package wp2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.direct_debits.BankAccountSwitchingDirectDebitsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(n stateMapper, BankAccountSwitchingDirectDebitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f64060a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
