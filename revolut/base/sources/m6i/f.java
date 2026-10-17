package m6i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
        dj0.d f = balanceWrapper.getF();
        Long lValueOf = f != null ? Long.valueOf(f.f115082a) : balanceWrapper.f99405b;
        BalanceWrapper balanceWrapper2 = (BalanceWrapper) obj2;
        dj0.d f4 = balanceWrapper2.getF();
        return cim.b.b(lValueOf, f4 != null ? Long.valueOf(f4.f115082a) : balanceWrapper2.f99405b);
    }
}
