package a72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((MultibancoWithdrawalCode) obj3).f61954g, ((MultibancoWithdrawalCode) obj2).f61954g);
    }
}
