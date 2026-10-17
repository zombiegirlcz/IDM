package f47;

import at.r;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.TaxHubTransactionExportCurrencyPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final y o;

    public l(TaxHubTransactionExportCurrencyPickerScreenContract$InputData inputData, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new f(inputData.f74369a, inputData.f74370b, inputData.f74371c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
