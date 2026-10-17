package om4;

import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class h4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((CreditCardInAppStatement$RevolverTransaction) obj3).f68882a, ((CreditCardInAppStatement$RevolverTransaction) obj2).f68882a);
    }
}
