package nw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f219764a = new a();

    private a() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.credit_topup_money_input_exceeds_total_balance, null, null, 14);
    }
}
