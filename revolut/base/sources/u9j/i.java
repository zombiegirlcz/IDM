package u9j;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.ZoneId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f278495a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278495a = dateProvider;
    }

    public final TimeClause a(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        l80.f fVar = (l80.f) this.f278495a;
        return (fVar.c(j2) || fVar.d(j2)) ? new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, j.a(), zoneIdSystemDefault) : new TimeClause(j2, new TimeClause.Format.DayAndMonth(ka.SHORT), j.a(), zoneIdSystemDefault);
    }

    public final Clause b(Long l2, qta.f selectedPeriod) {
        Clause clauseW;
        TimeClause timeClause;
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        long jLongValue = l2.longValue();
        int i = h.f278494a[selectedPeriod.ordinal()];
        l80.e eVar = this.f278495a;
        switch (i) {
            case 1:
                TextClause textClause = new TextClause(", ", (Style) j.a(), (Integer) null, false, (o9) null, (List) null, 124);
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                clauseW = yoj.b.w(yoj.b.w(new TimeClause(jLongValue, TimeClause.Format.PrettyDayOfWeek.f57975b, j.a(), zoneIdSystemDefault), textClause), new TimeClause(jLongValue, TimeClause.Format.TimeDefault.f57977b, j.a(), zoneIdSystemDefault));
                break;
            case 2:
            case 3:
                ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
                TextClause textClause2 = new TextClause(", ", (Style) j.a(), (Integer) null, false, (o9) null, (List) null, 124);
                l80.f fVar = (l80.f) eVar;
                clauseW = yoj.b.w(yoj.b.w((fVar.c(jLongValue) || fVar.d(jLongValue)) ? new TimeClause(jLongValue, TimeClause.Format.PrettyDayOfWeek.f57975b, j.a(), zoneIdSystemDefault2) : new TimeClause(jLongValue, new TimeClause.Format.DayAndMonth(ka.SHORT), j.a(), zoneIdSystemDefault2), textClause2), new TimeClause(jLongValue, TimeClause.Format.TimeDefault.f57977b, j.a(), zoneIdSystemDefault2));
                break;
            case 4:
                clauseW = a(jLongValue);
                break;
            case 5:
                clauseW = a(jLongValue);
                break;
            case 6:
            case 7:
                ZoneId zoneIdSystemDefault3 = ZoneId.systemDefault();
                l80.f fVar2 = (l80.f) eVar;
                if (fVar2.c(jLongValue) || fVar2.d(jLongValue)) {
                    timeClause = new TimeClause(jLongValue, TimeClause.Format.PrettyDayOfWeek.f57975b, j.a(), zoneIdSystemDefault3);
                } else {
                    if (Intrinsics.f(fVar2.g().year(), new DateTime(jLongValue).year())) {
                        timeClause = new TimeClause(jLongValue, new TimeClause.Format.DayAndMonth(ka.SHORT), j.a(), zoneIdSystemDefault3);
                    } else {
                        TimeClause.Format.INSTANCE.getClass();
                        timeClause = new TimeClause(jLongValue, TimeClause.Format.f57959a, j.a(), zoneIdSystemDefault3);
                    }
                }
                clauseW = timeClause;
                break;
            default:
                clauseW = a(jLongValue);
                break;
        }
        if (clauseW != null) {
            return clauseW;
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
