package rbb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.main_screen.container.impl.R$string;
import ibb.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {
    public final TextLocalisedClause a(boolean z) {
        return z ? new TextLocalisedClause(R$string.tab_trade_title, null, null, 14) : new TextLocalisedClause(R$string.tab_invest_title, null, null, 14);
    }
}
