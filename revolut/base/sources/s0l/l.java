package s0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar = this.v;
            jmc.e eVar = new jmc.e(sVar, null, 15);
            this.u = 1;
            if (pu7.a.B(sVar.k, "promptPrimary", eVar, this) == aVar) {
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
