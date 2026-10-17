package y15;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private e() {
    }

    public static g a(jf0.c deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Iterator it8 = u.c(new f(deeplink)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((f) next).f310304a.matches()) {
                break;
            }
        }
        return (g) next;
    }
}
