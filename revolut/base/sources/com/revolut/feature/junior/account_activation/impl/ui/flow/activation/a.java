package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ AccountActivationFlowContract$Step.Workflow v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f76643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AccountActivationFlowContract$Step.Workflow workflow, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = workflow;
        this.f76643w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f76643w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r2.V2(r5, r6) == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f r2 = r6.f76643w
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step$Workflow r3 = r6.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r7)
            goto L4b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L38
        L20:
            yhm.o.b(r7)
            boolean r7 = r3 instanceof com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract.Step.Workflow.Activation
            if (r7 == 0) goto L34
            hj8.a r7 = r2.A
            r6.u = r5
            nj8.n r7 = (nj8.n) r7
            java.lang.Object r7 = r7.n(r5, r6)
            if (r7 != r0) goto L38
            goto L4a
        L34:
            boolean r7 = r3 instanceof com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract.Step.Workflow.PostActivation
            if (r7 == 0) goto L54
        L38:
            boolean r7 = r3 instanceof com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract.Step.Workflow.Activation
            if (r7 == 0) goto L3e
            r5 = 0
            goto L42
        L3e:
            boolean r7 = r3 instanceof com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract.Step.Workflow.PostActivation
            if (r7 == 0) goto L4e
        L42:
            r6.u = r4
            java.lang.Object r7 = r2.V2(r5, r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L4e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L54:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
