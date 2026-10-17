package yok;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends tla.f {
    @Override // tla.f
    public final Object Z2(Function1 function1, gim.i iVar) {
        Object objInvoke = function1.invoke(iVar);
        return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
    }
}
