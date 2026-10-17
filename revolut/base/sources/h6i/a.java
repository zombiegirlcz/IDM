package h6i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements i1j.a {
    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Long l2;
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = balanceGroupList.iterator();
        while (it8.hasNext()) {
            k1j.b bVar = (k1j.b) it8.next();
            List list = bVar.f180284c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj2;
                if (balanceWrapper instanceof BalanceWrapper.CreditCardBalanceWrapper ? ((BalanceWrapper.CreditCardBalanceWrapper) balanceWrapper).i.f69802q.contains(yw4.f.MOVE_MONEY) : ((balanceWrapper instanceof BalanceWrapper.PocketBalanceWrapper) && ((BalanceWrapper.PocketBalanceWrapper) balanceWrapper).i.e == io3.l.REVX_FIAT && ((l2 = balanceWrapper.f99405b) == null || l2.longValue() <= 0)) ? false : true) {
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
