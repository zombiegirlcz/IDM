package sm6;

import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((IndiaUpiProvider) obj3).e), Boolean.valueOf(((IndiaUpiProvider) obj2).e));
    }
}
