package yu5;

import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(!((CryptoTransactionFilter) obj2).getF71395b()), Boolean.valueOf(!((CryptoTransactionFilter) obj3).getF71395b()));
    }
}
