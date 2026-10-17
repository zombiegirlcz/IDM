package u65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((LoanDocument) obj2).e), Integer.valueOf(((LoanDocument) obj3).e));
    }
}
