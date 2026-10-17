package whf;

import anf.w;
import java.util.ArrayList;
import whf.j;

/* JADX INFO: loaded from: classes8.dex */
public interface n {
    static /* synthetic */ ArrayList a(n nVar, p pVar, o oVar, j jVar, c cVar, int i) {
        if ((i & 2) != 0) {
            oVar = o.SWIPE_ITEM_NO_ACTION;
        }
        if ((i & 4) != 0) {
            jVar = j.a.f297643a;
        }
        if ((i & 8) != 0) {
            cVar = new c(7);
        }
        return ((w) nVar).d(pVar, oVar, jVar, cVar);
    }
}
