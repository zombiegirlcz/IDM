package lic;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Continuation continuation) {
        super(1, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        s sVar = this.v;
        bgc.e eVar = sVar.f195472m;
        String str = sVar.f195471l.f84922a;
        this.u = 1;
        Object objD = ((ugc.g) eVar).d(str, this);
        return objD == aVar ? aVar : objD;
    }
}
