package cie;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 {
    private n1() {
    }

    public static dj0.d a(ProductAccountValue productAccountValue) {
        Intrinsics.checkNotNullParameter(productAccountValue, "<this>");
        if (productAccountValue instanceof ProductAccountValue.Balance) {
            return ((ProductAccountValue.Balance) productAccountValue).f89532b;
        }
        if (!(productAccountValue instanceof ProductAccountValue.Text)) {
            throw new NoWhenBranchMatchedException();
        }
        Clause clause = ((ProductAccountValue.Text) productAccountValue).f89536b;
        MoneyClause moneyClause = clause instanceof MoneyClause ? (MoneyClause) clause : null;
        if (moneyClause != null) {
            return moneyClause.f57821a;
        }
        return null;
    }
}
