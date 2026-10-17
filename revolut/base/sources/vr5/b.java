package vr5;

import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import dj0.d;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        d dVarX = zi0.c.x((RevolutXFiatBalancesContract$RevolutXFiatBalanceData) obj3);
        Long lValueOf = dVarX != null ? Long.valueOf(dVarX.f115082a) : null;
        d dVarX2 = zi0.c.x((RevolutXFiatBalancesContract$RevolutXFiatBalanceData) obj2);
        return cim.b.b(lValueOf, dVarX2 != null ? Long.valueOf(dVarX2.f115082a) : null);
    }
}
