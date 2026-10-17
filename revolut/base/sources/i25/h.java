package i25;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tof.cc;
import tof.i7;
import tof.ua;
import tof.va;
import tof.y6;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements pfe.f {
    @Override // pfe.f
    public final Object b(Set set, gim.c cVar) {
        i7 vaVar;
        if (set.isEmpty()) {
            vaVar = null;
        } else if (set.size() == 1) {
            vaVar = new ua(((ProductAccountId) d0.a0(set)).f89729a);
        } else {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(w.t(set2, 10));
            Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((ProductAccountId) it8.next()).f89729a);
            }
            vaVar = new va(d0.i1(arrayList));
        }
        if (vaVar == null) {
            return null;
        }
        i7.c cVar2 = i7.Companion;
        i7[] i7VarArr = {vaVar, new cc(u.c(y6.COLLATERAL_HOLD))};
        cVar2.getClass();
        return i7.c.a(i7VarArr);
    }
}
