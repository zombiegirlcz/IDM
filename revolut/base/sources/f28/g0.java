package f28;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    private g0() {
    }

    public static eel.c a(eel.c cVar, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(cVar, "default");
        Iterator<E> it8 = h0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h0) next).b(), str)) {
                break;
            }
        }
        h0 h0Var = (h0) next;
        switch (h0Var == null ? -1 : f0.f131463a[h0Var.ordinal()]) {
            case 1:
                return eel.c.ONE_DAY;
            case 2:
                return eel.c.ONE_WEEK;
            case 3:
                return eel.c.ONE_MONTH;
            case 4:
                return eel.c.SIX_MONTHS;
            case 5:
                return eel.c.ONE_YEAR;
            case 6:
                return eel.c.ALL;
            default:
                return cVar;
        }
    }
}
