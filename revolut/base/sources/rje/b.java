package rje;

import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lo5.p;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            p pVar = dVar.f254659l;
            this.u = 1;
            obj2 = ((fp5.f) pVar).c(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        lo5.o oVar = (lo5.o) obj2;
        aii.e eVar = oVar.f197408b;
        if (eVar == null) {
            return dVar.A2(oVar.f197407a);
        }
        n.P2(dVar, dVar.o2(eVar), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
        return Unit.f186387a;
    }
}
