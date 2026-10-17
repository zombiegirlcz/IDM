package hgb;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static TextLocalisedClause a(int i, int i2, long j2) {
        return new TextLocalisedClause(i2, zhm.u.c(new TextLocalisedClause(i, zhm.u.c(new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }

    public static TextLocalisedClause b(int i, Instant instant) {
        if (instant == null) {
            return null;
        }
        Duration durationBetween = Duration.between(Instant.now(), instant);
        if (durationBetween.isNegative() || durationBetween.isZero()) {
            return null;
        }
        long days = durationBetween.toDays();
        if (days >= 1) {
            return a(R$string.salary_account_rewards_free_premium_expiring_badge_title_days, i, days);
        }
        long hours = durationBetween.toHours();
        if (hours >= 1) {
            return a(R$string.salary_account_rewards_free_premium_expiring_badge_title_hours, i, hours);
        }
        long minutes = durationBetween.toMinutes();
        if (minutes >= 1) {
            return a(R$string.salary_account_rewards_free_premium_expiring_badge_title_minutes, i, minutes);
        }
        return null;
    }
}
