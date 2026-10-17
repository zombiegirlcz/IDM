package s5i;

import aw0.o9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public final Clause a(Amount amount) {
        AssetClauseType money;
        Intrinsics.checkNotNullParameter(amount, "amount");
        int i = a.f260084a[amount.f104718b.f104719a.ordinal()];
        if (i == 1) {
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 2) {
            money = new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 3) {
            money = new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 4) {
            money = new AssetClauseType.Stock(0);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "AmountDisplayerImpl", "Cannot display UNDEFINED asset type", null, null, 16);
            money = null;
        }
        AssetClauseType assetClauseType = money;
        return assetClauseType != null ? new AssetClause(amount.f104717a, assetClauseType, amount.f104718b.f104720b, null, o9.NON_SENSITIVE, 8) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
