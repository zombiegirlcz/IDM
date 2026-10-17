package ixi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import svi.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static Clause a(i openingHours, d style) {
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        Intrinsics.checkNotNullParameter(style, "style");
        Object obj2 = f.f169569a;
        Clause clauseB = f.b((List) openingHours.f265920a.get(1), c.LOWERCASE);
        int i = a.f169567a[style.ordinal()];
        if (i == 1) {
            return clauseB;
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.airport_lounges_lounge_details_opening_hours_value_monday_sunday, u.c(clauseB), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause b(b bVar, i openingHours, d style) {
        c missingDayTextStyle = c.LOWERCASE;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(missingDayTextStyle, "missingDayTextStyle");
        int i = a.f169567a[style.ordinal()];
        if (i == 1) {
            return f.c(openingHours, missingDayTextStyle);
        }
        if (i == 2) {
            return new CompositeClause(v.k(new TimeClause(new DateTime().getMillis(), TimeClause.Format.DayOfWeek.f57966b, null, null, 12), f.c(openingHours, missingDayTextStyle)), new TextClause(": ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
