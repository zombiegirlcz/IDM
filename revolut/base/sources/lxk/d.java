package lxk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.retail.feature.trading_hours.impl.R$string;
import io3.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements c {
    public final q a(gxk.g asset, String id10) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (asset instanceof gxk.f) {
            n nVar = ((gxk.f) asset).f147765a;
            textLocalisedClause = new TextLocalisedClause(h.j(nVar.f214597c) ? R$string.wealthcore_trading_market_hours_cfd : h.i(nVar.f214597c) ? R$string.wealthcore_trading_market_hours_bond : R$string.wealthcore_trading_market_hours_stock, null, null, 14);
        } else {
            if (!(asset instanceof gxk.e)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_trading_market_hours_commodities, null, null, 14);
        }
        return new q(id10, new t(textLocalisedClause), 58);
    }
}
