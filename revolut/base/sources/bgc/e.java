package bgc;

import efm.r;
import kic.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import phc.j;
import ugc.g;

/* JADX INFO: loaded from: classes6.dex */
public interface e {
    static Object a(e eVar, t tVar) {
        fgc.c.Companion.getClass();
        j jVar = (j) ((g) eVar).f280008b;
        fgc.c args = fgc.c.f135030a;
        Intrinsics.checkNotNullParameter(args, "args");
        Object objA = nim.a.a(jVar.f236275g.g(args, true), tVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    static /* synthetic */ r c(e eVar, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return ((g) eVar).i(str, false);
    }
}
