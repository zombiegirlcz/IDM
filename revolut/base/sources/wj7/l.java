package wj7;

import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((CFACClaimExpense) obj3).f74926a.f272593h, ((CFACClaimExpense) obj2).f74926a.f272593h);
    }
}
