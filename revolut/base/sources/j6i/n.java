package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f171785a = new n();

    private n() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_not_enough, null, null, 14);
    }
}
