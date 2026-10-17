package d0e;

import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static StatementPeriod a(StatementPeriod statementPeriod, StatementPeriod statementPeriod2) {
        if (statementPeriod.getStart().compareTo((ChronoLocalDate) statementPeriod.getEnd()) > 0) {
            statementPeriod = new StatementPeriod(statementPeriod.getEnd(), statementPeriod.getStart());
        }
        return new StatementPeriod((LocalDate) f.d(f.c(statementPeriod.getStart(), statementPeriod2.getStart()), statementPeriod2.getEnd()), (LocalDate) f.d(f.c(statementPeriod.getEnd(), statementPeriod2.getStart()), statementPeriod2.getEnd()));
    }

    public static StatementPeriodSelection b(StatementPeriod availablePeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        StatementPeriodType statementPeriodType = StatementPeriodType.MONTH;
        LocalDate localDateWithDayOfMonth = availablePeriod.getEnd().withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return new StatementPeriodSelection(statementPeriodType, new StatementPeriod((LocalDate) f.c(localDateWithDayOfMonth, availablePeriod.getStart()), availablePeriod.getEnd()));
    }

    public static StatementPeriodSelection c(StatementPeriodSelection selection, StatementPeriod availablePeriod) {
        StatementPeriod statementPeriodA;
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        StatementPeriodType statementPeriodType = selection.f88217a;
        StatementPeriod statementPeriod = selection.f88218b;
        int i = b.f110353a[statementPeriodType.ordinal()];
        if (i == 1) {
            return StatementPeriodSelection.a(selection, availablePeriod);
        }
        if (i != 2) {
            return StatementPeriodSelection.a(selection, a(statementPeriod, availablePeriod));
        }
        if (statementPeriod.getStart().compareTo((ChronoLocalDate) statementPeriod.getEnd()) > 0) {
            statementPeriod = new StatementPeriod(statementPeriod.getEnd(), statementPeriod.getStart());
        }
        LocalDate localDateWithDayOfMonth = statementPeriod.getStart().withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        LocalDate localDateWithDayOfMonth2 = statementPeriod.getEnd().withDayOfMonth(statementPeriod.getEnd().lengthOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth2, "withDayOfMonth(...)");
        StatementPeriod statementPeriod2 = new StatementPeriod(localDateWithDayOfMonth, localDateWithDayOfMonth2);
        if (statementPeriod2.getEnd().compareTo((ChronoLocalDate) availablePeriod.getStart()) < 0) {
            LocalDate start = availablePeriod.getStart();
            LocalDate localDateWithDayOfMonth3 = availablePeriod.getStart().withDayOfMonth(availablePeriod.getStart().lengthOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth3, "withDayOfMonth(...)");
            statementPeriodA = new StatementPeriod(start, (LocalDate) cim.c.l(localDateWithDayOfMonth3, availablePeriod.getEnd()));
        } else if (statementPeriod2.getStart().compareTo((ChronoLocalDate) availablePeriod.getEnd()) > 0) {
            LocalDate localDateWithDayOfMonth4 = availablePeriod.getEnd().withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth4, "withDayOfMonth(...)");
            statementPeriodA = new StatementPeriod((LocalDate) cim.c.k(localDateWithDayOfMonth4, availablePeriod.getStart()), availablePeriod.getEnd());
        } else {
            statementPeriodA = a(statementPeriod2, availablePeriod);
        }
        return StatementPeriodSelection.a(selection, statementPeriodA);
    }
}
