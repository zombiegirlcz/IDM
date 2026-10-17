package d5k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f111425a = new e();

    private e() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.payments_bank_transfer_amount_error_failed_beneficiary_fx, null, null, 14);
    }
}
