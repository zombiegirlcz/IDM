package ee3;

import he3.m;
import he3.n;
import he3.o;
import he3.p;
import he3.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final LocalDate a(m mVar, LocalDate date) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        int dayOfMonth = date.dayOfMonth().withMaximumValue().getDayOfMonth();
        int i = mVar.f151567a;
        t tVar = mVar.f151568b;
        LocalDate localDateWithDayOfMonth = date.withDayOfMonth(Math.min(i, dayOfMonth));
        LocalDate localDatePlusMonths = localDateWithDayOfMonth.plusMonths(1);
        if (localDatePlusMonths.getDayOfWeek() >= 6 && tVar != t.SAME_DAY) {
            if (tVar == t.DAY_BEFORE) {
                localDatePlusMonths = localDatePlusMonths.withDayOfWeek(5);
            } else if (tVar == t.DAY_AFTER) {
                localDatePlusMonths = localDatePlusMonths.plusWeeks(1).withDayOfWeek(1);
            }
        }
        int dayOfWeek = localDateWithDayOfMonth.getDayOfWeek();
        t tVar2 = t.DAY_BEFORE;
        if (tVar == tVar2 && date.compareTo((ReadablePartial) localDatePlusMonths) >= 0) {
            Intrinsics.h(localDatePlusMonths);
            return localDatePlusMonths;
        }
        if (dayOfWeek >= 6 && tVar != t.SAME_DAY) {
            if (tVar == tVar2) {
                LocalDate localDateWithDayOfWeek = localDateWithDayOfMonth.withDayOfWeek(5);
                Intrinsics.checkNotNullExpressionValue(localDateWithDayOfWeek, "withDayOfWeek(...)");
                return localDateWithDayOfWeek;
            }
            if (tVar == t.DAY_AFTER) {
                LocalDate localDateWithDayOfWeek2 = localDateWithDayOfMonth.plusWeeks(1).withDayOfWeek(1);
                Intrinsics.checkNotNullExpressionValue(localDateWithDayOfWeek2, "withDayOfWeek(...)");
                return localDateWithDayOfWeek2;
            }
        }
        return localDateWithDayOfMonth;
    }

    public static final Interval b(p pVar, LocalDate date) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        Interval intervalC = c(pVar, date);
        if (pVar instanceof m) {
            if (intervalC.isAfter(date.toDateTimeAtStartOfDay())) {
                LocalDate localDateMinusMonths = date.minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "minusMonths(...)");
                return c(pVar, localDateMinusMonths);
            }
            if (intervalC.isBefore(date.toDateTimeAtStartOfDay())) {
                LocalDate localDatePlusMonths = date.plusMonths(1);
                Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
                return c(pVar, localDatePlusMonths);
            }
        }
        return intervalC;
    }

    public static final Interval c(p periodPreferences, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
        if (periodPreferences instanceof m) {
            m periodPreferences2 = (m) periodPreferences;
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            Intrinsics.checkNotNullParameter(periodPreferences2, "periodPreferences");
            LocalDate localDateA = a(periodPreferences2, localDate);
            LocalDate localDatePlusMonths = localDate.plusMonths(1);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
            LocalDate localDateA2 = a(periodPreferences2, localDatePlusMonths);
            if (localDateA2.compareTo((ReadablePartial) localDateA) <= 0) {
                LocalDate localDatePlusMonths2 = localDateA.plusMonths(2);
                Intrinsics.checkNotNullExpressionValue(localDatePlusMonths2, "plusMonths(...)");
                localDateA2 = a(periodPreferences2, localDatePlusMonths2);
            }
            return new Interval(localDateA.toDateTimeAtStartOfDay().toDate().getTime(), localDateA2.toDateTimeAtStartOfDay().toDate().getTime() - 1);
        }
        if (!(periodPreferences instanceof n)) {
            if (!(periodPreferences instanceof o)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            Intrinsics.checkNotNullParameter((o) periodPreferences, "periodPreferences");
            DateTime dateTimeAtStartOfDay = localDate.withDayOfYear(1).toDateTimeAtStartOfDay();
            return new Interval(dateTimeAtStartOfDay.getMillis(), dateTimeAtStartOfDay.plusYears(1).getMillis() - 1);
        }
        n periodPreferences3 = (n) periodPreferences;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(periodPreferences3, "periodPreferences");
        int dayOfWeek = localDate.getDayOfWeek();
        int i = periodPreferences3.f151569a;
        if (dayOfWeek < i) {
            DateTime dateTimeAtStartOfDay2 = localDate.withDayOfWeek(i).toDateTimeAtStartOfDay();
            return new Interval(dateTimeAtStartOfDay2.minusWeeks(1).getMillis(), dateTimeAtStartOfDay2.getMillis() - 1);
        }
        DateTime dateTimeAtStartOfDay3 = localDate.withDayOfWeek(i).toDateTimeAtStartOfDay();
        return new Interval(dateTimeAtStartOfDay3.getMillis(), dateTimeAtStartOfDay3.plusWeeks(1).getMillis() - 1);
    }
}
