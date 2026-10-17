package o0c;

import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements e4m.e {
    public static o1c.a a(ugc.a provider) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object obj2 = ((phm.a) provider.f279998b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        o1c.a aVar = (o1c.a) obj2;
        s.k(aVar);
        return aVar;
    }
}
