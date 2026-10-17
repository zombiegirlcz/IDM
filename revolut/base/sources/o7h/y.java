package o7h;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y {
    public static final ArrayList a(LinkedHashMap linkedHashMap, BondsCollectionFilterId bondsCollectionFilterId, Function1 function1) {
        List list = (List) linkedHashMap.get(bondsCollectionFilterId);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object objInvoke = function1.invoke(it8.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final Integer b(InstrumentsCollectionFilter.RangeFilter rangeFilter, int i) {
        int i2 = rangeFilter.f95296c + 1;
        if (i >= rangeFilter.d || i2 > i) {
            return null;
        }
        return Integer.valueOf(i);
    }
}
