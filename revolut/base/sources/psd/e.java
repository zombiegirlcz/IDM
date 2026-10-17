package psd;

import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((CombinedPocketsBalance) obj3).f71374b, ((CombinedPocketsBalance) obj2).f71374b);
    }
}
