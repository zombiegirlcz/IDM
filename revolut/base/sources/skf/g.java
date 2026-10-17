package skf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsChevronDelegate.Model a(p pVar) {
        return new CellDetailsChevronDelegate.Model("ID_GO_TO_EXCHANGE_AUTOMATION", new TextLocalisedClause(R$string.transactionUI_transaction_details_standing_order_actions_automation_details, null, null, 14), 0, false, pVar, null, null, 2028);
    }

    public static CellDetailsDelegate.Model b() {
        return new CellDetailsDelegate.Model("ID_EXTRAS_AUTOMATION_TRANSFER_TYPE", new TextLocalisedClause(R$string.transactionUI_transaction_details_standing_order_transfer_type, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_details_standing_order_automation, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
