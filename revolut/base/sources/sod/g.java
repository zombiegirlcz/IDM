package sod;

import cli.n;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(TripsRemoveConfirmationContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f87638a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
