package zii;

import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import zc0.m;

/* JADX INFO: loaded from: classes13.dex */
public interface i {
    static /* synthetic */ ifm.c E0(i iVar, r rVar, Function1 function1, plc.i iVar2, int i) {
        Function1 cVar = iVar2;
        if ((i & 2) != 0) {
            cVar = new c(9);
        }
        return iVar.w0(rVar, function1, cVar, new m(28), new c(10));
    }

    static /* synthetic */ void G(i iVar, efm.b bVar, Function0 function0, vrh.c cVar, int i) {
        if ((i & 2) != 0) {
            function0 = new m(26);
        }
        Function1 cVar2 = cVar;
        if ((i & 4) != 0) {
            cVar2 = new c(5);
        }
        iVar.y0(bVar, false, function0, cVar2);
    }

    static /* synthetic */ void t(i iVar, r rVar, Function1 function1, plc.i iVar2, int i) {
        if ((i & 1) != 0) {
            function1 = new c(6);
        }
        Function1 function12 = function1;
        Function1 cVar = iVar2;
        if ((i & 2) != 0) {
            cVar = new c(7);
        }
        iVar.E(rVar, function12, cVar, new m(27), new c(8));
    }

    ifm.c E(r rVar, Function1 function1, Function1 function12, m mVar, c cVar);

    ifm.c w0(r rVar, Function1 function1, Function1 function12, m mVar, c cVar);

    ofm.h y0(efm.b bVar, boolean z, Function0 function0, Function1 function1);
}
