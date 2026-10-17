package zxd;

import efm.r;
import io3.l;
import java.util.Set;
import ryd.f;
import ryd.w;

/* JADX INFO: loaded from: classes7.dex */
public interface c {
    static r b(c cVar, Set set, String str, l lVar, int i) {
        Boolean bool = Boolean.TRUE;
        Set set2 = (i & 1) != 0 ? null : set;
        Boolean bool2 = (i & 4) != 0 ? null : bool;
        l lVar2 = (i & 8) != 0 ? null : lVar;
        w wVar = (w) cVar;
        wVar.getClass();
        return wVar.n(2, new f(wVar, set2, str, bool2, lVar2, 0));
    }
}
