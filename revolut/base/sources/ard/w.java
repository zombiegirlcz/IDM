package ard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lk0.h;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.select.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            z1 z1Var = this.v.f87898y;
            this.u = 1;
            if (z1Var.emit(h.c.f196177a, this) == aVar) {
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
