package vf5;

import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import java.util.Comparator;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((hha.d) d0.b0(((CryptoExchangeFees) obj3).f70809a)).f152294m), Integer.valueOf(((hha.d) d0.b0(((CryptoExchangeFees) obj2).f70809a)).f152294m));
    }
}
