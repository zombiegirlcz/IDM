package yhg;

import cli.g;
import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_segments.TravelMilesFlightSegmentsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements dli.b {
    public final y o;

    public b(c stateMapper, TravelMilesFlightSegmentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.b(this, new a(inputData.f94346a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
