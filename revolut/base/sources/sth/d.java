package sth;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r14 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[PHI: r14
      0x007a: PHI (r14v1 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x0077, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:24:0x008c). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            sth.e r0 = r13.v
            cli.y r1 = r0.f265603r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r13.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L28
            if (r3 == r6) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r14)
            goto L8c
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            yhm.o.b(r14)
            goto L7a
        L24:
            yhm.o.b(r14)
            goto L4e
        L28:
            yhm.o.b(r14)
        L2b:
            kotlin.coroutines.CoroutineContext r14 = r13.getContext()
            boolean r14 = skm.e0.x(r14)
            if (r14 == 0) goto Lab
            java.lang.Object r14 = r1.f22677a
            vkm.j2 r14 = (vkm.j2) r14
            java.lang.Object r14 = r14.getValue()
            sth.b r14 = (sth.b) r14
            int r14 = r14.f265599c
            long r7 = (long) r14
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r13.u = r6
            java.lang.Object r14 = skm.k0.b(r7, r13)
            if (r14 != r2) goto L4e
            goto L8b
        L4e:
            jvh.a r14 = r0.o
            java.lang.Object r3 = r1.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            sth.b r3 = (sth.b) r3
            java.lang.String r3 = r3.f265597a
            r13.u = r5
            zuh.o r14 = r14.f178883a
            pil.c r7 = new pil.c
            r8 = 0
            r7.<init>(r3, r8)
            r14.getClass()
            zuh.k r3 = new zuh.k
            r9 = 0
            r3.<init>(r14, r7, r9, r8)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r3, r13)
            if (r14 != r2) goto L7a
            goto L8b
        L7a:
            r8 = r14
            com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow r8 = (com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow) r8
            rth.j r7 = r0.f265601p
            r13.u = r4
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = r13
            java.lang.Object r14 = r7.m(r8, r9, r10, r11, r12)
            if (r14 != r2) goto L8c
        L8b:
            return r2
        L8c:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = zhm.d0.d0(r14)
            com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep r14 = (com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep) r14
            boolean r3 = r14 instanceof com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep.Polling
            if (r3 != 0) goto L9e
            aii.q r14 = aii.q.f5292a
            r0.C2(r14)
            goto L2b
        L9e:
            sl5.a r3 = new sl5.a
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep$Polling r14 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep.Polling) r14
            r7 = 17
            r3.<init>(r14, r7)
            r0.H2(r1, r3)
            goto L2b
        Lab:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: sth.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
