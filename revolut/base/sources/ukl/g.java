package ukl;

import com.revolut.core.ui_kit.models.PeriodClause;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private g() {
    }

    public static PeriodClause a(l80.e eVar, ZonedDateTime cooldown) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(cooldown, "cooldown");
        ZonedDateTime zonedDateTimeK = ((l80.f) eVar).k();
        return new PeriodClause(ChronoUnit.HOURS.between(zonedDateTimeK, cooldown) == 0 ? new PeriodClause.PeriodComponents(0, 0, 0, 0, (int) ChronoUnit.MINUTES.between(zonedDateTimeK, cooldown), 0, 47) : new PeriodClause.PeriodComponents(0, 0, 0, (int) Math.ceil(ChronoUnit.MINUTES.between(zonedDateTimeK, cooldown) / 60.0d), 0, 0, 55), null);
    }
}
