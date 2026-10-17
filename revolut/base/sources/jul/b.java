package jul;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static HtmlLocalisedClause a(Links links) {
        return new HtmlLocalisedClause(R$string.trading_disclosures_footer_capital_at_risk, u.c(links.d), (Integer) null, hul.j.f155735a, 12);
    }

    public static Clause b(Links links, boolean z) {
        String str = links.f105093h;
        hul.j jVar = hul.j.f155735a;
        if (!z) {
            return new HtmlLocalisedClause(R$string.wealth_trade_terms_format, v.k(links.f105092g, str), (Integer) null, jVar, 12);
        }
        String str2 = links.A;
        return str2 != null ? new HtmlLocalisedClause(R$string.wealth_trade_margin_terms_format, v.k(str2, str), (Integer) null, jVar, 12) : b(links, false);
    }

    public static TextLocalisedClause c(nel.n nVar, bfl.g gVar) {
        if (io3.h.l(nVar.f214597c) && gVar == bfl.g.BUY) {
            return new TextLocalisedClause(R$string.wealth_trade_ongoing_fees_apply, u.c(new TextLocalisedClause(R$string.wealth_trade_ongoing_fees, null, new Click(28, (Integer) null, (Object) hul.k.f155737a, "CLICK_ID_ONGOING_FEES", false), 10)), null, 12);
        }
        return null;
    }

    public static CompositeClause d(Clause... clauseArr) {
        return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d0.d1(kotlin.collections.d.L(clauseArr)));
    }
}
