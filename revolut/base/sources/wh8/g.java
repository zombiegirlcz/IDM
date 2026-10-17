package wh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorWorkflowService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f297437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f297438x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f297438x = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(this.f297438x, continuation, 0);
                gVar.f297437w = str;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(this.f297438x, continuation, 1);
                gVar2.f297437w = str;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f297437w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                JuniorWorkflowService juniorWorkflowService = this.f297438x.f297442a;
                this.f297437w = null;
                this.v = 1;
                Object workflows = juniorWorkflowService.getWorkflows(str, th8.e.ONBOARDING.a(), this);
                return workflows == aVar ? aVar : workflows;
            default:
                String str2 = this.f297437w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                JuniorWorkflowService juniorWorkflowService2 = this.f297438x.f297442a;
                this.f297437w = null;
                this.v = 1;
                Object workflowsConfig = juniorWorkflowService2.getWorkflowsConfig(str2, this);
                return workflowsConfig == aVar2 ? aVar2 : workflowsConfig;
        }
    }
}
