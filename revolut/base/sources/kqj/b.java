package kqj;

import h30.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kqj.c;
import lzi.d;
import lzi.e;
import lzi.f;
import lzi.g;
import lzi.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final String a(f fVar) {
        switch (a.f188429a[fVar.ordinal()]) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final f b(String str) {
        switch (str.hashCode()) {
            case -2015173360:
                if (str.equals("MONDAY")) {
                    return f.MONDAY;
                }
                break;
            case -1940284966:
                if (str.equals("THURSDAY")) {
                    return f.THURSDAY;
                }
                break;
            case -1837857328:
                if (str.equals("SUNDAY")) {
                    return f.SUNDAY;
                }
                break;
            case -1331574855:
                if (str.equals("SATURDAY")) {
                    return f.SATURDAY;
                }
                break;
            case -259361235:
                if (str.equals("TUESDAY")) {
                    return f.TUESDAY;
                }
                break;
            case -114841802:
                if (str.equals("WEDNESDAY")) {
                    return f.WEDNESDAY;
                }
                break;
            case 2082011487:
                if (str.equals("FRIDAY")) {
                    return f.FRIDAY;
                }
                break;
        }
        throw new IllegalStateException("Unexpected analytics spending cycle week day: ".concat(str).toString());
    }

    public static final h c(c cVar) {
        String str;
        d dVar;
        lzi.b bVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.getWeekly() != null) {
            return new g(b(cVar.getWeekly().getWeekDay()));
        }
        if (cVar.getDayInMonth() != null) {
            int startDay = cVar.getDayInMonth().getStartDay();
            String behaviour = cVar.getDayInMonth().getBehaviour();
            int iHashCode = behaviour.hashCode();
            if (iHashCode == -937890937) {
                if (behaviour.equals("BEFORE_WEEKEND")) {
                    bVar = lzi.b.BEFORE_WEEKEND;
                    return new lzi.c(startDay, bVar);
                }
                throw new IllegalStateException("Unexpected analytics spending cycle day in month behaviour: ".concat(behaviour).toString());
            }
            if (iHashCode == -619366204) {
                if (behaviour.equals("AFTER_WEEKEND")) {
                    bVar = lzi.b.AFTER_WEEKEND;
                    return new lzi.c(startDay, bVar);
                }
                throw new IllegalStateException("Unexpected analytics spending cycle day in month behaviour: ".concat(behaviour).toString());
            }
            if (iHashCode == 66409183 && behaviour.equals("EXACT")) {
                bVar = lzi.b.EXACT;
                return new lzi.c(startDay, bVar);
            }
            throw new IllegalStateException("Unexpected analytics spending cycle day in month behaviour: ".concat(behaviour).toString());
        }
        if (cVar.getWeekdayInMonth() != null) {
            f fVarB = b(cVar.getWeekdayInMonth().getWeekDay());
            String behaviour2 = cVar.getWeekdayInMonth().getBehaviour();
            if (Intrinsics.f(behaviour2, "FIRST")) {
                dVar = d.FIRST;
            } else {
                if (!Intrinsics.f(behaviour2, "LAST")) {
                    throw new IllegalStateException(l.r("Unexpected analytics spending cycle week day in month behaviour: ", behaviour2));
                }
                dVar = d.LAST;
            }
            return new e(fVarB, dVar);
        }
        c.C1066c weekly = cVar.getWeekly();
        String strP = weekly != null ? p.a.p("Weekly(weekDay=", weekly.getWeekDay(), ")") : null;
        c.a dayInMonth = cVar.getDayInMonth();
        if (dayInMonth != null) {
            str = "DayInMonth(startDay=" + dayInMonth.getStartDay() + ", behaviour=" + dayInMonth.getBehaviour() + ")";
        } else {
            str = null;
        }
        c.b weekdayInMonth = cVar.getWeekdayInMonth();
        throw new IllegalStateException(l.r("Unexpected analytics spending cycle: ", v0.a.i(v0.a.m("AnalyticsSpendingCycleStorageDto(weekly=", strP, ", dayInMonth=", str, ", weekdayInMonth="), weekdayInMonth != null ? j6.a.s("WeekdayInMonth(weekDay=", weekdayInMonth.getWeekDay(), ", behaviour=", weekdayInMonth.getBehaviour(), ")") : null, ")")));
    }
}
