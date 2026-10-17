package ft5;

import akg.n;
import kotlin.jvm.internal.Intrinsics;
import llh.j;
import lu5.o;
import lu5.r;
import w4l.h;
import w4l.k;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    static n a(r rVar, k loadingStrategy, a params, int i) {
        if ((i & 1) != 0) {
            loadingStrategy = h.f294642c;
        }
        if ((i & 2) != 0) {
            params = new a(null, 7);
        }
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.v(nim.a.v(rVar.f200040b.b(loadingStrategy), new o(rVar, 0)), new j(rVar, params, 26));
    }
}
