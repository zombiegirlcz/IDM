package o65;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o65.b;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
        return b.C1235b.f222502a;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return b.C1235b.f222502a;
    }
}
