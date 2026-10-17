package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f171784a = new m();

    private m() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_input_error_exceeds_balance, null, null, 14);
    }
}
