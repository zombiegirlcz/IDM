package v7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsTransaction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((CobrandedCardsTransaction) obj3).f82419b, ((CobrandedCardsTransaction) obj2).f82419b);
    }
}
