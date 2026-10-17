package c84;

import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g extends yji.n {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f3(g gVar, it3.d dVar, NaviCommand naviCommand, boolean z, gim.c cVar, int i) {
        if ((i & 2) != 0) {
            naviCommand = new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        }
        NaviCommand naviCommand2 = naviCommand;
        if ((i & 4) != 0) {
            z = false;
        }
        return gVar.e3(dVar, naviCommand2, z, true, cVar);
    }

    public abstract boolean Z2(boolean z, String str, Function1 function1);

    public abstract void b3();

    public abstract Object c3(it3.d dVar, gim.c cVar);

    public abstract boolean d3(Throwable th10);

    public abstract Object e3(it3.d dVar, NaviCommand naviCommand, boolean z, boolean z3, gim.c cVar);
}
