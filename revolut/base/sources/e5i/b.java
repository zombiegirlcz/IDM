package e5i;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import ip0.ck0;
import ip0.yj0;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public final y a(Screen.EffectiveRateDescription effectiveRateDescription) {
        return new y(u.c(new TextDelegate.Model("effectiverate.description.description", new TextLocalisedClause(R$string.rates_transaction_vet_prompt_description, null, null, 14), false, new ck0(yj0.START), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908)), new t(new TextLocalisedClause(R$string.rates_transaction_vet_title, null, null, 14), null, null, 30), l.WINDOW, null, effectiveRateDescription, null, 984);
    }
}
