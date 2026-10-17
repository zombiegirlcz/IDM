package i61;

import efm.r;
import i2l.n0;
import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    static r a(a aVar, xi0.b initCCY, l pocketType, int i) {
        if ((i & 2) != 0) {
            pocketType = l.CURRENT;
        }
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(initCCY, "initCCY");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return m70.a.g(bVar.b(initCCY, pocketType, false), null, new n0(13), 1);
    }
}
