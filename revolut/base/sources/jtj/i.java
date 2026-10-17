package jtj;

import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((IncomeSorterExecution) obj3).e), Long.valueOf(((IncomeSorterExecution) obj2).e));
    }
}
