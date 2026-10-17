package p37;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(TaxHubPaymentRecipientPickerScreenContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f74331b, inputData.f74330a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
