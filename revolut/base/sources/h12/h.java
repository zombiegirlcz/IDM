package h12;

import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tof.i7;
import tof.l;
import tof.n;
import tof.v5;

/* JADX INFO: loaded from: classes20.dex */
public interface h {
    static vkm.d a(h hVar, n infoProvider, l contactType, v5 v5Var, i7 i7Var, int i) {
        if ((i & 4) != 0) {
            v5Var = null;
        }
        if ((i & 8) != 0) {
            i7Var = null;
        }
        u12.c cVar = (u12.c) hVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(contactType, "contactType");
        return rd0.e.b(whf.b.a(cVar.d, w.h(u12.c.e(infoProvider, contactType, v5Var, i7Var)), null, 4, null, 10));
    }

    static vkm.d b(h hVar, n infoProvider, l contactType, v5 v5Var, i7 i7Var, int i) {
        if ((i & 4) != 0) {
            v5Var = null;
        }
        if ((i & 8) != 0) {
            i7Var = null;
        }
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        Intrinsics.checkNotNullParameter(contactType, "contactType");
        return rd0.e.b(whf.b.a(((u12.c) hVar).d, w.h(u12.c.e(infoProvider, contactType, v5Var, i7Var)), null, null, null, 14));
    }
}
