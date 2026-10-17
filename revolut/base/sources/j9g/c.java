package j9g;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final TextLocalisedQuantityClause a(TravelHotelsPromotion travelHotelsPromotion, DateTime now) {
        Intrinsics.checkNotNullParameter(travelHotelsPromotion, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        Duration durationA = travelHotelsPromotion.a(now);
        if (durationA == null) {
            return null;
        }
        long standardDays = durationA.getStandardDays();
        long standardHours = durationA.getStandardHours();
        long standardMinutes = durationA.getStandardMinutes();
        if (standardDays >= 1) {
            return new TextLocalisedQuantityClause(R$plurals.hotels_common_days_count, Long.valueOf(standardDays), zhm.u.c(Long.valueOf(standardDays)), (Style) null, 24);
        }
        if (standardHours >= 1) {
            return new TextLocalisedQuantityClause(R$plurals.hotels_common_hours_count, Long.valueOf(standardHours), zhm.u.c(Long.valueOf(standardHours)), (Style) null, 24);
        }
        if (standardMinutes >= 1) {
            return new TextLocalisedQuantityClause(R$plurals.hotels_common_minutes_count, Long.valueOf(standardMinutes), zhm.u.c(Long.valueOf(standardMinutes)), (Style) null, 24);
        }
        return null;
    }
}
