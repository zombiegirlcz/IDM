package h9g;

import aw0.ka;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static Date a(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zone, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zone, "zone");
        return Date.from(localDate.atStartOfDay(zone).toInstant());
    }

    public static final TimeClause b(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return new TimeClause(a(localDate).toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
    }

    public static final CompositeClause c(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return new CompositeClause(v.k(d(dateTime, new TimeClause.Format.DayAndMonth(ka.SHORT)), d(dateTime, TimeClause.Format.TimeDefault.f57977b)), com.revolut.core.ui_kit.models.b.a(), null, null, 12);
    }

    public static final TimeClause d(DateTime dateTime, TimeClause.Format format) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TimeClause(dateTime.getMillis(), format, null, dateTime.getZone().toTimeZone().toZoneId(), 4);
    }
}
