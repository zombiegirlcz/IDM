package vjg;

import java.time.MonthDay;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthDay f289741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MonthDay f289742b;

    public f(MonthDay start, MonthDay endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.f289741a = start;
        this.f289742b = endExclusive;
    }

    public final boolean a(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        MonthDay monthDayFrom = MonthDay.from(((l80.f) dateProvider).e());
        MonthDay monthDay = this.f289742b;
        MonthDay monthDay2 = this.f289741a;
        return monthDay.isAfter(monthDay2) ? !monthDayFrom.isBefore(monthDay2) && monthDayFrom.isBefore(monthDay) : !monthDayFrom.isBefore(monthDay2) || monthDayFrom.isBefore(monthDay);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f289741a, fVar.f289741a) && Intrinsics.f(this.f289742b, fVar.f289742b);
    }

    public final int hashCode() {
        return this.f289742b.hashCode() + (this.f289741a.hashCode() * 31);
    }
}
