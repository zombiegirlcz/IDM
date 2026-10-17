package igf;

import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    private e() {
    }

    public static ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new TransactionDetailsPagerFlowContract$DetailsPage((UnifiedTransaction) it8.next()));
        }
        return arrayList;
    }
}
