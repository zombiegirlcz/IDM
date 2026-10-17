package k27;

import at.r;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.sales.payment_options_picker.FreelancerPaymentOptionsPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(FreelancerPaymentOptionsPickerScreenContract$InputData inputData, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f74198a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
