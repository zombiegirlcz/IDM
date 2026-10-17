package i0e;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import i0e.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x {
    public static final StatementPeriodType a(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        if (b0Var instanceof y) {
            return StatementPeriodType.ALL_TIME;
        }
        if (b0Var instanceof a0) {
            return StatementPeriodType.CUSTOM;
        }
        if (b0Var instanceof d0) {
            return StatementPeriodType.MONTH;
        }
        if (b0Var instanceof z) {
            return StatementPeriodType.CALENDAR_YEAR;
        }
        if (b0Var instanceof c0) {
            return StatementPeriodType.LAST_FULL_YEAR;
        }
        if (b0Var instanceof e0) {
            return StatementPeriodType.TAX_YEAR;
        }
        if (!(b0Var instanceof b0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        wp5.y.B("No type available for the empty period!");
        return null;
    }

    public static final TextClause b(StatementPeriod statementPeriod, TimeClause.Format.Year format) {
        Intrinsics.checkNotNullParameter(statementPeriod, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TextClause("%1$s – %2$s", (Style) null, (Integer) null, false, (o9) null, zhm.v.k(new TimeClause(oc.c.N(statementPeriod.getStart()), format, null, null, 12), new TimeClause(oc.c.N(statementPeriod.getEnd()), format, null, null, 12)), 94);
    }
}
