package ieb;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$SlotSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f160684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f160685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f160686c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f160687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReservationCreationScreenContract$SlotSelection f160688h;

    public g(Data reservationPage, Data availabilityCalendar, Data fullDaySlots, Data availableTimes, Data timeSlots, Data alternativeTimeSlots, i iVar, ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection) {
        Intrinsics.checkNotNullParameter(reservationPage, "reservationPage");
        Intrinsics.checkNotNullParameter(availabilityCalendar, "availabilityCalendar");
        Intrinsics.checkNotNullParameter(fullDaySlots, "fullDaySlots");
        Intrinsics.checkNotNullParameter(availableTimes, "availableTimes");
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        Intrinsics.checkNotNullParameter(alternativeTimeSlots, "alternativeTimeSlots");
        this.f160684a = reservationPage;
        this.f160685b = availabilityCalendar;
        this.f160686c = fullDaySlots;
        this.d = availableTimes;
        this.e = timeSlots;
        this.f = alternativeTimeSlots;
        this.f160687g = iVar;
        this.f160688h = reservationCreationScreenContract$SlotSelection;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, i iVar, ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection, int i) {
        if ((i & 1) != 0) {
            data = gVar.f160684a;
        }
        Data reservationPage = data;
        if ((i & 2) != 0) {
            data2 = gVar.f160685b;
        }
        Data availabilityCalendar = data2;
        if ((i & 4) != 0) {
            data3 = gVar.f160686c;
        }
        Data fullDaySlots = data3;
        if ((i & 8) != 0) {
            data4 = gVar.d;
        }
        Data availableTimes = data4;
        if ((i & 16) != 0) {
            data5 = gVar.e;
        }
        Data timeSlots = data5;
        if ((i & 32) != 0) {
            data6 = gVar.f;
        }
        Data alternativeTimeSlots = data6;
        i iVar2 = (i & 64) != 0 ? gVar.f160687g : iVar;
        ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection2 = (i & 128) != 0 ? gVar.f160688h : reservationCreationScreenContract$SlotSelection;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(reservationPage, "reservationPage");
        Intrinsics.checkNotNullParameter(availabilityCalendar, "availabilityCalendar");
        Intrinsics.checkNotNullParameter(fullDaySlots, "fullDaySlots");
        Intrinsics.checkNotNullParameter(availableTimes, "availableTimes");
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        Intrinsics.checkNotNullParameter(alternativeTimeSlots, "alternativeTimeSlots");
        return new g(reservationPage, availabilityCalendar, fullDaySlots, availableTimes, timeSlots, alternativeTimeSlots, iVar2, reservationCreationScreenContract$SlotSelection2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f160684a, gVar.f160684a) && Intrinsics.f(this.f160685b, gVar.f160685b) && Intrinsics.f(this.f160686c, gVar.f160686c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f160687g, gVar.f160687g) && Intrinsics.f(this.f160688h, gVar.f160688h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f160686c, kii.e.c(this.f160685b, this.f160684a.hashCode() * 31, 31), 31), 31), 31), 31);
        i iVar = this.f160687g;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection = this.f160688h;
        return iHashCode + (reservationCreationScreenContract$SlotSelection != null ? reservationCreationScreenContract$SlotSelection.hashCode() : 0);
    }
}
