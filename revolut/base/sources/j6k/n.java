package j6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((MoneyRequest) obj3).f60319j, ((MoneyRequest) obj2).f60319j);
    }
}
