package phg;

import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements j {
    public final TravelMilesFlightSearchFilterOptionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f236309p;

    public l(cli.n stateMapper, TravelMilesFlightSearchFilterOptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        Set set = inputData.f94336b;
        m70.a.c(t0.f186434a);
        this.f236309p = mra.d.b(this, new g("", set, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236309p;
    }
}
