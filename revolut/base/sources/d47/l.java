package d47;

import a3e.u;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.TaxHubTransactionExportCategoryPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final y o;

    public l(TaxHubTransactionExportCategoryPickerScreenContract$InputData inputData, u stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new f(inputData.f74367a, inputData.f74368b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
