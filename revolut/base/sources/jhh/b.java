package jhh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.f;
import m1h.g;
import od0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements g {
    @Override // m1h.g
    public final Flow a(f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        i iVar = input.d;
        if (iVar.f224257a == null || !(iVar.c() instanceof TradingAccount.TaxAdvantage)) {
            return new go.g(new Data(null, new IllegalArgumentException("Invalid state: Trading account " + iVar + " received is not TaxAdvantage type in " + b.class.getSimpleName()), false, 5, null), 2);
        }
        TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) iVar.c();
        if ((taxAdvantage instanceof TradingAccount.TaxAdvantage.Isa) || (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa)) {
            return zi0.c.i(new khh.a(hel.b.GB));
        }
        if ((taxAdvantage instanceof TradingAccount.TaxAdvantage.Pea) || (taxAdvantage instanceof TradingAccount.TaxAdvantage.Unknown)) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
