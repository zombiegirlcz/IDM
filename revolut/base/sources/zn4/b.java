package zn4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((CreditCardInstalmentAnticipationQuote) obj2).f68783b), Integer.valueOf(((CreditCardInstalmentAnticipationQuote) obj3).f68783b));
    }
}
