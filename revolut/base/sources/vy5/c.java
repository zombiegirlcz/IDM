package vy5;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import yfe.a2;
import yfe.b3;
import yfe.e2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements yfe.o0 {
    @Override // yfe.o0
    public final Object a(Continuation continuation) {
        return null;
    }

    @Override // yfe.o0
    public final Object b(TotalWealthCategoryKey totalWealthCategoryKey, ArrayList arrayList, dj0.d dVar, Continuation continuation) {
        b3 a2Var;
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ProductAccount.ValueItem.Main main = (ProductAccount.ValueItem.Main) it8.next();
            ProductAccountId.Payload payload = main.f89504c.f89730b;
            if (payload instanceof ExtendedSubaccountType) {
                a2Var = new e2((ExtendedSubaccountType) payload);
            } else {
                xi0.b currency = main.f89505g.getCurrency();
                a2Var = (currency == null || (str = currency.f306286a) == null) ? null : new a2(str);
            }
            if (a2Var != null) {
                arrayList2.add(a2Var);
            }
        }
        return new yfe.g(dVar, size, arrayList2);
    }
}
