package mzi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.feature.spending_analytics.api.R$string;
import gqj.h;
import java.time.ZoneId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Months;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    static Clause a(b bVar, Interval interval, Custom custom, boolean z, ZoneId zoneId, int i) {
        Custom custom2 = (i & 2) != 0 ? null : custom;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) == 0;
        boolean z6 = (i & 16) == 0;
        ZoneId zoneId2 = (i & 32) != 0 ? null : zoneId;
        e eVar = ((h) bVar).f145759a;
        Intrinsics.checkNotNullParameter(interval, "interval");
        if (!z6) {
            DateTime dateTimeWithTimeAtStartOfDay = ((f) eVar).g().withDayOfWeek(1).withTimeAtStartOfDay();
            DateTime dateTimeWithTimeAtStartOfDay2 = dateTimeWithTimeAtStartOfDay.plusWeeks(1).minusDays(1).withTimeAtStartOfDay();
            if (dateTimeWithTimeAtStartOfDay.equals(interval.getStart().withTimeAtStartOfDay()) && Intrinsics.f(dateTimeWithTimeAtStartOfDay2, interval.getEnd().withTimeAtStartOfDay())) {
                return new TextLocalisedClause(R$string.analytics_transactions_filter_this_week, null, custom2, 10);
            }
        }
        if (!z6) {
            DateTime dateTimeWithTimeAtStartOfDay3 = ((f) eVar).g().withDayOfMonth(1).withTimeAtStartOfDay();
            DateTime dateTimeWithTimeAtStartOfDay4 = dateTimeWithTimeAtStartOfDay3.plusMonths(1).minusDays(1).withTimeAtStartOfDay();
            if (dateTimeWithTimeAtStartOfDay3.equals(interval.getStart().withTimeAtStartOfDay()) && Intrinsics.f(dateTimeWithTimeAtStartOfDay4, interval.getEnd().withTimeAtStartOfDay())) {
                return new TextLocalisedClause(R$string.analytics_transactions_filter_this_month, null, custom2, 10);
            }
        }
        if (!z6) {
            DateTime dateTimeWithTimeAtStartOfDay5 = ((f) eVar).g().withDayOfYear(1).withTimeAtStartOfDay();
            DateTime dateTimeWithTimeAtStartOfDay6 = dateTimeWithTimeAtStartOfDay5.plusYears(1).minusDays(1).withTimeAtStartOfDay();
            if (dateTimeWithTimeAtStartOfDay5.equals(interval.getStart().withTimeAtStartOfDay()) && Intrinsics.f(dateTimeWithTimeAtStartOfDay6, interval.getEnd().withTimeAtStartOfDay())) {
                return new TextLocalisedClause(R$string.analytics_transactions_filter_this_year, null, custom2, 10);
            }
        }
        if (h.b(interval) && interval.getStart().getYear() == ((f) eVar).g().getYear()) {
            return new TimeClause(interval.getStartMillis(), h.f145757b, custom2, zoneId2);
        }
        if (h.b(interval)) {
            return new TimeClause(interval.getStartMillis(), h.d, custom2, zoneId2);
        }
        if (interval.getStart().getYear() == interval.getEnd().getYear() && interval.getStart().getDayOfYear() == 1 && interval.getEnd().getDayOfYear() == interval.getEnd().dayOfYear().getMaximumValue()) {
            return new TimeClause(interval.getStartMillis(), h.f, custom2, zoneId2);
        }
        if (z4 && interval.getStart().getYear() != interval.getEnd().getYear()) {
            TimeClause.Format.DayAndMonth dayAndMonth = h.e;
            Custom custom3 = custom2;
            return new CompositeClause(v.k(new TimeClause(interval.getStartMillis(), dayAndMonth, custom2, zoneId2), new TimeClause(interval.getEndMillis(), dayAndMonth, custom2, zoneId2)), new TextClause(" - ", (Style) custom3, (Integer) null, false, (o9) null, (List) null, 124), custom3, null, 8);
        }
        if (z3) {
            if (Months.monthsBetween(interval.getStart(), interval.getEnd().plusMonths(1).withDayOfMonth(1)).getMonths() > 1) {
                DateTime dateTimeG = ((f) eVar).g();
                if (dateTimeG.getYear() == interval.getStart().getYear() && dateTimeG.getYear() == interval.getEnd().getYear()) {
                    long startMillis = interval.getStartMillis();
                    TimeClause.Format.Month month = h.f145757b;
                    return new CompositeClause(v.k(new TimeClause(startMillis, month, custom2, zoneId2), new TimeClause(interval.getEndMillis(), month, custom2, zoneId2)), new TextClause(" - ", (Style) custom2, (Integer) null, false, (o9) null, (List) null, 124), null, null, 12);
                }
                long startMillis2 = interval.getStartMillis();
                TimeClause.Format.Month month2 = h.f145758c;
                TimeClause timeClause = new TimeClause(startMillis2, month2, custom2, zoneId2);
                long startMillis3 = interval.getStartMillis();
                TimeClause.Format.Year year = h.f;
                ZoneId zoneId3 = zoneId2;
                Custom custom4 = custom2;
                return new CompositeClause(v.k(timeClause, new TimeClause(startMillis3, year, custom2, zoneId2), new TextClause("-", (Style) custom4, (Integer) null, false, (o9) null, (List) null, 124), new TimeClause(interval.getEndMillis(), month2, custom4, zoneId3), new TimeClause(interval.getEndMillis(), year, custom4, zoneId3)), new TextClause(" ", (Style) custom4, (Integer) null, false, (o9) null, (List) null, 124), null, null, 12);
            }
        }
        return new TimeRangeClause(interval.getStartMillis(), interval.getEndMillis(), zoneId2, custom2);
    }
}
