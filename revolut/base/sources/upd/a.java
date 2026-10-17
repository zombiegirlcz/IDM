package upd;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        long jLongValue;
        BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) obj3;
        dj0.d dVar = pocketBalanceWrapper.k;
        long jLongValue2 = 0;
        if (dVar != null) {
            jLongValue = dVar.f115082a;
        } else {
            Long l2 = pocketBalanceWrapper.f99405b;
            jLongValue = l2 != null ? l2.longValue() : 0L;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper2 = (BalanceWrapper.PocketBalanceWrapper) obj2;
        dj0.d dVar2 = pocketBalanceWrapper2.k;
        if (dVar2 != null) {
            jLongValue2 = dVar2.f115082a;
        } else {
            Long l3 = pocketBalanceWrapper2.f99405b;
            if (l3 != null) {
                jLongValue2 = l3.longValue();
            }
        }
        return cim.b.b(lValueOf, Long.valueOf(jLongValue2));
    }
}
