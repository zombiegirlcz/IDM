package jbh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static Clause a(ZonedDateTime time) {
        Intrinsics.checkNotNullParameter(time, "time");
        long jAbs = Math.abs(ZonedDateTime.now().toEpochSecond() - time.toEpochSecond());
        if (jAbs < 60) {
            return new TextLocalisedClause(R$string.wealth_relative_time_now, null, null, 14);
        }
        if (jAbs < 3600) {
            int i = (int) (jAbs / 60);
            return new TextLocalisedQuantityClause(R$plurals.wealth_relative_time_minute_ago, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
        }
        if (jAbs < 86400) {
            int i2 = (int) (jAbs / 3600);
            return new TextLocalisedQuantityClause(R$plurals.wealth_relative_time_hour_ago, Integer.valueOf(i2), u.c(Integer.valueOf(i2)), (Style) null, 24);
        }
        if (jAbs < 2592000) {
            int i3 = (int) (jAbs / 86400);
            return new TextLocalisedQuantityClause(R$plurals.wealth_relative_time_day_ago, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24);
        }
        if (jAbs < 31104000) {
            int i5 = (int) (jAbs / 2592000);
            return new TextLocalisedQuantityClause(R$plurals.wealth_relative_time_month_ago, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24);
        }
        int i6 = (int) (jAbs / 31104000);
        return new TextLocalisedQuantityClause(R$plurals.wealth_relative_time_year_ago, Integer.valueOf(i6), u.c(Integer.valueOf(i6)), (Style) null, 24);
    }
}
