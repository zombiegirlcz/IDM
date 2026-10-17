package h3i;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements d {
    public static y a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIMIT_EXCEEDED_DIALOG_BUTTON_ID", defaultFilledButton, null, textLocalisedClause3, false, null, null, i, R$attr.uikit_dp24, i, i, 496)), new t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020);
    }
}
