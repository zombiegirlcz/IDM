package g6g;

import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreenContract$InputData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(h stateMapper, TravelFlightsItineraryPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ArrayList arrayList = inputData.f93350a;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("An itinerary preview requires at least one bound");
        }
        int i = inputData.f93351b;
        Integer numValueOf = (i < 0 || i >= inputData.f93350a.size()) ? null : Integer.valueOf(i);
        this.o = mra.d.b(this, new d(numValueOf != null ? numValueOf.intValue() : 0, arrayList, inputData.f93352c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
