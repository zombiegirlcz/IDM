package goc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import pdh.c;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static Clause a(c timeSpan, long j2) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        switch (a.f145130a[timeSpan.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new CompositeClause(v.k(new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 4:
                return new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12);
            case 5:
            case 6:
            case 7:
            case 8:
                return new LocalDate(j2).plusMonths(6).isAfter(LocalDate.now()) ? new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12) : new TimeClause(j2, TimeClause.Format.DateLong.f57962b, null, null, 12);
            case 9:
            case 10:
                throw new IllegalArgumentException("YEAR_TO_DATE and TEN_YEARS are not used in robo charts");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
