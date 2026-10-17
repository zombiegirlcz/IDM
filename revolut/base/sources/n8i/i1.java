package n8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f213436a;

    public i1(e0 topupItemsMapper, n7i.b0 moveMoneyNavBarMenuItemsProvider) {
        Intrinsics.checkNotNullParameter(topupItemsMapper, "topupItemsMapper");
        Intrinsics.checkNotNullParameter(moveMoneyNavBarMenuItemsProvider, "moveMoneyNavBarMenuItemsProvider");
        this.f213436a = topupItemsMapper;
    }

    public final m0 a(Data topupData, x5i.a aVar) {
        Intrinsics.checkNotNullParameter(topupData, "topupData");
        e0 e0Var = this.f213436a;
        Clause clauseE = e0Var.e(topupData);
        if (clauseE == null) {
            clauseE = new TextLocalisedClause(R$string.move_money_amount_screen_title_add_money, null, null, 14);
        }
        Clause clauseD = e0Var.d(topupData);
        if (clauseD == null) {
            clauseD = aVar != null ? new TextLocalisedClause(R$string.move_money_amount_screen_balance, zhm.u.c(new MoneyClause(aVar.f302980b.getBalance(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null;
        }
        return new m0(clauseE, clauseD, zhm.v.l(aVar != null ? n7i.b0.a(aVar.f302980b) : null));
    }
}
