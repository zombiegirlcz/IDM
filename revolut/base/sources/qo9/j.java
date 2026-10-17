package qo9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.air.widget.impl.ui.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dqa.b f248085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar, dqa.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f248085w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f248085w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            dqa.b bVar = this.f248085w;
            com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar2 = this.v;
            i iVar = new i(aVar2, bVar, null);
            this.u = 1;
            if (aVar2.p2(this, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
