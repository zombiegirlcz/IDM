package s44;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ky3.a aVar2 = (ky3.a) ((g) ((j2) pVar.f259769t.f22677a).getValue()).d.getContent();
            if (aVar2 == null || (str = aVar2.f190617b) == null) {
                return Unit.f186387a;
            }
            jvh.a aVar3 = pVar.f259768s;
            WorkflowName workflowName = new WorkflowName(str);
            this.u = 1;
            obj2 = aVar3.a(workflowName, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        pVar.C1(((pth.g) pVar.f259767r).d(new WorkflowConfiguration.Workflow((String) obj2, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), false, new n(pVar, 1)));
        return Unit.f186387a;
    }
}
