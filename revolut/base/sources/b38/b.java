package b38;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import v1d.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {
    @Override // v1d.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.wealth_invest_widget_watchlist_symbol_header_subtitle, null, null, 14);
    }

    @Override // v1d.d
    public final TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.wealth_invest_widget_watchlist_symbol_header_title, null, null, 14);
    }
}
