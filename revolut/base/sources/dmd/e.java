package dmd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface e {
    static /* synthetic */ Clause a(e eVar, IncomeSorterDestinationInfo incomeSorterDestinationInfo, d dVar, int i) {
        if ((i & 2) != 0) {
            dVar = d.ACCOUNT;
        }
        return ((end.d) eVar).c(incomeSorterDestinationInfo, dVar, c.WITH_ACCOUNT);
    }
}
