package q06;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface l extends lg0.b {
    static d0 p2(l lVar, String url2) {
        lg0.a fallbackStrategy = lg0.a.IGNORE;
        s06.j jVar = (s06.j) lVar;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        return jVar.c(url2, jVar.a(url2), fallbackStrategy);
    }
}
