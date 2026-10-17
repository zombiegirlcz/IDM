package q7j;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static TextLocalisedClause a(wd6.e eVar, int i, int i2, xi0.b bVar, xi0.b bVar2, BigDecimal bigDecimal) {
        int i3 = d.f242864b[eVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = i2;
        }
        return new TextLocalisedClause(i, v.k(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), new RateClause(bigDecimal, bVar2, new RateClause.Format.ExchangeRate(true), null)), null, 12);
    }
}
