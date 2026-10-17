package yg6;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tof.ua;
import tof.va;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements pfe.f {
    @Override // pfe.f
    public final Object a(Set set, gim.c cVar) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new tof.t(((ProductAccountId) it8.next()).f89729a, 1));
        }
        return d0.i1(arrayList);
    }

    @Override // pfe.f
    public final Object b(Set set, gim.c cVar) {
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() == 1) {
            return new ua(((ProductAccountId) d0.a0(set)).f89729a);
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountId) it8.next()).f89729a);
        }
        return new va(d0.i1(arrayList));
    }
}
