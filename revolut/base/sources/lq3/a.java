package lq3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static c a(jf0.c deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Iterator it8 = u.c(new b(deeplink)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((c) next).f199187a.matches()) {
                break;
            }
        }
        return (c) next;
    }
}
