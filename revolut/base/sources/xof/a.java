package xof;

import a27.d;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import gim.c;
import java.util.List;
import java.util.Set;
import opf.z;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    static Object a(a aVar, TransferMoneyPocket transferMoneyPocket, CurrencyFilteringPolicy currencyFilteringPolicy, List list, c cVar) {
        return ((z) aVar).e(transferMoneyPocket, currencyFilteringPolicy, list, new d(1, 14, null), cVar);
    }

    static Object b(a aVar, TransferMoneyPocket transferMoneyPocket, Set set, List list, c cVar) {
        d dVar = new d(1, 13, null);
        z zVar = (z) aVar;
        zVar.getClass();
        return zVar.e(transferMoneyPocket, new CurrencyFilteringPolicy.IncludeOnly(set), list, dVar, cVar);
    }
}
