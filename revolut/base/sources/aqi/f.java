package aqi;

import kotlin.jvm.internal.Intrinsics;
import le.u1;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f implements e4m.e {
    public static a a(fsi.g coreActivityApi, d delegate) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        a aVar = (a) u1.i(a.class, coreActivityApi.q0());
        a aVar2 = delegate;
        if (aVar != null) {
            aVar2 = aVar;
        }
        s.k(aVar2);
        return aVar2;
    }
}
