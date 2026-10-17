package nfl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.statements.impl.R$string;
import mfl.k;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements k {
    @Override // mfl.k
    public final TextLocalisedClause a(hel.b bVar, TradingAccount tradingAccount) {
        return new TextLocalisedClause(R$string.wealth_reports_subtitle, null, null, 14);
    }

    @Override // mfl.k
    public final TextLocalisedClause b(hel.b bVar) {
        return new TextLocalisedClause(R$string.wealth_reports_title, null, null, 14);
    }
}
