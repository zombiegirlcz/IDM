package ybl;

import a09.z;
import ael.r0;
import ael.t0;
import efm.r;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public interface l {
    static Flow a(l lVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        t0 t0Var = (t0) lVar;
        return boh.f.e(t0Var.f3660b.a(t0.d), new z(t0Var, z, (Object) null, 5));
    }

    static r b(l lVar) {
        t0 t0Var = (t0) lVar;
        t0Var.getClass();
        return nim.a.w(c(t0Var, false, 2), new r0(3));
    }

    static /* synthetic */ r c(l lVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ((t0) lVar).h(null, z);
    }

    static akg.n d(l lVar) {
        t0 t0Var = (t0) lVar;
        return nim.a.v(boh.f.e(t0Var.f3660b.a(t0.d), new z((Object) t0Var, false, (Object) null, 5)), new r0(0));
    }
}
