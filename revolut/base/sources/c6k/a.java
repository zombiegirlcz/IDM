package c6k;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.Years;
import tof.h2;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f21811a;

    public a(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f21811a = dateProvider;
    }

    public final Clause a(DateTime date, LocalTime time) {
        Intrinsics.checkNotNullParameter(date, "date");
        if (time == null || Years.yearsBetween(date, ((l80.f) this.f21811a).g()).getYears() >= 1) {
            return b(date);
        }
        Clause clauseB = b(date);
        Intrinsics.checkNotNullParameter(time, "time");
        List listK = v.k(clauseB, new TimeClause(time.toDateTimeToday().getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Clause b(DateTime dateTime) {
        if (r51.a.a(dateTime)) {
            return new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
        }
        if (Years.yearsBetween(dateTime, ((l80.f) this.f21811a).g()).getYears() < 1) {
            return new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        }
        List listK = v.k(new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), new TimeClause(dateTime.getMillis(), new TimeClause.Format.Year(0), null, null, 12));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.ZonedDateTime] */
    public final Clause c(h2 step) {
        ZonedDateTime zonedDateTimeG;
        ?? WithZoneSameLocal;
        Intrinsics.checkNotNullParameter(step, "step");
        DateTime dateTimeH = foh.i.h(step, false);
        if (dateTimeH == null || (zonedDateTimeG = jli.b.g(dateTimeH)) == null || (WithZoneSameLocal = zonedDateTimeG.withZoneSameLocal(ZoneId.systemDefault())) == 0) {
            return null;
        }
        DateTime dateTimeWithTimeAtStartOfDay = jli.b.h(WithZoneSameLocal).withTimeAtStartOfDay();
        Intrinsics.h(dateTimeWithTimeAtStartOfDay);
        return a(dateTimeWithTimeAtStartOfDay, null);
    }
}
