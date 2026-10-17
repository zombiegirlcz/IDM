package u8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import n8i.e0;
import n8i.x;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e0 {
    @Override // n8i.e0
    public final Clause b(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TextLocalisedClause(R$string.move_money_amount_screen_action_add, null, null, 14);
    }

    @Override // n8i.e0
    public final Clause d(Data data) {
        AccountWrapper accountWrapper;
        Intrinsics.checkNotNullParameter(data, "data");
        x xVar = (x) data.getContent();
        if (xVar == null || (accountWrapper = xVar.f213483a) == null) {
            return null;
        }
        return new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_money_form_balance_format, u.c(new MoneyClause(accountWrapper.getBalance(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }
}
