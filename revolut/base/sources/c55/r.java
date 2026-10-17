package c55;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;

/* JADX INFO: loaded from: classes21.dex */
public final class r {
    public final TextLocalisedClause a(long j2) {
        return j2 == 0 ? new TextLocalisedClause(R$string.loans_home_delayed_disbursal_badge_today, null, null, 14) : j2 == 1 ? new TextLocalisedClause(R$string.loans_home_delayed_disbursal_badge_tomorrow, null, null, 14) : new TextLocalisedClause(R$string.loans_home_delayed_disbursal_badge_days, zhm.u.c(Long.valueOf(j2)), null, 12);
    }
}
