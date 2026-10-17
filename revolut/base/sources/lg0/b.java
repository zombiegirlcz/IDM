package lg0;

import efm.d0;
import km2.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    static /* synthetic */ d0 s1(b bVar, String str, a aVar, Boolean bool, int i) {
        if ((i & 2) != 0) {
            aVar = a.IGNORE;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return bVar.Z0(str, aVar, bool);
    }

    static /* synthetic */ Object x1(b bVar, String str, a aVar, Boolean bool, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            aVar = a.IGNORE;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return bVar.L1(str, aVar, bool, continuation);
    }

    Object L1(String str, a aVar, Boolean bool, Continuation continuation);

    default d0 Z0(String url2, a fallbackStrategy, Boolean bool) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        return w.o0(p0.f264003c, new n(17, this, url2, fallbackStrategy, bool, (Continuation) null));
    }

    boolean y1(String str);
}
