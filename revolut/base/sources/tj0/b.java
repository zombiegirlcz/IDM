package tj0;

import mm0.n;
import mm0.o;
import mm0.p;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private b() {
    }

    public static c a(o oVar) {
        if (!(oVar instanceof n) && !(oVar instanceof p)) {
            oVar = null;
        }
        if (oVar != null) {
            return new c(oVar);
        }
        return null;
    }
}
