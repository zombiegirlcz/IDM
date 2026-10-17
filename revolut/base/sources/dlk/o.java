package dlk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f115796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar, Function0 function0, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f115796w = function0;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, this.f115796w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.f fVarJ = eVar.f103500q.j();
            this.u = 1;
            obj2 = nim.a.b(fVarJ, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        hha.d dVar = (hha.d) obj2;
        bgk.a aVar2 = eVar.v;
        Intrinsics.h(dVar);
        aVar2.b3(dVar, new ac1.b(6, this.f115796w));
        return Unit.f186387a;
    }
}
