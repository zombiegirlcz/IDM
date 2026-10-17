package ek7;

import ek7.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            j60.a.v(pVar.f126975s, false, null, 3);
            ack.n nVar = new ack.n(9);
            e94.g gVar = new e94.g(pVar, null, 3);
            this.u = 1;
            obj2 = n14.k.V(pVar, null, null, nVar, gVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            pVar.v2(j.a.f126968a);
        }
        return Unit.f186387a;
    }
}
