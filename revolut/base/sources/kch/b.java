package kch;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((InstrumentsCollectionFilter.ListFilter.Value) obj3).f95293b), Boolean.valueOf(((InstrumentsCollectionFilter.ListFilter.Value) obj2).f95293b));
    }
}
