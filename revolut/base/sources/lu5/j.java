package lu5;

import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar = ((CombinedPocketsBalance) obj3).f71374b;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        dj0.d dVar2 = ((CombinedPocketsBalance) obj2).f71374b;
        return cim.b.b(lValueOf, dVar2 != null ? Long.valueOf(dVar2.f115082a) : null);
    }
}
