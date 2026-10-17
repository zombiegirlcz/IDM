package vsl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlowContract$DetailsPagerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private e() {
    }

    public static ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new InvestOrderDetailsPagerFlowContract$DetailsPagerItem((InvestOrder) it8.next()));
        }
        return arrayList;
    }
}
