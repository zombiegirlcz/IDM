package bbg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(0, this.v, continuation);
            default:
                return new z(1, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = o.f14293a;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.C2(oVar);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.C2(oVar);
                break;
        }
        return Unit.f186387a;
    }
}
