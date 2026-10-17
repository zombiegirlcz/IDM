package r5k;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.retail.feature.payments.core.R$string;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(WalletLimit.CounterLimit counterLimit, int i) {
        if (counterLimit != null) {
            return new CellDetailsDelegate.Model(counterLimit.f94844a.a(), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.transfer_limits_dialog_exceeded_amount, v.k(new MoneyClause(counterLimit.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }
}
