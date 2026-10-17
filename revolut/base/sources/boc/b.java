package boc;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static elc.a a(alc.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = a.f17376a[action.ordinal()];
        if (i == 1) {
            return new elc.a(R$drawable.uikit_icn_24_plus, R$string.wealth_robo_home_action_add_money);
        }
        if (i == 2) {
            return new elc.a(R$drawable.uikit_icn_24_arrow_down, R$string.wealth_robo_home_action_withdraw);
        }
        if (i == 3) {
            return new elc.a(R$drawable.uikit_icn_24_document, R$string.wealth_invest_account_robo_header_actions_documents);
        }
        if (i == 4) {
            return new elc.a(R$drawable.uikit_icn_24_gear, R$string.wealth_robo_home_action_settings);
        }
        throw new NoWhenBranchMatchedException();
    }
}
