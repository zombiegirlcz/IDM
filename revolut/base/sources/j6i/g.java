package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f171778a = new g();

    private g() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.credit_topup_money_input_exceeds_total_balance, null, null, 14);
    }
}
