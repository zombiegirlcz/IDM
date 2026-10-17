package thf;

import bnf.r;
import java.util.Map;
import tof.a3;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public interface m {
    static /* synthetic */ String a(m mVar, a3 a3Var, Map map, Map map2, Map map3, r61.c cVar, String str, Map map4, int i) {
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = r0.g();
        }
        if ((i & 16) != 0) {
            r61.c.Companion.getClass();
            cVar = r61.b.a();
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            map4 = r0.g();
        }
        return ((r) mVar).p(a3Var, map, map2, map3, cVar, str, map4, r0.g());
    }
}
