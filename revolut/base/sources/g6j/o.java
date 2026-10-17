package g6j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f140973a;

    public o(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f140973a = dateProvider;
    }

    public final Clause a(long j2, qta.f chartPeriod) {
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Custom custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254);
        switch (n.f140972a[chartPeriod.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new CompositeClause(zhm.v.k(new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
            case 5:
                return new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), custom, null, 8);
            case 6:
            case 7:
            case 8:
                LocalDate localDate = oi0.d.d0(j2).toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                return ((l80.f) this.f140973a).e().minusMonths(6L).compareTo((ChronoLocalDate) localDate) <= 0 ? new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), custom, null, 8) : new TimeClause(j2, TimeClause.Format.DateLong.f57962b, custom, null, 8);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
