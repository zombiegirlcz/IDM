package jpd;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f177258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f177259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f177260c;
    public final LocalDate d;

    public a(LocalDate selectedDate, LocalDate displayedMonth, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(displayedMonth, "displayedMonth");
        this.f177258a = selectedDate;
        this.f177259b = displayedMonth;
        this.f177260c = localDate;
        this.d = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f177258a, aVar.f177258a) && Intrinsics.f(this.f177259b, aVar.f177259b) && Intrinsics.f(this.f177260c, aVar.f177260c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f177258a.hashCode() * 31, 31, this.f177259b);
        LocalDate localDate = this.f177260c;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
