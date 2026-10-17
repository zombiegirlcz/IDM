package kch;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import ip0.r70;
import jch.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static r70 a(InstrumentsCollectionFilter.RangeFilter rangeFilter, CompositeClause compositeClause, Clause clause, Clause clause2) {
        InstrumentsCollectionFilterId instrumentsCollectionFilterId = rangeFilter.f95294a;
        String str = "INSTRUMENTS_COLLECTION_RANGE_SLIDER_LIST_ID_" + instrumentsCollectionFilterId;
        int i = rangeFilter.f95296c;
        int i2 = rangeFilter.d;
        InstrumentsCollectionFilter.RangeFilter.Range range = rangeFilter.e;
        return new r70(str, compositeClause, null, clause, clause2, i, i2, range.f95297a, range.f95298b, new n(instrumentsCollectionFilterId, range));
    }
}
