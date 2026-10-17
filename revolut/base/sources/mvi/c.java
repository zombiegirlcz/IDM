package mvi;

import bti.n;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        n nVar = ((AsftPass) obj2).f98714b;
        n nVar2 = n.ACTIVE;
        return cim.b.b(nVar == nVar2 ? 0 : num, ((AsftPass) obj3).f98714b == nVar2 ? 0 : 1);
    }
}
