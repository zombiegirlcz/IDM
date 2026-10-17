package wje;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.settings.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.tab.crypto.impl.ui.settings.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.tab.crypto.impl.ui.settings.a aVar2 = this.u;
        if (aVar2.u.i()) {
            yji.l.a1(aVar2, nim.a.v(aVar2.v.b(), new m(0)), null, null, new l(aVar2, null, 3), 3);
        }
        return Unit.f186387a;
    }
}
