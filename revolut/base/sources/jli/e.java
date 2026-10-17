package jli;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Days;
import org.joda.time.Period;
import org.joda.time.Weeks;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Period f175841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Period f175842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Period f175843c;
    public static final Period d;
    public static final Period e;
    public static final Period f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Period f175844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Period f175845h;
    public static final Period i;

    static {
        Period period = Period.parse("P1D");
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        f175841a = period;
        Period period2 = Period.parse("P1Y");
        Intrinsics.checkNotNullExpressionValue(period2, "parse(...)");
        f175842b = period2;
        Period period3 = Period.parse("P1W");
        Intrinsics.checkNotNullExpressionValue(period3, "parse(...)");
        f175843c = period3;
        Period period4 = Period.parse("P7D");
        Intrinsics.checkNotNullExpressionValue(period4, "parse(...)");
        d = period4;
        Period period5 = Period.parse("P2W");
        Intrinsics.checkNotNullExpressionValue(period5, "parse(...)");
        e = period5;
        Period period6 = Period.parse("P14D");
        Intrinsics.checkNotNullExpressionValue(period6, "parse(...)");
        f = period6;
        Intrinsics.checkNotNullExpressionValue(Period.parse("P4W"), "parse(...)");
        Period period7 = Period.parse("P3M");
        Intrinsics.checkNotNullExpressionValue(period7, "parse(...)");
        f175844g = period7;
        Period period8 = Period.parse("P1M");
        Intrinsics.checkNotNullExpressionValue(period8, "parse(...)");
        f175845h = period8;
        Period period9 = Period.parse("P6M");
        Intrinsics.checkNotNullExpressionValue(period9, "parse(...)");
        i = period9;
    }

    public static final boolean a(Period period) {
        Weeks standardWeeks;
        if (!g(period) && !c(period) && !e(period) && !d(period)) {
            if (((period == null || (standardWeeks = period.toStandardWeeks()) == null) ? 0 : standardWeeks.getWeeks()) == 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(Period period) {
        Days standardDays;
        if (!g(period) && !c(period) && !e(period) && !d(period) && !f(period) && !a(period)) {
            if (((period == null || (standardDays = period.toStandardDays()) == null) ? 0 : standardDays.getDays()) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Period period) {
        if (!g(period)) {
            if ((period != null ? period.getMonths() : 0) == 6) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Period period) {
        if (!g(period) && !c(period) && !e(period)) {
            if ((period != null ? period.getMonths() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(Period period) {
        if (!g(period) && !c(period)) {
            if ((period != null ? period.getMonths() : 0) == 3) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(Period period) {
        Weeks standardWeeks;
        if (!g(period) && !c(period) && !e(period) && !d(period) && !a(period)) {
            int weeks = (period == null || (standardWeeks = period.toStandardWeeks()) == null) ? 0 : standardWeeks.getWeeks();
            if (weeks == 1 || weeks > 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(Period period) {
        return (period != null ? period.getYears() : 0) > 0;
    }

    public static final boolean h(java.time.Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return period.getYears() == 0 && period.getMonths() == 0 && period.getDays() > 0;
    }

    public static final boolean i(java.time.Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return period.getYears() == 0 && period.getMonths() > 0 && period.getDays() == 0;
    }

    public static final boolean j(Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return period.getYears() == 0 && period.getMonths() > 0 && period.getWeeks() == 0 && period.getDays() == 0;
    }

    public static final c k(Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        if (Intrinsics.f(period, f175841a)) {
            return c.PERIOD_SELECTION_DAY;
        }
        if (Intrinsics.f(period, f175843c) || Intrinsics.f(period, d)) {
            return c.PERIOD_SELECTION_WEEK;
        }
        if (Intrinsics.f(period, e) || Intrinsics.f(period, f)) {
            return c.PERIOD_SELECTION_BI_WEEKLY;
        }
        if (Intrinsics.f(period, f175845h)) {
            return c.PERIOD_SELECTION_MONTH;
        }
        if (Intrinsics.f(period, f175842b)) {
            return c.PERIOD_SELECTION_YEAR;
        }
        return null;
    }

    public static final Period l(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (d.f175840a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return f175841a;
            case 3:
                return f175843c;
            case 4:
                return e;
            case 5:
                return f175845h;
            case 6:
                return f175842b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
