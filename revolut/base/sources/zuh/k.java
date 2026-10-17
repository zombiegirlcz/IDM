package zuh;

import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import evh.d0;
import evh.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public avh.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f325474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f325475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pil.c f325476y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, pil.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325475x = oVar;
        this.f325476y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f325475x, this.f325476y, continuation, 0);
            default:
                return new k(this.f325475x, this.f325476y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        avh.e eVar;
        avh.e eVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f325474w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    o oVar = this.f325475x;
                    avh.e eVar3 = oVar.d;
                    WorkflowService workflowService = oVar.f325482c;
                    pil.c cVar = this.f325476y;
                    String str = cVar.f236619a;
                    boolean z = cVar.f236620b;
                    this.v = eVar3;
                    this.f325474w = 1;
                    obj2 = workflowService.getWorkflow(str, z, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    eVar = eVar3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = this.v;
                    yhm.o.b(obj2);
                }
                return ((avh.g) eVar).f((d0) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f325474w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = this.f325475x;
                    avh.e eVar4 = oVar2.d;
                    WorkflowService workflowService2 = oVar2.f325482c;
                    pil.c cVar2 = this.f325476y;
                    String str2 = cVar2.f236619a;
                    boolean z3 = cVar2.f236620b;
                    this.v = eVar4;
                    this.f325474w = 1;
                    obj2 = workflowService2.getWorkflowDtoV2(str2, z3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    eVar2 = eVar4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = this.v;
                    yhm.o.b(obj2);
                }
                return ((avh.g) eVar2).g((e0) obj2);
        }
    }
}
