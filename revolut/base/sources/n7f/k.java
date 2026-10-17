package n7f;

import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((InvestorUpdate) obj3).f91238b.getMonth().getValue()), Integer.valueOf(((InvestorUpdate) obj2).f91238b.getMonth().getValue()));
    }
}
