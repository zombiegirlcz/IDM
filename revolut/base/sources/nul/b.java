package nul;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.trading.orders.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import mul.e;
import mul.g;
import nel.n;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufl.b f219332a;

    public b(ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f219332a = wealthHoldingsClauseFactory;
    }

    @Override // nul.a
    public final boolean a(g breakdownContent) {
        Intrinsics.checkNotNullParameter(breakdownContent, "breakdownContent");
        return breakdownContent instanceof e;
    }

    @Override // nul.a
    public final List b(g breakdownContent, n instrument, boolean z) {
        Intrinsics.checkNotNullParameter(breakdownContent, "breakdownContent");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        kel.e eVar = ((e) breakdownContent).f209051a.f183179l;
        if (eVar == null) {
            r6.b.D("fund details must be present");
            return f0.f322471a;
        }
        BigDecimal bigDecimal = eVar.f183165c;
        BigDecimal bigDecimal2 = eVar.f183164b;
        CellDetailsDelegate.Model[] elements = {e1.G(yoj.b.i(eVar)) ? c("FUND_BREAKDOWN_AVAILABLE_TO_SELL", new TextLocalisedClause(R$string.wealth_trading_orders_dialog_shares_availability_item_unlocked, null, null, 14), yoj.b.i(eVar), instrument) : null, e1.G(bigDecimal2) ? c("FUND_BREAKDOWN_AVAILABLE_TO_SELL_WITH_FEE", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_soft_lockup_title, null, null, 14), bigDecimal2, instrument) : null, e1.G(bigDecimal) ? c("FUND_BREAKDOWN_LOCKED", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_hard_lockup_title, null, null, 14), bigDecimal, instrument) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public final CellDetailsDelegate.Model c(String str, TextLocalisedClause textLocalisedClause, BigDecimal bigDecimal, n nVar) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), sfl.b.a(this.f219332a, bigDecimal, nVar.f214597c, nVar.e), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
