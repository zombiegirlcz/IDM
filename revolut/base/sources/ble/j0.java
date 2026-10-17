package ble;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r10.d dVar = fVar.G;
            this.u = 1;
            obj2 = dVar.V(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        fVar.H2(fVar.f89873e0, new bhl.g(((wc6.a) obj2).a(md6.v.f204502a), 4));
        return Unit.f186387a;
    }
}
