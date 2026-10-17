package zf8;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static io3.d a(List pockets, xi0.b baseCurrency) {
        Object next;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Iterator it8 = pockets.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            io3.d dVar = (io3.d) next;
            if (dVar.u() == io3.l.CURRENT && Intrinsics.f(dVar.getCurrency(), baseCurrency.f306286a) && dVar.o() != io3.i.EXTERNAL) {
                break;
            }
        }
        return (io3.d) next;
    }
}
