package mpd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f207788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f207789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f207790c;
    public final LocalDate d;
    public final LocalDate e;
    public final boolean f;

    public b(LocalDate localDate, LocalDate localDate2, c cVar, LocalDate displayedMonth, LocalDate today, boolean z) {
        Intrinsics.checkNotNullParameter(displayedMonth, "displayedMonth");
        Intrinsics.checkNotNullParameter(today, "today");
        this.f207788a = localDate;
        this.f207789b = localDate2;
        this.f207790c = cVar;
        this.d = displayedMonth;
        this.e = today;
        this.f = z;
    }

    public static b a(b bVar, LocalDate localDate, LocalDate localDate2, c cVar, LocalDate localDate3, LocalDate localDate4, boolean z, int i) {
        if ((i & 1) != 0) {
            localDate = bVar.f207788a;
        }
        LocalDate localDate5 = localDate;
        if ((i & 2) != 0) {
            localDate2 = bVar.f207789b;
        }
        LocalDate localDate6 = localDate2;
        if ((i & 4) != 0) {
            cVar = bVar.f207790c;
        }
        c cVar2 = cVar;
        if ((i & 8) != 0) {
            localDate3 = bVar.d;
        }
        LocalDate displayedMonth = localDate3;
        if ((i & 16) != 0) {
            localDate4 = bVar.e;
        }
        LocalDate today = localDate4;
        if ((i & 32) != 0) {
            z = bVar.f;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(displayedMonth, "displayedMonth");
        Intrinsics.checkNotNullParameter(today, "today");
        return new b(localDate5, localDate6, cVar2, displayedMonth, today, z);
    }

    public final boolean b(LocalDate localDate) {
        LocalDate localDate2;
        LocalDate localDate3;
        return (localDate == null || (localDate2 = this.f207788a) == null || (localDate3 = this.f207789b) == null || localDate2.isBefore(localDate) || localDate3.isBefore(localDate2) || localDate3.isAfter(this.e)) ? false : true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f207788a, bVar.f207788a) && Intrinsics.f(this.f207789b, bVar.f207789b) && this.f207790c == bVar.f207790c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        LocalDate localDate = this.f207788a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f207789b;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        c cVar = this.f207790c;
        return Boolean.hashCode(this.f) + y.a(y.a((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
