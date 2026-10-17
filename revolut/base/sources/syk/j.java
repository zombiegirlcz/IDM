package syk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ss4.a0;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
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
            o oVar = this.v;
            wkm.l lVarQ = q.Q(mo3.a.g(ybl.k.k(oVar.f266696b, null, null, null, 7), null, new a0(23), 1), new s9b.n((Continuation) null, oVar, 18));
            this.u = 1;
            obj2 = q.z(lVarQ, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Boolean bool = (Boolean) obj2;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
