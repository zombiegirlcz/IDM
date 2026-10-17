package h7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class j0 extends gim.i implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        new j0(3, (Continuation) obj4).invokeSuspend(Unit.f186387a);
        return Boolean.FALSE;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return Boolean.FALSE;
    }
}
