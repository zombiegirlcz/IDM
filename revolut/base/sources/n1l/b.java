package n1l;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import jli.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final LocalDate a(TransferScheduleData transferScheduleData, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(transferScheduleData, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        LocalDateTime localDateTimeB = b(transferScheduleData, now);
        c cVar = transferScheduleData.f104286b;
        int i = a.f211412a[cVar.ordinal()];
        if (i == 1) {
            localDateTimeB = localDateTimeB.plusYears(1L);
        } else if (i == 2) {
            LocalDateTime localDateTimePlusMonths = localDateTimeB.plusMonths(1L);
            localDateTimeB = localDateTimePlusMonths.getDayOfMonth() > localDateTimeB.getDayOfMonth() ? localDateTimePlusMonths.withDayOfMonth(localDateTimeB.getDayOfMonth()) : localDateTimePlusMonths.withDayOfMonth(localDateTimePlusMonths.getMonth().length(localDateTimePlusMonths.toLocalDate().isLeapYear()));
        } else if (i == 3 || i == 4) {
            localDateTimeB = localDateTimeB.plusWeeks(cVar != c.PERIOD_SELECTION_WEEK ? 2L : 1L);
        } else if (i == 5) {
            localDateTimeB = localDateTimeB.plusDays(1L);
        }
        LocalDate localDate = localDateTimeB.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    public static final LocalDateTime b(TransferScheduleData transferScheduleData, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(transferScheduleData, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        long j2 = transferScheduleData.f104285a;
        if (j2 != 0) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
            if (!localDateTimeOfInstant.toLocalDate().equals(now.toLocalDate())) {
                return localDateTimeOfInstant;
            }
        }
        return now;
    }

    public static final boolean c(TransferScheduleData transferScheduleData, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(transferScheduleData, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        TransferScheduleEndsOn transferScheduleEndsOn = transferScheduleData.f104287c;
        if (transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date) {
            return Instant.ofEpochMilli(((TransferScheduleEndsOn.Date) transferScheduleData.f104287c).f104288a).atZone(ZoneId.systemDefault()).toLocalDate().compareTo((ChronoLocalDate) a(transferScheduleData, now)) >= 0;
        }
        if (Intrinsics.f(transferScheduleEndsOn, TransferScheduleEndsOn.Never.f104289a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean d(TransferScheduleData transferScheduleData, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(transferScheduleData, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        return ((transferScheduleData.f104285a > 0L ? 1 : (transferScheduleData.f104285a == 0L ? 0 : -1)) != 0 && !Intrinsics.f(b(transferScheduleData, now), now)) || ((transferScheduleData.f104286b != c.PERIOD_SELECTION_NONE) && c(transferScheduleData, now));
    }
}
