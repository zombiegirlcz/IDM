package cnf;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.payments.R$plurals;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public static TextLocalisedQuantityClause a(DateTime expirationDate) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        Minutes minutesMinutesBetween = Minutes.minutesBetween(DateTime.now(dateTimeZone), expirationDate.withZone(dateTimeZone));
        int days = minutesMinutesBetween.toStandardDays().getDays();
        int hours = minutesMinutesBetween.toStandardHours().getHours();
        return days > 0 ? new TextLocalisedQuantityClause(R$plurals.magic_link_expiration_day, Integer.valueOf(days), (List) null, (Style) null, 28) : hours > 0 ? new TextLocalisedQuantityClause(R$plurals.magic_link_expiration_hour, Integer.valueOf(hours), (List) null, (Style) null, 28) : new TextLocalisedQuantityClause(R$plurals.magic_link_expiration_minute, Integer.valueOf(minutesMinutesBetween.getMinutes()), (List) null, (Style) null, 28);
    }
}
