package wl5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            l lVar = new l(sVar, null, 0);
            this.u = 1;
            obj2 = sVar.p2(this, lVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((p0) obj2) == p0.SC_REQUIRED) {
            yji.l.j2(sVar, sVar.e1(new p1c.b()), null, new k(sVar, 0), 1);
        } else {
            sVar.n2(new o(sVar, null, 0), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
