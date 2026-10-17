package mt8;

import efm.r;
import kotlin.coroutines.g;
import rd0.e;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public interface d {
    static ufm.b c(d dVar) {
        dVar.getClass();
        return w.o0(g.f186406a, new b(dVar, false, null, 0));
    }

    default r a(boolean z) {
        return e.c(((qt8.d) this).e(z), g.f186406a);
    }

    default r b() {
        return e.c(mo3.a.g(((qt8.d) this).e(false), null, new qsk.d(3), 1), g.f186406a);
    }

    default ufm.b getKyc() {
        return w.o0(g.f186406a, new c(this, null, 1));
    }
}
