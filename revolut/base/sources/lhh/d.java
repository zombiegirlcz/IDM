package lhh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1h.o;
import m1h.p;
import m1h.r;
import m1h.s;
import od0.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements o {
    public static p b(int i, dj0.d dVar, Integer num) {
        Float fValueOf = Float.valueOf(12.0f);
        return new p(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), num != null ? new Custom(new Custom.Color.Solid(num.intValue()), false, false, 254) : null, 8), new ImageClause(R$drawable.uikit_icn_16_info_outline, num, fValueOf, fValueOf, 16))), null);
    }

    @Override // m1h.o
    public final p a(r state, s sVar, i tradingAccount) throws Throwable {
        Integer numValueOf;
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        if (!(state instanceof ghh.a)) {
            hx7.e.n(new IllegalArgumentException("Invalid state: " + state + " received in " + d.class.getSimpleName()));
            return null;
        }
        if (tradingAccount.f224257a == null || !(tradingAccount.c() instanceof TradingAccount.TaxAdvantage)) {
            hx7.e.n(new IllegalArgumentException("Invalid state: Trading account " + tradingAccount + " received is not TaxAdvantage type in " + d.class.getSimpleName()));
            return null;
        }
        dj0.d dVar = ((ghh.a) state).f143925a;
        if (dVar != null) {
            if (sVar == null || (i = c.f195256a[sVar.ordinal()]) == -1) {
                numValueOf = null;
            } else {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(R$attr.uikit_colorRed);
            }
            TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) tradingAccount.c();
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Isa) {
                return b(R$string.wealth_isa_topup_subtitle_available, dVar, numValueOf);
            }
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                return b(R$string.wealth_personal_jisa_topup_subtitle_available, dVar, numValueOf);
            }
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                return b(R$string.wealth_jisa_topup_subtitle_available, dVar, numValueOf);
            }
            if (!(taxAdvantage instanceof TradingAccount.TaxAdvantage.Pea) && !(taxAdvantage instanceof TradingAccount.TaxAdvantage.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
