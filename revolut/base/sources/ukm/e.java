package ukm;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f280807a = new cfm.c("NO_ELEMENT", 3);

    public static a a(CoroutineScope coroutineScope, int i, skm.d0 d0Var, Function1 function1, Function2 function2, int i2) {
        a aVar;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            d0Var = skm.d0.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        CoroutineContext coroutineContextB = skm.x.b(coroutineScope, gVar);
        q qVarA = vc.s.a(i, null, null, 6);
        d0Var.getClass();
        if (d0Var == skm.d0.LAZY) {
            e0 e0Var = new e0(coroutineContextB, qVarA, false);
            e0Var.e = fim.h.a(e0Var, e0Var, function2);
            aVar = e0Var;
        } else {
            aVar = new a(coroutineContextB, qVarA, true);
        }
        if (function1 != null) {
            aVar.k(function1);
        }
        aVar.j0(d0Var, aVar, function2);
        return aVar;
    }
}
