package zp5;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
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
                if (balanceWrapper instanceof BalanceWrapper.PocketBalanceWrapper) {
                    BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) balanceWrapper;
                    l lVar = pocketBalanceWrapper.i.e;
                    if (lVar == l.REVX_FIAT) {
                        arrayList2.add(obj2);
                    } else if (lVar == l.CURRENT) {
                        cp5.d.z(pocketBalanceWrapper.f99406c);
                    }
                }
            }
            k1j.b bVarA = !arrayList2.isEmpty() ? k1j.b.a(bVar, arrayList2) : null;
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return new go.g(new Data(arrayList, null, false, 6, null), 2);
    }
}
