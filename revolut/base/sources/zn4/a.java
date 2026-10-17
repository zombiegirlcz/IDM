package zn4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((CreditCardFutureInstalmentQuote) obj2).f68769b), Integer.valueOf(((CreditCardFutureInstalmentQuote) obj3).f68769b));
    }
}
