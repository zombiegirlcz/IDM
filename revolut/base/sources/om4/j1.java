package om4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class j1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((CreditCardStatementDeferralQuote) obj2).f68801a), Integer.valueOf(((CreditCardStatementDeferralQuote) obj3).f68801a));
    }
}
