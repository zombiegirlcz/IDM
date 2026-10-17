package jrf;

import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.transfer.core.R$string;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import l80.e;
import l80.f;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f178005a = ISODateTimeFormat.dateTimeParser().withZoneUTC();

    public static final Clause a(String str, boolean z, boolean z3, Custom custom) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        a aVarD = d(str);
        if (aVarD == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        }
        long j2 = aVarD.f178003a;
        boolean z4 = aVarD.f178004b;
        long millis = DateTime.now().getMillis();
        boolean z6 = false;
        boolean z11 = z4 && j2 <= 600000 + millis;
        boolean z12 = z4 && j2 <= 960000 + millis;
        boolean z29 = z4 && j2 <= CoreConstants.MILLIS_IN_ONE_HOUR + millis;
        if (!z4 ? new DateTime(j2).withTimeAtStartOfDay().compareTo((ReadableInstant) new DateTime(millis).withTimeAtStartOfDay()) < 0 : j2 < millis) {
            z6 = true;
        }
        return (z && !z11 && z6) ? new TextLocalisedClause(R$string.estimated_delivery_time_past_fallback_description, null, custom, 10) : z11 ? new TextLocalisedClause(R$string.transfer_estimated_arrival_usually_in_seconds, null, custom, 10) : (z3 && z12) ? new TextLocalisedClause(R$string.transfer_estimated_arrival_usually_in_minutes, null, custom, 10) : (z3 && z29) ? new TextLocalisedClause(R$string.estimated_delivery_time_within_hour_description, null, custom, 10) : new TimeClause(j2, new TimeClause.Format.Pretty(q0.ONLY_DATE), custom, null, 8);
    }

    public static final boolean c(String str, e dateProvider) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        a aVarD = d(str);
        if (aVarD != null) {
            return Intrinsics.f(Instant.ofEpochMilli(aVarD.f178003a).atZone(ZoneId.systemDefault()).toLocalDate(), ((f) dateProvider).e());
        }
        return false;
    }

    public static final a d(String str) {
        DateTime dateTimePlusHours;
        boolean zJ = d0.J(str, "T", false);
        try {
            dateTimePlusHours = DateTime.parse(str, f178005a).toDateTime(DateTimeZone.getDefault());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
            dateTimePlusHours = null;
        }
        if (dateTimePlusHours == null) {
            return null;
        }
        if (!zJ) {
            dateTimePlusHours = dateTimePlusHours.plusHours(12);
        }
        return new a(dateTimePlusHours.getMillis(), zJ);
    }
}
