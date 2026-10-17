package mti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((AsftTerminal) obj2).f98738b, ((AsftTerminal) obj3).f98738b);
    }
}
