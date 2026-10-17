package y4i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import nel.z;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static z a(OrderQuote quote, List instruments) {
        Object next;
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        String str = e1.k(quote).f104721c.f306286a;
        Iterator it8 = instruments.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(str, ((n) next).f214596b)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar == null && !instruments.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No instrument found for base asset ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var);
        }
        if (nVar != null) {
            return nVar.f214597c;
        }
        return null;
    }
}
