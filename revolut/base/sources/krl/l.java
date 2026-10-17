package krl;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {
    public abstract k a(String str);

    public abstract List b(String str);

    public abstract List c(ArrayList arrayList);

    public abstract int d(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract void e(List list);

    public void f(k4l.d dVar, ArrayList currencyCodes, ArrayList orderTypes, Boolean bool, String str, ArrayList entities) {
        Intrinsics.checkNotNullParameter(currencyCodes, "currencyCodes");
        Intrinsics.checkNotNullParameter(orderTypes, "orderTypes");
        Intrinsics.checkNotNullParameter(entities, "entities");
        Intrinsics.checkNotNullParameter(currencyCodes, "currencyCodes");
        Intrinsics.checkNotNullParameter(orderTypes, "orderTypes");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!currencyCodes.isEmpty()) {
            String strK0 = d0.k0(currencyCodes, ", ", null, null, 0, new kpj.a(17), 30);
            arrayList2.add(j6.a.s("(currency_pair_first IN (", strK0, ") OR currency_pair_second IN (", strK0, "))"));
            arrayList.addAll(currencyCodes);
            arrayList.addAll(currencyCodes);
        }
        if (dVar != null) {
            arrayList2.add("account_type == ?");
            arrayList.add(dVar.name());
        }
        if (bool != null) {
            arrayList2.add("blocking == ?");
            arrayList.add(bool);
        }
        if (!orderTypes.isEmpty()) {
            arrayList2.add("order_type IN (" + d0.k0(orderTypes, ", ", null, null, 0, new kpj.a(18), 30) + ")");
            arrayList.addAll(orderTypes);
        }
        if (str != null) {
            arrayList2.add("portfolio_id == ?");
            arrayList.add(str);
        }
        d(new SimpleSQLiteQuery(arrayList2.isEmpty() ? "DELETE FROM invest_orders" : j6.a.q("DELETE FROM invest_orders WHERE ", d0.k0(arrayList2, " AND ", null, null, 0, null, 62)), arrayList.toArray(new Object[0])));
        e(entities);
    }
}
