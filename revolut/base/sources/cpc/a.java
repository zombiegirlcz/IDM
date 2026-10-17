package cpc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements m1h.d {
    @Override // m1h.d
    public final Clause a(m1h.b disclaimer) throws Throwable {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        if (!(disclaimer instanceof f)) {
            hx7.e.n(new IllegalArgumentException("Unknown disclaimer type: " + disclaimer + " received in RoboWealthCompositeAddMoneyDisclaimerMapper"));
            return null;
        }
        f fVar = (f) disclaimer;
        if (fVar instanceof d) {
            return null;
        }
        if (!(fVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.wealth_robo_add_money_disclaimer_sg_recurring_deposit;
        xi0.b bVar = ((e) disclaimer).f107928a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new TextLocalisedClause(i, v.k(new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(bVar, ticker, null, 4)), null, 12)));
    }
}
