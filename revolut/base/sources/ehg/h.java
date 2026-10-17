package ehg;

import cli.n;
import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements f {
    public final y o;

    public h(n stateMapper, TravelMilesFlightDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f94281a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
