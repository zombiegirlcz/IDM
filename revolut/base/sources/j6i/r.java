package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;

/* JADX INFO: loaded from: classes10.dex */
public interface r extends yqi.b {
    @Override // yqi.b
    default Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_exceeds_total_balance, null, null, 14);
    }
}
