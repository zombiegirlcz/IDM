package xg6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((ExternalInstitution) obj2).f66108b, ((ExternalInstitution) obj3).f66108b);
    }
}
