package ich;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public static ArrayList a(List filters, InstrumentsCollectionFilter updatedFilter) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(updatedFilter, "updatedFilter");
        List list = filters;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Object obj2 : list) {
            if (Intrinsics.f(((InstrumentsCollectionFilter) obj2).getF95294a(), updatedFilter.getF95294a())) {
                obj2 = updatedFilter;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public static List b(List filters, InstrumentsCollectionFilterId filterId, InstrumentsCollectionFilter.FilterValue value) {
        Object next;
        InstrumentsCollectionFilter rangeFilter;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(value, "filterValue");
        Iterator it8 = filters.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((InstrumentsCollectionFilter) next).getF95294a(), filterId)) {
                break;
            }
        }
        InstrumentsCollectionFilter instrumentsCollectionFilter = (InstrumentsCollectionFilter) next;
        if (instrumentsCollectionFilter == null) {
            return filters;
        }
        if (instrumentsCollectionFilter instanceof InstrumentsCollectionFilter.ListFilter) {
            rangeFilter = c((InstrumentsCollectionFilter.ListFilter) instrumentsCollectionFilter, value);
        } else {
            if (!(instrumentsCollectionFilter instanceof InstrumentsCollectionFilter.RangeFilter)) {
                throw new NoWhenBranchMatchedException();
            }
            InstrumentsCollectionFilter.RangeFilter rangeFilter2 = (InstrumentsCollectionFilter.RangeFilter) instrumentsCollectionFilter;
            Intrinsics.checkNotNullParameter(rangeFilter2, "rangeFilter");
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof InstrumentsCollectionFilter.RangeFilter.Range) {
                InstrumentsCollectionFilter.RangeFilter.Range range = (InstrumentsCollectionFilter.RangeFilter.Range) value;
                InstrumentsCollectionFilterId filterId2 = rangeFilter2.f95294a;
                boolean z = rangeFilter2.f95295b;
                int i = rangeFilter2.f95296c;
                int i2 = rangeFilter2.d;
                Intrinsics.checkNotNullParameter(filterId2, "filterId");
                Intrinsics.checkNotNullParameter(range, "range");
                rangeFilter = new InstrumentsCollectionFilter.RangeFilter(filterId2, z, i, i2, range);
            } else {
                rangeFilter = rangeFilter2;
            }
        }
        return a(filters, rangeFilter);
    }

    public static InstrumentsCollectionFilter.ListFilter c(InstrumentsCollectionFilter.ListFilter listFilter, InstrumentsCollectionFilter.FilterValue value) {
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof InstrumentsCollectionFilter.ListFilter.Value)) {
            return listFilter;
        }
        List list = listFilter.f95291c;
        ArrayList values = new ArrayList(w.t(list, 10));
        for (Object obj2 : list) {
            InstrumentsCollectionFilterValueId instrumentsCollectionFilterValueId = ((InstrumentsCollectionFilter.ListFilter.Value) value).f95292a;
            if (Intrinsics.f(instrumentsCollectionFilterValueId, instrumentsCollectionFilterValueId) == Intrinsics.f(((InstrumentsCollectionFilter.ListFilter.Value) obj2).f95292a, instrumentsCollectionFilterValueId)) {
                obj2 = value;
            }
            values.add(obj2);
        }
        InstrumentsCollectionFilterId filterId = listFilter.f95289a;
        boolean z = listFilter.f95290b;
        int i = listFilter.d;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(values, "values");
        return new InstrumentsCollectionFilter.ListFilter(filterId, z, values, i);
    }
}
