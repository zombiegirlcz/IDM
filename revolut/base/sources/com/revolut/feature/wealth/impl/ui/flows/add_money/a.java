package com.revolut.feature.wealth.impl.ui.flows.add_money;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r6 == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            com.revolut.feature.wealth.impl.ui.flows.add_money.b r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L51
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L3e
        L1e:
            yhm.o.b(r6)
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData r6 = r2.o
            boolean r1 = r6 instanceof com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType
            if (r1 == 0) goto L2f
            com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney r0 = new com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithTransferSubjectIdAndWealthAccountType r6 = (com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType) r6
            r0.<init>(r6)
            goto L54
        L2f:
            boolean r1 = r6 instanceof com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithPocketId
            if (r1 == 0) goto L42
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithPocketId r6 = (com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithPocketId) r6
            r5.u = r4
            java.lang.Object r6 = com.revolut.feature.wealth.impl.ui.flows.add_money.b.J2(r2, r6, r5)
            if (r6 != r0) goto L3e
            goto L50
        L3e:
            r0 = r6
            com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney r0 = (com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step.AddMoney) r0
            goto L54
        L42:
            boolean r1 = r6 instanceof com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithAccountIdAndHoldingId
            if (r1 == 0) goto L5e
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithAccountIdAndHoldingId r6 = (com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithAccountIdAndHoldingId) r6
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.wealth.impl.ui.flows.add_money.b.I2(r2, r6, r5)
            if (r6 != r0) goto L51
        L50:
            return r0
        L51:
            r0 = r6
            com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney r0 = (com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step.AddMoney) r0
        L54:
            yki.i r6 = r2.f95539r
            r1 = 0
            r3 = 6
            oki.h.u2(r2, r6, r0, r1, r3)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.add_money.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
