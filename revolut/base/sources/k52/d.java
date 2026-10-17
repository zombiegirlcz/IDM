package k52;

import c12.s0;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer_wrapper.ApmTransferWrapperFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar = this.v;
        ApmTransferWrapperNavigation$InputData apmTransferWrapperNavigation$InputData = eVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (!(apmTransferWrapperNavigation$InputData instanceof ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            obj2 = e.I2(eVar, (ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest) apmTransferWrapperNavigation$InputData, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ApmTransferWrapperFlowContract$Step apmTransferWrapperFlowContract$Step = (ApmTransferWrapperFlowContract$Step) obj2;
        if (apmTransferWrapperFlowContract$Step != null) {
            h.u2(eVar, eVar.f181384s, apmTransferWrapperFlowContract$Step, null, 6);
        } else if (((ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest) apmTransferWrapperNavigation$InputData).f62304c) {
            eVar.C2(s0.f20350a);
        } else {
            h.D2(eVar.f181384s);
        }
        return Unit.f186387a;
    }
}
