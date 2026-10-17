package i9c;

import cli.n;
import cli.y;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(PaymentScheduleContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f84509a, inputData.f84510b, inputData.f84511c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
