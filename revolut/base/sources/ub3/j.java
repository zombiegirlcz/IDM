package ub3;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.api.models.LockedStatus;
import com.revolut.feature.cash_topup.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j {
    public static TextLocalisedClause a(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LockedStatus lockedStatus = location.f65597m;
        if (lockedStatus instanceof LockedStatus.NotApplicable) {
            return null;
        }
        if (lockedStatus instanceof LockedStatus.Unlocked) {
            return new TextLocalisedClause(R$string.topup_cash_map_unlock_description, v.k(new TextLocalisedClause(R$string.topup_cash_map_unlocked, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10), new TimeClause(((LockedStatus.Unlocked) lockedStatus).f65601a, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
        }
        if (lockedStatus instanceof LockedStatus.Locked) {
            return new TextLocalisedClause(R$string.topup_cash_map_lock_description, u.c(new TextLocalisedClause(R$string.topup_cash_map_locked, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
