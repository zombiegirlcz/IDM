package t50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import t50.i;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            su4.n nVar = new su4.n(uVar, null, 5);
            this.u = 1;
            if (uVar.p2(this, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        uVar.C2(i.a.f268019a);
        return Unit.f186387a;
    }
}
