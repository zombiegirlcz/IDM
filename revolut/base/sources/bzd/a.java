package bzd;

import aim.e;
import com.revolut.feature.statements.api.models.StatementPeriod;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static e a(StatementPeriod availablePeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        e eVarB = u.b();
        LocalDate start = availablePeriod.getStart();
        while (start.compareTo((ChronoLocalDate) availablePeriod.getEnd()) <= 0) {
            LocalDate localDateWithDayOfMonth = start.withDayOfMonth(start.lengthOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
            eVarB.add(new StatementPeriod(start, (LocalDate) f.d(localDateWithDayOfMonth, availablePeriod.getEnd())));
            start = start.plusMonths(1L).withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(start, "withDayOfMonth(...)");
        }
        return u.a(eVarB);
    }

    public static StatementPeriod b(e availablePeriods, StatementPeriod statementPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        if (availablePeriods.isEmpty()) {
            throw new IllegalArgumentException("At least one available month period is required");
        }
        if (statementPeriod == null) {
            return (StatementPeriod) d0.m0(availablePeriods);
        }
        LocalDate start = ((StatementPeriod) d0.b0(availablePeriods)).getStart();
        LocalDate end2 = ((StatementPeriod) d0.m0(availablePeriods)).getEnd();
        Iterator<E> it8 = availablePeriods.iterator();
        while (it8.hasNext()) {
            StatementPeriod statementPeriod2 = (StatementPeriod) it8.next();
            LocalDate start2 = statementPeriod2.getStart();
            LocalDate end3 = statementPeriod2.getEnd();
            LocalDate start3 = statementPeriod.getStart();
            if (start3.compareTo((Object) start2) >= 0 && start3.compareTo((Object) end3) <= 0) {
                start = statementPeriod2.getStart();
            }
            LocalDate start4 = statementPeriod2.getStart();
            LocalDate end4 = statementPeriod2.getEnd();
            LocalDate end5 = statementPeriod.getEnd();
            if (end5.compareTo((Object) start4) >= 0 && end5.compareTo((Object) end4) <= 0) {
                end2 = statementPeriod2.getEnd();
            }
        }
        return new StatementPeriod(start, end2);
    }
}
