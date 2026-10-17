package h2i;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements g2i.b {
    public static y a(int i, int i2, dj0.d dVar) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14);
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp24;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIMIT_EXCEEDED_DIALOG_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i5, i5, i3, i3, 496)), new t(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, u.c(new MoneyClause(dVar, new MoneyClause.Format.Asset(0), null, null, 12)), null, 12), null, 28), null, null, null, null, 1020);
    }
}
