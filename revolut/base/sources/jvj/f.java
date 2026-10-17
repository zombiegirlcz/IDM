package jvj;

import cli.y;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vim.i;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(TravelItineraryEditDatesScreenContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(i.b(inputData.f101647b, inputData.f101648c), inputData.f101647b, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
