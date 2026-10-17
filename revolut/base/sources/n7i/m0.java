package n7i;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {
    public static TextLocalisedClause a(dj0.d sourceMoney, dj0.d targetMoney, AccountWrapper targetWrapper) {
        pcd.s sVar;
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(targetWrapper, "targetWrapper");
        AccountSource accountSource = targetWrapper.d;
        AccountSource.VaultSource vaultSource = accountSource instanceof AccountSource.VaultSource ? (AccountSource.VaultSource) accountSource : null;
        return (vaultSource == null || (sVar = vaultSource.f97223a) == null || !opg.c.d(sVar)) ? !Intrinsics.f(sourceMoney.f115083b, targetMoney.f115083b) ? new TextLocalisedClause(R$string.move_money_success_title_exchange, zhm.v.k(new MoneyClause(sourceMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(targetMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.move_money_success_title_you_moved, zhm.u.c(new MoneyClause(targetMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_action_topup_success, zhm.u.c(new MoneyClause(targetMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }
}
