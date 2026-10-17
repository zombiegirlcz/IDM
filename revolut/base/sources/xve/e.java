package xve;

import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static final WalletLimit.CounterLimit a(List list, com.revolut.feature.wallets.api.module.a aVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof WalletLimit.CounterLimit) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((WalletLimit.CounterLimit) next).f94844a == aVar) {
                break;
            }
        }
        return (WalletLimit.CounterLimit) next;
    }
}
