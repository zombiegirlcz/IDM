package pth;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function2 {
    public WorkflowFlowContract$Workflow u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f239719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ WorkflowConfiguration.Workflow f239721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, WorkflowConfiguration.Workflow workflow, Continuation continuation) {
        super(2, continuation);
        this.f239720x = aVar;
        this.f239721y = workflow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.f239720x, this.f239721y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.f239719w
            r2 = 2
            r3 = 1
            r4 = 0
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.a r5 = r10.f239720x
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.util.List r0 = r10.v
            java.util.List r0 = (java.util.List) r0
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow r1 = r10.u
            yhm.o.b(r11)
            goto L8a
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            yhm.o.b(r11)
            goto L39
        L26:
            yhm.o.b(r11)
            pth.v r11 = new pth.v
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow r1 = r10.f239721y
            r11.<init>(r5, r1, r4)
            r10.f239719w = r3
            java.lang.Object r11 = r5.p2(r10, r11)
            if (r11 != r0) goto L39
            goto L88
        L39:
            r1 = r11
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow r1 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow) r1
            java.util.List r11 = r1.f96488a
            yki.i r6 = r5.K
            com.revolut.kompot.navigable.flow.FlowStep r6 = r6.d()
            com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep r6 = (com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep) r6
            if (r6 == 0) goto L4d
            java.lang.String r6 = r6.getF96476b()
            goto L4e
        L4d:
            r6 = r4
        L4e:
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L55:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep r9 = (com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep) r9
            java.lang.String r9 = r9.getF96476b()
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r6, r9)
            if (r9 == 0) goto L55
            r4 = r8
        L6d:
            if (r4 == 0) goto L72
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L72:
            yki.i r4 = r5.K
            oki.h.r2(r4)
            til.h r4 = r5.z
            r10.u = r1
            r6 = r11
            java.util.List r6 = (java.util.List) r6
            r10.v = r6
            r10.f239719w = r2
            java.lang.Object r2 = r4.Z2(r10)
            if (r2 != r0) goto L89
        L88:
            return r0
        L89:
            r0 = r11
        L8a:
            qki.d r11 = r5.J
            pth.r r2 = new pth.r
            r4 = 1
            r2.<init>(r1, r4)
            r5.H2(r11, r2)
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L9f
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.J2(r5)
            goto La9
        L9f:
            r11 = 0
            java.lang.Object r11 = r0.get(r11)
            com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep r11 = (com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep) r11
            r5.T2(r11, r3)
        La9:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pth.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
