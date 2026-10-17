package avi;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.e5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreenContract$InputData;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftFlightDatePickerScreenContract$InputData f10045a;

    public h(AsftFlightDatePickerScreenContract$InputData inputData, i flightDatesFilterer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flightDatesFilterer, "flightDatesFilterer");
        this.f10045a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        LocalDate localDate = this.f10045a.f98895a;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate2 = domainState.f10041a;
        LocalDate localDate3 = localDate2 == null ? localDate : localDate2;
        Set set = domainState.f10042b;
        return new e(u.c(new g5("ID_FLIGHT_DATE_PICKER", localDate3, localDate2, false, null, localDate, localDate.plusMonths(6L), null, v.l(set != null ? new e5(set) : null), null, 0, 0, 1022776)));
    }
}
