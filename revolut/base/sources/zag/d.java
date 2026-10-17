package zag;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.e f320688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vim.d f320689c;
    public final LocalDate d;

    public d(Data bookingDetails, vim.e calendarDatesRange, vim.d dVar, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f320687a = bookingDetails;
        this.f320688b = calendarDatesRange;
        this.f320689c = dVar;
        this.d = currentDate;
    }

    public static d a(d dVar, Data bookingDetails, vim.d dVar2, int i) {
        if ((i & 1) != 0) {
            bookingDetails = dVar.f320687a;
        }
        vim.e calendarDatesRange = dVar.f320688b;
        LocalDate currentDate = dVar.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        return new d(bookingDetails, calendarDatesRange, dVar2, currentDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f320687a, dVar.f320687a) && this.f320688b.equals(dVar.f320688b) && Intrinsics.f(this.f320689c, dVar.f320689c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f320688b.hashCode() + (this.f320687a.hashCode() * 31)) * 31;
        vim.d dVar = this.f320689c;
        return this.d.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
