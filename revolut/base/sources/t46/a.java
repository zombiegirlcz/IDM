package t46;

import go.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n9l.b;
import qe0.o;
import zhm.d0;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static Flow a(a aVar, List currencyPairs) {
        b period = b.SEC_3;
        x46.b bVar = (x46.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(period, "period");
        List list = currencyPairs;
        Set setI1 = list instanceof Set ? (Set) list : null;
        if (setI1 == null) {
            setI1 = d0.i1(list);
        }
        Set set = setI1;
        return set.isEmpty() ? new g(c.P(f0.f322471a, false, null, 3), 2) : nim.a.v(o.a(bVar.e, set, period.a(), null, false, null, 28), new x29.a(16));
    }
}
