package hqj;

import h30.l;
import hqj.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lzi.d;
import lzi.e;
import lzi.f;
import lzi.g;
import lzi.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final String a(f fVar) {
        switch (a.f154724a[fVar.ordinal()]) {
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
        c.C0883c weekly = cVar.getWeekly();
        String weekDay = weekly != null ? weekly.getWeekDay() : null;
        c.a dayInMonth = cVar.getDayInMonth();
        Integer numValueOf = dayInMonth != null ? Integer.valueOf(dayInMonth.getStartDay()) : null;
        c.a dayInMonth2 = cVar.getDayInMonth();
        String behaviour3 = dayInMonth2 != null ? dayInMonth2.getBehaviour() : null;
        c.b weekdayInMonth = cVar.getWeekdayInMonth();
        String weekDay2 = weekdayInMonth != null ? weekdayInMonth.getWeekDay() : null;
        c.b weekdayInMonth2 = cVar.getWeekdayInMonth();
        String behaviour4 = weekdayInMonth2 != null ? weekdayInMonth2.getBehaviour() : null;
        StringBuilder sb6 = new StringBuilder("Unexpected analytics spending cycle: weeklyWeekDay=");
        sb6.append(weekDay);
        sb6.append(", dayInMonthStartDay=");
        sb6.append(numValueOf);
        sb6.append(", dayInMonthBehaviour=");
        j6.a.D(sb6, behaviour3, ", weekdayInMonthWeekDay=", weekDay2, ", weekdayInMonthBehaviour=");
        sb6.append(behaviour4);
        throw new IllegalStateException(sb6.toString().toString());
    }
}
