package k38;

import g48.r0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import w4l.h;
import w4l.k;
import wkm.l;

/* JADX INFO: loaded from: classes13.dex */
public interface c {
    static l a(c cVar, k kVar, Set set, int i) {
        if ((i & 1) != 0) {
            kVar = h.f294642c;
        }
        if ((i & 2) != 0) {
            q[] elements = {q.ACTIVE, q.OFFBOARDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            set = kotlin.collections.d.y0(elements);
        }
        return ((r0) cVar).d(set, kVar);
    }
}
