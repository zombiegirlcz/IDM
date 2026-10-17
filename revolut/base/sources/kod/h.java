package kod;

import cli.n;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(TripsEditOptionsContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f87609a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
