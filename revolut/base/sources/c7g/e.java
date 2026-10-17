package c7g;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Clause a(FlightSearchQuery flightSearchQuery) {
        LocalDate localDate = flightSearchQuery.f93579c;
        j jVar = c7.Companion;
        n0 n0Var = n0.HIDE_CURRENT_YEAR;
        TimeClause timeClauseB = j.b(jVar, localDate, new LocalDateClause$DateFormat.DateMedium(n0Var));
        LocalDate localDate2 = flightSearchQuery.d;
        return localDate2 != null ? new CompositeClause(v.k(timeClauseB, new TextClause(" – ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j.b(jVar, localDate2, new LocalDateClause$DateFormat.DateMedium(n0Var))), null, null, null, 14) : timeClauseB;
    }
}
