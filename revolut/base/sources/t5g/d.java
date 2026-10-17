package t5g;

import cli.j;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f268105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelFlightsDatesSelectionScreenContract$Trip f268106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f268107c;
    public final LocalDate d;
    public final LocalDate e;

    public d(vim.e calendarDatesRange, TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip, LocalDate selectableDatesStart, LocalDate selectableDatesEnd, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
        Intrinsics.checkNotNullParameter(selectableDatesEnd, "selectableDatesEnd");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f268105a = calendarDatesRange;
        this.f268106b = travelFlightsDatesSelectionScreenContract$Trip;
        this.f268107c = selectableDatesStart;
        this.d = selectableDatesEnd;
        this.e = currentDate;
    }

    public static d a(d dVar, TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip) {
        vim.e calendarDatesRange = dVar.f268105a;
        LocalDate selectableDatesStart = dVar.f268107c;
        LocalDate selectableDatesEnd = dVar.d;
        LocalDate currentDate = dVar.e;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
        Intrinsics.checkNotNullParameter(selectableDatesEnd, "selectableDatesEnd");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        return new d(calendarDatesRange, travelFlightsDatesSelectionScreenContract$Trip, selectableDatesStart, selectableDatesEnd, currentDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f268105a.equals(dVar.f268105a) && Intrinsics.f(this.f268106b, dVar.f268106b) && this.f268107c.equals(dVar.f268107c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f268105a.hashCode() * 31;
        TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = this.f268106b;
        return this.e.hashCode() + y.a(y.a((iHashCode + (travelFlightsDatesSelectionScreenContract$Trip == null ? 0 : travelFlightsDatesSelectionScreenContract$Trip.hashCode())) * 31, 31, this.f268107c), 31, this.d);
    }
}
