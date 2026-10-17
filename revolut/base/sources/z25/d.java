package z25;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rp0.p;
import skm.a2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        g gVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a2 a2Var = gVar.f318972w;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.pay_later.impl.ui.help.a aVar3 = (com.revolut.feature.pay_later.impl.ui.help.a) gVar.f318969r;
                aVar3.getClass();
                aVar3.V2(new qc8.b(aVar3, continuation, 7), new yi5.b(29));
                break;
        }
        return Unit.f186387a;
    }
}
