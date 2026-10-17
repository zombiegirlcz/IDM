package su6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData inputData, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f73704a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
