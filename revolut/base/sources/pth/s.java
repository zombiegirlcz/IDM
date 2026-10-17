package pth;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f239713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f239714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, Set set, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f239713w = set;
        this.f239714x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f239713w, this.f239714x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r8 == r0) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r8)
            r6 = r7
            goto L90
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            r6 = r7
            goto L7a
        L22:
            yhm.o.b(r8)
            r6 = r7
            goto L57
        L27:
            yhm.o.b(r8)
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.a r1 = r7.v
            qki.d r8 = r1.J
            java.lang.Object r8 = r8.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State r8 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State) r8
            java.lang.String r8 = r8.f
            pth.e r5 = r1.f96495s
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData r5 = r5.f239690a
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration r5 = r5.f96479b
            boolean r6 = r5 instanceof com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.Product
            if (r6 == 0) goto L61
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Product r5 = (com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.Product) r5
            java.lang.String r2 = r5.f78241a
            com.revolut.analytics.tracking.v3.AnalyticsProduct r5 = r5.e
            r7.u = r4
            java.util.Set r3 = r7.f239713w
            r6 = r7
            r4 = r8
            java.io.Serializable r8 = r1.P2(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L57
            goto L8f
        L57:
            java.util.List r8 = (java.util.List) r8
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow r0 = new com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow
            com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState r1 = com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState.NOT_DEFINED
            r0.<init>(r8, r1)
            return r0
        L61:
            r6 = r7
            r4 = r8
            boolean r8 = r5 instanceof com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.Workflow
            if (r8 == 0) goto L7d
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow r5 = (com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.Workflow) r5
            java.lang.String r2 = r5.f78244a
            com.revolut.analytics.tracking.v3.AnalyticsProduct r8 = r5.e
            r6.u = r3
            boolean r5 = r6.f239714x
            r3 = r4
            r4 = r8
            java.lang.Object r8 = r1.R2(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L7a
            goto L8f
        L7a:
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow r8 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow) r8
            return r8
        L7d:
            boolean r8 = r5 instanceof com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.CreateWorkflow
            if (r8 == 0) goto L93
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$CreateWorkflow r5 = (com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration.CreateWorkflow) r5
            java.util.Map r8 = r5.f78237a
            com.revolut.analytics.tracking.v3.AnalyticsProduct r3 = r5.e
            r6.u = r2
            java.lang.Object r8 = com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.I2(r1, r8, r4, r3, r7)
            if (r8 != r0) goto L90
        L8f:
            return r0
        L90:
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow r8 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow) r8
            return r8
        L93:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pth.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
