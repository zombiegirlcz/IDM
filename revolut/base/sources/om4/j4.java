package om4;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j4 {
    public static long a(int i, LocalDateTime currentDate) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        LocalDateTime localDateTimeWithDayOfMonth = currentDate.withDayOfMonth(Math.min(currentDate.getMonth().length(Year.of(currentDate.getYear()).isLeap()), i));
        if (currentDate.compareTo((ChronoLocalDateTime<?>) localDateTimeWithDayOfMonth) < 0) {
            Intrinsics.h(localDateTimeWithDayOfMonth);
            return oi0.d.R(localDateTimeWithDayOfMonth);
        }
        ChronoUnit chronoUnit = ChronoUnit.MONTHS;
        LocalDateTime localDateTimeWithDayOfMonth2 = localDateTimeWithDayOfMonth.plus(1L, (TemporalUnit) chronoUnit).withDayOfMonth(Math.min(localDateTimeWithDayOfMonth.plus(1L, (TemporalUnit) chronoUnit).with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth(), i));
        Intrinsics.h(localDateTimeWithDayOfMonth2);
        return oi0.d.R(localDateTimeWithDayOfMonth2);
    }
}
