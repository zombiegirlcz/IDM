package nvl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static boolean a(ZonedDateTime targetDate, List marketClosedDates) {
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        Intrinsics.checkNotNullParameter(marketClosedDates, "marketClosedDates");
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek dayOfWeek2 = DayOfWeek.FRIDAY;
        DayOfWeek dayOfWeek3 = targetDate.getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek3, "getDayOfWeek(...)");
        if (dayOfWeek3.compareTo(dayOfWeek) < 0 || dayOfWeek3.compareTo(dayOfWeek2) > 0) {
            return true;
        }
        List list = marketClosedDates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(targetDate.toLocalDate(), (LocalDate) it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static ZonedDateTime b(ZonedDateTime targetDate, ZonedDateTime zonedDateTime, List marketClosedDates) {
        ZonedDateTime zonedDateTime2;
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        Intrinsics.checkNotNullParameter(marketClosedDates, "marketClosedDates");
        Iterator<Long> it8 = new kotlin.ranges.e(0L, zonedDateTime != null ? ebm.a.h(targetDate, zonedDateTime) : Long.MAX_VALUE).iterator();
        do {
            zonedDateTime2 = null;
            if (!((vim.g) it8).f289628c) {
                break;
            }
            ZonedDateTime zonedDateTimePlusDays = targetDate.plusDays(((m0) it8).nextLong());
            Intrinsics.h(zonedDateTimePlusDays);
            if (!a(zonedDateTimePlusDays, marketClosedDates)) {
                zonedDateTime2 = zonedDateTimePlusDays;
            }
        } while (zonedDateTime2 == null);
        return zonedDateTime2;
    }
}
