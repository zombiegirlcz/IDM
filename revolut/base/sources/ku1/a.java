package ku1;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements i1j.a {
    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = balanceGroupList.iterator();
        while (it8.hasNext()) {
            k1j.b bVar = (k1j.b) it8.next();
            List list = bVar.f180284c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj2;
                if (balanceWrapper instanceof BalanceWrapper.CreditCardBalanceWrapper ? ((BalanceWrapper.CreditCardBalanceWrapper) balanceWrapper).i.f69802q.contains(yw4.f.POCKET_TRANSFER) : true) {
                    arrayList2.add(obj2);
                }
            }
            k1j.b bVarA = !arrayList2.isEmpty() ? k1j.b.a(bVar, arrayList2) : null;
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return zi0.c.i(arrayList);
    }
}
