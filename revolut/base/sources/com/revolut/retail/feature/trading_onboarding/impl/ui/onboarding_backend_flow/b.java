package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow;

import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ TradingOnboardingBackendFlowContract$Configuration.Regular v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f104232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TradingOnboardingBackendFlowContract$Configuration.Regular regular, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = regular;
        this.f104232w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f104232w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r8 == r1) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.c r0 = r7.f104232w
            f1l.g r0 = r0.f104234n
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r8)
            goto L4b
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L39
        L20:
            yhm.o.b(r8)
            com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration$Regular r8 = r7.v
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig r2 = r8.f104224a
            com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart r8 = r8.f104225b
            boolean r5 = r2 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig
            r6 = 0
            if (r5 == 0) goto L3c
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r2 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) r2
            r7.u = r4
            java.lang.Object r8 = r0.a(r2, r8, r6, r7)
            if (r8 != r1) goto L39
            goto L4a
        L39:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            goto L4d
        L3c:
            boolean r4 = r2 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig
            if (r4 == 0) goto L66
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingRemediationFeatureConfig r2 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig) r2
            r7.u = r3
            java.lang.Object r8 = r0.b(r2, r8, r6, r7)
            if (r8 != r1) goto L4b
        L4a:
            return r1
        L4b:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
        L4d:
            com.revolut.retail.core.navigation.FinishCommand r0 = new com.revolut.retail.core.navigation.FinishCommand
            java.lang.Integer r1 = new java.lang.Integer
            r2 = -1
            r1.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "nextNaviCommand"
            r2.<init>(r3, r8)
            java.util.Map r8 = zhm.q0.c(r2)
            r2 = 0
            r3 = 4
            r0.<init>(r1, r8, r2, r3)
            return r0
        L66:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
