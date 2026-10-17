package q6i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {
    public static TextLocalisedClause a(b6i.i iVar) {
        int i;
        int i2 = h0.f242627a[iVar.ordinal()];
        if (i2 == 1) {
            i = R$string.move_money_amount_screen_title;
        } else if (i2 == 2) {
            i = R$string.move_money_amount_screen_title_add_money;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.move_money_amount_screen_title_withdraw;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
