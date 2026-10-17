package xci;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static TextLocalisedClause a(yci.a transactionFrequency) {
        int i;
        Intrinsics.checkNotNullParameter(transactionFrequency, "transactionFrequency");
        int i2 = a.f304137a[transactionFrequency.ordinal()];
        if (i2 == 1) {
            i = R$string.transaction_countries_frequency_daily;
        } else if (i2 == 2) {
            i = R$string.transaction_countries_frequency_weekly;
        } else if (i2 == 3) {
            i = R$string.transaction_countries_frequency_monthly;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.transaction_countries_frequency_yearly;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
