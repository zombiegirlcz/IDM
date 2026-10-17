package ubg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.TravelHotelsCancellationNetRefundScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tyc.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements f {
    public final y o;

    public g(l stateMapper, TravelHotelsCancellationNetRefundScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f93890a, inputData.f93891b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
