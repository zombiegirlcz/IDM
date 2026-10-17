package kn3;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        long millis;
        long millis2;
        cn3.g gVar = (cn3.g) obj3;
        if (gVar instanceof cn3.e) {
            millis = ((cn3.e) gVar).f25347a.a();
        } else {
            if (!(gVar instanceof cn3.f)) {
                throw new NoWhenBranchMatchedException();
            }
            millis = ((cn3.f) gVar).f25348a.f79289h.getMillis();
        }
        Long lValueOf = Long.valueOf(millis);
        cn3.g gVar2 = (cn3.g) obj2;
        if (gVar2 instanceof cn3.e) {
            millis2 = ((cn3.e) gVar2).f25347a.a();
        } else {
            if (!(gVar2 instanceof cn3.f)) {
                throw new NoWhenBranchMatchedException();
            }
            millis2 = ((cn3.f) gVar2).f25348a.f79289h.getMillis();
        }
        return cim.b.b(lValueOf, Long.valueOf(millis2));
    }
}
