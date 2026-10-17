package com.revolut.feature.travel.flights.impl.ui.screen.dates_selection;

import cli.g;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import oki.h;
import t5g.f;
import vim.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements f {
    public final y o;

    public a(b stateMapper, TravelFlightsDatesSelectionScreenContract$InputData inputData, e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        LocalDate localDateE = ((l80.f) dateProvider).e();
        LocalDate localDatePlusDays = localDateE.plusDays(365L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        vim.e eVarB = i.b(localDateE, localDatePlusDays);
        LocalDate localDate = inputData.f93320a;
        LocalDate localDate2 = inputData.f93321b;
        TravelFlightsDatesSelectionScreenContract$Trip oneWayTrip = (localDate == null || localDate2 == null) ? localDate != null ? new TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip(localDate) : localDate2 != null ? new TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip(localDate2) : null : I2(localDate, localDate2);
        LocalDate localDatePlusDays2 = localDateE.plusDays(365L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
        this.o = d.b(this, new t5g.d(eVarB, oneWayTrip, localDateE, localDatePlusDays2, localDateE), stateMapper, null, false, 12);
    }

    public static TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip I2(LocalDate localDate, LocalDate localDate2) {
        vim.e eVarB = localDate2.isBefore(localDate) ? i.b(localDate2, localDate) : i.b(localDate, localDate2);
        return new TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip((LocalDate) eVarB.f289621a, (LocalDate) eVarB.f289622b);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
