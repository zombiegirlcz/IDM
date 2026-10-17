package hof;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import org.joda.time.Period;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static List a(Period period) {
        return v.k(new CellDetailsDelegate.Model("ID_RECURRING_PAYMENT_TYPE", new TextLocalisedClause(R$string.recurring_payment_details_transaction_type_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_transaction_type_value, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_RECURRING_PAYMENT_REPEAT_PERIOD", new TextLocalisedClause(com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_frequency, null, null, 14), new TextLocalisedClause(jli.e.b(period) ? com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_order_freqency_daily : jli.e.f(period) ? com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_order_freqency_weekly : (jli.e.e(period) || jli.e.d(period)) ? com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_order_freqency_monthly : com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_order_freqency_daily, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
    }
}
