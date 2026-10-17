package gr5;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAmount;
import jq9.k;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f145938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3a.b f145939b;

    public a(e dateProvider, e3a.b chatInfoMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatInfoMapper, "chatInfoMapper");
        this.f145938a = dateProvider;
        this.f145939b = chatInfoMapper;
    }

    public final boolean a(Instant timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return timestamp.isAfter(((f) this.f145938a).b().minus((TemporalAmount) Duration.ofHours(1L)));
    }

    public final RowDelegate.Model b(RowDelegate.Model model, Instant createdDate, int i) {
        RowDelegate.Model.c aVar;
        TimeClause.Format dayAndMonth;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        if (model.f != null) {
            return model;
        }
        TextLocalisedClause textLocalisedClause = a(createdDate) ? new TextLocalisedClause(R$string.crypto_withdrawals_screen_wallets_list_subtitles_just_added, null, null, 14) : new TextLocalisedClause(i, null, null, 14);
        if (createdDate.toEpochMilli() > 0) {
            long epochMilli = createdDate.toEpochMilli();
            long epochMilli2 = createdDate.toEpochMilli();
            f fVar = (f) this.f145938a;
            if (fVar.c(epochMilli2)) {
                dayAndMonth = TimeClause.Format.TimeDefault.f57977b;
            } else {
                if (Intrinsics.f(fVar.g().weekOfWeekyear(), new DateTime(createdDate.toEpochMilli()).weekOfWeekyear())) {
                    dayAndMonth = TimeClause.Format.PrettyDayOfWeek.f57975b;
                } else {
                    ZonedDateTime zonedDateTimeK = fVar.k();
                    LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(createdDate, zonedDateTimeK.getZone());
                    ChronoField chronoField = ChronoField.YEAR;
                    dayAndMonth = zonedDateTimeK.get(chronoField) == localDateTimeOfInstant.get(chronoField) ? new TimeClause.Format.DayAndMonth(ka.SHORT) : TimeClause.Format.PrettyDayOfWeek.f57975b;
                }
            }
            aVar = new RowDelegate.Model.c.a(null, new TimeClause(epochMilli, dayAndMonth, null, null, 12), false, 5);
        } else {
            aVar = model.k;
        }
        return RowDelegate.Model.x(model, null, null, null, textLocalisedClause, null, 0, aVar, false, null, null, 0, 0, 0, 0, null, -1057, 15);
    }

    public final RowDelegate.Model c(RowDelegate.Model model, k kVar) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (kVar == null) {
            return model;
        }
        g5a.a aVar = (g5a.a) this.f145939b;
        Clause clauseA = aVar.a(kVar, null, null);
        if (clauseA == null) {
            clauseA = model.f;
        }
        return RowDelegate.Model.x(model, null, null, null, clauseA, null, 0, aVar.b(kVar, false), false, null, null, 0, 0, 0, 0, null, -1057, 15);
    }
}
