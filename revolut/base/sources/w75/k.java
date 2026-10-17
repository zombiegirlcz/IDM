package w75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((LoanBorrower) obj2).f70139b), Integer.valueOf(((LoanBorrower) obj3).f70139b));
    }
}
