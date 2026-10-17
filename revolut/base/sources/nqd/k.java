package nqd;

import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        b bVar = (b) obj3;
        IncomeSorterExecution incomeSorterExecution = bVar.f218407c;
        Long lValueOf = Long.valueOf(incomeSorterExecution != null ? incomeSorterExecution.e : bVar.f218405a.f99163g);
        b bVar2 = (b) obj2;
        IncomeSorterExecution incomeSorterExecution2 = bVar2.f218407c;
        return cim.b.b(lValueOf, Long.valueOf(incomeSorterExecution2 != null ? incomeSorterExecution2.e : bVar2.f218405a.f99163g));
    }
}
