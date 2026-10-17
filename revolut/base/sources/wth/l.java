package wth;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.product_closures.screen.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.workflow.engine.product_closures.screen.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.workflow.engine.product_closures.screen.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.o;
            String str = aVar2.f96508p.d;
            this.u = 1;
            if (aVar3.j(str, MobileScreenParams.ProductClosures.f105442a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(g.f299988a);
        return Unit.f186387a;
    }
}
