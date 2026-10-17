package spb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function3 {
    public /* synthetic */ Throwable u;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        j jVar = new j(3, (Continuation) obj4);
        jVar.u = (Throwable) obj3;
        jVar.invokeSuspend(Unit.f186387a);
        throw null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Throwable th10 = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        throw th10;
    }
}
