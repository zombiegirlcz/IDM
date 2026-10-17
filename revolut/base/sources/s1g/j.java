package s1g;

import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                eVar.v2(new TravelExperiencesCancellationScreenContract$OutputData(false));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                eVar.v2(new TravelExperiencesCancellationScreenContract$OutputData(true));
                break;
        }
        return Unit.f186387a;
    }
}
