package zah;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private e() {
    }

    public static ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem((InvestTransaction) it8.next()));
        }
        return arrayList;
    }
}
