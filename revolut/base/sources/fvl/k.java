package fvl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import cvl.q;
import cvl.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class k {
    public static Pair a(xdf.h hVar, udh.a aVar) {
        int i;
        int i2 = aVar == null ? -1 : j.f138499a[aVar.ordinal()];
        if (i2 == -1) {
            i = R$string.wealth_trading_pocket_picker_group_margin_combined_buying_power_explanation_description;
        } else if (i2 == 1) {
            i = R$string.wealth_trading_pocket_picker_group_margin_combined_buying_power_explanation_description_kill_switch;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_pocket_picker_group_margin_combined_buying_power_explanation_description_non_marginable;
        }
        return new Pair(new r(hVar.f304435b), new q(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_margin_combined_buying_power_explanation_title, null, null, 14), new TextLocalisedClause(i, null, null, 14)));
    }
}
