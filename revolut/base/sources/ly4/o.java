package ly4;

import cli.y;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements dli.b {
    public final y o;

    public o(cli.n stateMapper, DirectDebitConfirmScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new h(inputData.f69857a, inputData.f69858b, inputData.f69859c, inputData.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
