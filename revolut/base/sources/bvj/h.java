package bvj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerContract$InputData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryDatePickerContract$InputData f19137a;

    public h(TravelItineraryDatePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f19137a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f19131a;
        TravelItineraryDatePickerContract$InputData travelItineraryDatePickerContract$InputData = this.f19137a;
        g5 g5Var = new g5("DATE_PICKER", localDate == null ? travelItineraryDatePickerContract$InputData.f101639a : localDate, localDate, false, null, travelItineraryDatePickerContract$InputData.f101639a, travelItineraryDatePickerContract$InputData.f101640b, null, null, null, 0, 0, 1048376);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new c(u.c(g5Var), domainState.f19131a != null);
    }
}
