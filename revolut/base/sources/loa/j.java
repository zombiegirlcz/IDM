package loa;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
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
        l lVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = lVar.f197442s;
            WorkflowName workflowName = new WorkflowName("TEST_FINCRIME_FLOWS");
            this.u = 1;
            obj2 = aVar2.a(workflowName, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return lVar.C1(til.m.a(lVar.f197443t, new WorkflowConfiguration.Workflow((String) obj2, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), null, 4));
    }
}
