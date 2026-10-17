package evj;

import cli.y;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerContract$InputData;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements c {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final LocalTime f129976p;
    public final y o;

    static {
        LocalTime localTimeOf = LocalTime.of(12, 0);
        Intrinsics.checkNotNullExpressionValue(localTimeOf, "of(...)");
        f129976p = localTimeOf;
    }

    public i(TravelItineraryTimePickerContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        LocalTime localTime = inputData.f101642a;
        this.o = mra.d.b(this, new a(localTime == null ? f129976p : localTime), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
