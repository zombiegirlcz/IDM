package ahe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((TotalWealthCategoryKey.Youth) obj2).f89578b, ((TotalWealthCategoryKey.Youth) obj3).f89578b);
    }
}
