package adh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public final TextLocalisedClause a(c0 frequency) {
        int i;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        int i2 = g.f3353a[frequency.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_robo_onboarding_recurring_contribution_frequency_monthly;
        } else if (i2 == 2) {
            i = R$string.wealth_robo_onboarding_recurring_contribution_frequency_daily;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_robo_onboarding_recurring_contribution_frequency_weekly;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
