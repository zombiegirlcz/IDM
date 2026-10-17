package pdf;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f235166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f235167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f235168c;
    public final boolean d;
    public final List e;
    public final sel.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f235169g;

    public b(LocalDate startDate, LocalDate localDate, LocalDate localDate2, boolean z, List excludeDates, sel.a period, List availablePeriods) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f235166a = startDate;
        this.f235167b = localDate;
        this.f235168c = localDate2;
        this.d = z;
        this.e = excludeDates;
        this.f = period;
        this.f235169g = availablePeriods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f235166a, bVar.f235166a) && Intrinsics.f(this.f235167b, bVar.f235167b) && Intrinsics.f(this.f235168c, bVar.f235168c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f235169g, bVar.f235169g);
    }

    public final int hashCode() {
        int iHashCode = this.f235166a.hashCode() * 31;
        LocalDate localDate = this.f235167b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f235168c;
        return this.f235169g.hashCode() + ((this.f.hashCode() + p.a.d(j6.a.c((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
