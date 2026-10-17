package uyg;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.wealth.analytics.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static TabsDelegate.Model a(String listId, List categories, vyg.a selectedCategory) {
        int i;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        List<vyg.a> list = categories;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vyg.a aVar : list) {
            String strName = aVar.name();
            int i2 = j.f284345a[aVar.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_analytics_widgetised_allocation_category_assets;
            } else if (i2 == 2) {
                i = R$string.wealth_analytics_widgetised_allocation_category_positions;
            } else if (i2 == 3) {
                i = R$string.wealth_analytics_widgetised_allocation_category_sectors;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_analytics_widgetised_allocation_category_products;
            }
            arrayList.add(new i(new TextLocalisedClause(i, null, null, 14), strName));
        }
        return b(listId, selectedCategory.name(), arrayList);
    }

    public static TabsDelegate.Model b(String str, String str2, ArrayList arrayList) {
        if ((arrayList.size() > 1 ? arrayList : null) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            arrayList2.add(new q(iVar.f284343a, new t(iVar.f284344b), 50));
        }
        return new TabsDelegate.Model(str, arrayList2, str2, null, null, null, 0, 0, null, 8184);
    }
}
