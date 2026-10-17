package twd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import cp5.d;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1j.b;
import k1j.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import yw4.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements i1j.a {
    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = balanceGroupList.iterator();
        while (it8.hasNext()) {
            b bVar = (b) it8.next();
            List list = bVar.f180284c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj2;
                if (balanceWrapper instanceof BalanceWrapper.CreditCardBalanceWrapper ? ((BalanceWrapper.CreditCardBalanceWrapper) balanceWrapper).i.f69802q.contains(f.POCKET_TRANSFER) : (bVar.f180282a == c.SUBACCOUNTS && balanceWrapper.getF99407g() == k1j.a.VAULTS && !d.A(balanceWrapper.getF99406c())) ? false : true) {
                    arrayList2.add(obj2);
                }
            }
            b bVarA = !arrayList2.isEmpty() ? b.a(bVar, arrayList2) : null;
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return new g(new Data(arrayList, null, false, 6, null), 2);
    }
}
