package pz4;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private d() {
    }

    public static h a(jf0.c deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        e eVar = new e("revolut://app/credit/financial-difficulty/?", deeplink);
        f fVar = new f(deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Iterator it8 = v.k(eVar, fVar, new g("revolut://app/credit/forbearance-application/loans/?", deeplink)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((h) next).f240895a.matches()) {
                break;
            }
        }
        return (h) next;
    }
}
