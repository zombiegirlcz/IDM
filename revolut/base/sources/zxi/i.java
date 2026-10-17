package zxi;

import cli.n;
import cli.y;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements g {
    public final y o;

    public i(n stateMapper, AirportLoungesPassActivityFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f99120a, inputData.f99121b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
