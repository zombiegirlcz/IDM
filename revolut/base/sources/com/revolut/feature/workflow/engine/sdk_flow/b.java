package com.revolut.feature.workflow.engine.sdk_flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(r2, r10, r4, r6, null, r9, 8) == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.workflow.engine.sdk_flow.f r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L53
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L2c
        L1e:
            yhm.o.b(r10)
            jvh.a r10 = r2.f96602q
            r9.u = r4
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto L2c
            goto L52
        L2c:
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData r10 = r2.o
            java.lang.String r10 = r10.getF96583a()
            com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData r1 = r2.o
            boolean r5 = r1 instanceof com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData.Predefined
            r6 = 0
            if (r5 == 0) goto L3f
            com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData$Predefined r1 = (com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData.Predefined) r1
            goto L40
        L3f:
            r1 = r6
        L40:
            if (r1 == 0) goto L44
            java.lang.String r6 = r1.f96581b
        L44:
            r5 = r6
            r9.u = r3
            r6 = 0
            r8 = 8
            r7 = r9
            r3 = r10
            java.lang.Object r10 = com.revolut.feature.workflow.engine.sdk_flow.f.K2(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.sdk_flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
