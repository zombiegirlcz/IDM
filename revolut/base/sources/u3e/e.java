package u3e;

import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import t1e.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static final Pair a(String quickFilterId, List availableFilters) {
        StoreMegaFilter storeMegaFilter;
        StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue;
        Intrinsics.checkNotNullParameter(quickFilterId, "quickFilterId");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Iterator it8 = availableFilters.iterator();
        do {
            Object obj2 = null;
            if (!it8.hasNext()) {
                return null;
            }
            storeMegaFilter = (StoreMegaFilter) it8.next();
            Iterator it9 = storeMegaFilter.f88539c.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) next).f88540a, quickFilterId)) {
                    obj2 = next;
                    break;
                }
            }
            storeMegaFilterValue = (StoreMegaFilter.StoreMegaFilterValue) obj2;
        } while (storeMegaFilterValue == null);
        return new Pair(storeMegaFilter, storeMegaFilterValue);
    }

    public static final BrandDetailTab b(g2e.a aVar, List availableQuickFilters) {
        x xVar;
        Object next;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(availableQuickFilters, "availableQuickFilters");
        Iterator it8 = aVar.f139971a.iterator();
        do {
            xVar = null;
            if (!it8.hasNext()) {
                Iterator it9 = aVar.f139972b.iterator();
                while (it9.hasNext()) {
                    Iterator it10 = ((StoreMegaFilterSelection) it9.next()).f88544b.iterator();
                    while (it10.hasNext()) {
                        x xVar2 = ((StoreMegaFilter.StoreMegaFilterValue) it10.next()).f88542c;
                        if (xVar2 != null) {
                            return c(xVar2);
                        }
                    }
                }
                return null;
            }
            String str = (String) it8.next();
            Iterator it11 = availableQuickFilters.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    next = null;
                    break;
                }
                next = it11.next();
                if (Intrinsics.f(((StoreMegaQuickFilter) next).f88565a, str)) {
                    break;
                }
            }
            StoreMegaQuickFilter storeMegaQuickFilter = (StoreMegaQuickFilter) next;
            if (storeMegaQuickFilter != null) {
                xVar = storeMegaQuickFilter.f88567c;
            }
        } while (xVar == null);
        return c(xVar);
    }

    public static final BrandDetailTab c(x xVar) {
        int i = d.f276924a[xVar.ordinal()];
        if (i == 1) {
            return BrandDetailTab.Earn.f88609a;
        }
        if (i == 2) {
            return BrandDetailTab.Redeem.f88611a;
        }
        if (i == 3) {
            return BrandDetailTab.Msi.f88610a;
        }
        if (i == 4) {
            return BrandDetailTab.Discount.f88608a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
