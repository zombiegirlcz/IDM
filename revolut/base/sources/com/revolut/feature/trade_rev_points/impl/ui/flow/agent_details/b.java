package com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details;

import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep agentDetails;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            TradeRevPointsAgentDetailsFlowContract$InputData tradeRevPointsAgentDetailsFlowContract$InputData = cVar.o;
            if (tradeRevPointsAgentDetailsFlowContract$InputData instanceof TradeRevPointsAgentDetailsFlowContract$InputData.Details) {
                agentDetails = new TradeRevPointsAgentDetailsFlowContract$Step.AgentDetails(((TradeRevPointsAgentDetailsFlowContract$InputData.Details) tradeRevPointsAgentDetailsFlowContract$InputData).f91112a);
                h.t2(cVar, cVar.f91131t, agentDetails, false, null, false, 14);
                return Unit.f186387a;
            }
            if (!(tradeRevPointsAgentDetailsFlowContract$InputData instanceof TradeRevPointsAgentDetailsFlowContract$InputData.Transfer)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            obj2 = c.I2(cVar, (TradeRevPointsAgentDetailsFlowContract$InputData.Transfer) tradeRevPointsAgentDetailsFlowContract$InputData, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        agentDetails = (TradeRevPointsAgentDetailsFlowContract$Step) obj2;
        h.t2(cVar, cVar.f91131t, agentDetails, false, null, false, 14);
        return Unit.f186387a;
    }
}
