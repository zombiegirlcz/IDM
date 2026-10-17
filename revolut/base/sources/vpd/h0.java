package vpd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar = ((IncomeSorterDestinationInfo.Investment.Instrument) obj3).f87473g;
        Long lValueOf = Long.valueOf(dVar != null ? dVar.f115082a : 0L);
        dj0.d dVar2 = ((IncomeSorterDestinationInfo.Investment.Instrument) obj2).f87473g;
        return cim.b.b(lValueOf, Long.valueOf(dVar2 != null ? dVar2.f115082a : 0L));
    }
}
