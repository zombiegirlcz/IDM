package g45;

import cli.g;
import cli.y;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(AccountDetailsControllerContract$InputData inputData, f mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new c(inputData.f70289a), mapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
