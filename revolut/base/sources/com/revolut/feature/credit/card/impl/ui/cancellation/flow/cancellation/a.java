package com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation;

import al4.d;
import al4.n;
import al4.q;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$Step;
import com.revolut.feature.credit.models.CreditAccountType;
import cq4.b;
import ffk.t;
import gim.c;
import hl4.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.z;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardCancellationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f69126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f69127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f69128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f69129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fq4.a f69130t;
    public final zp4.b u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f69131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wj0.a f69132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wie.a f69133y;
    public final i z;

    public a(CreditCardCancellationFlowContract$InputData inputData, q creditCardProductInteractor, d creditCardAdditionalCardholdersInteractor, n creditCardInteractor, z creditCardCancellationInteractor, fq4.a surveyDeeplinkMapper, zp4.b creditCardCancellationFlowPromptFactory, gte.a featureToggleInteractor, t pricingPlanInteractor, wj0.a idempotencyKeyHolder, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardCancellationInteractor, "creditCardCancellationInteractor");
        Intrinsics.checkNotNullParameter(surveyDeeplinkMapper, "surveyDeeplinkMapper");
        Intrinsics.checkNotNullParameter(creditCardCancellationFlowPromptFactory, "creditCardCancellationFlowPromptFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.o = inputData;
        this.f69126p = creditCardProductInteractor;
        this.f69127q = creditCardAdditionalCardholdersInteractor;
        this.f69128r = creditCardInteractor;
        this.f69129s = creditCardCancellationInteractor;
        this.f69130t = surveyDeeplinkMapper;
        this.u = creditCardCancellationFlowPromptFactory;
        this.v = featureToggleInteractor;
        this.f69131w = pricingPlanInteractor;
        this.f69132x = idempotencyKeyHolder;
        this.f69133y = creditAccountDestinationResolver;
        this.z = d8l.d.a(this, new cnc.t(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a r9, java.lang.String r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof cq4.h
            if (r0 == 0) goto L13
            r0 = r11
            cq4.h r0 = (cq4.h) r0
            int r1 = r0.f108001y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108001y = r1
            goto L18
        L13:
            cq4.h r0 = new cq4.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f107999w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108001y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.revolut.retail.core.navigation.FeatureCommand r9 = r0.v
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r10 = r0.u
            yhm.o.b(r11)
            goto Laa
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r10 = r0.u
            yhm.o.b(r11)
            goto L94
        L3d:
            yhm.o.b(r11)
            fq4.a r11 = r9.f69130t
            r11.getClass()
            r2 = 0
            if (r10 == 0) goto L59
            boolean r5 = kotlin.text.d0.W(r10)
            if (r5 == 0) goto L4f
            goto L59
        L4f:
            q06.d r11 = r11.f137186a
            s06.c r11 = (s06.c) r11
            jf0.c r10 = r11.d(r10)
            if (r10 != 0) goto L5b
        L59:
            r5 = r2
            goto L85
        L5b:
            java.lang.String r11 = r10.e(r4)
            java.lang.String r5 = "form"
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r5)
            if (r11 != 0) goto L68
            goto L59
        L68:
            java.lang.String r11 = r10.e(r3)
            int r5 = r11.length()
            if (r5 <= 0) goto L73
            goto L74
        L73:
            r11 = r2
        L74:
            if (r11 != 0) goto L77
            goto L59
        L77:
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r5 = new com.revolut.core.backend_flow.api.navigation.BackendFlowDestination
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a r6 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.INSTANCE
            java.util.HashMap r10 = r10.d
            r7 = 4
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput r10 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Companion.a(r6, r11, r10, r2, r7)
            r5.<init>(r10)
        L85:
            if (r5 != 0) goto L88
            return r2
        L88:
            r0.u = r5
            r0.f108001y = r4
            java.lang.Object r11 = r9.K2(r0)
            if (r11 != r1) goto L93
            goto La6
        L93:
            r10 = r5
        L94:
            com.revolut.kompot.common.StackDestination r11 = (com.revolut.kompot.common.StackDestination) r11
            com.revolut.retail.core.navigation.FeatureCommand r11 = zh9.u0.f(r11)
            r0.u = r10
            r0.v = r11
            r0.f108001y = r3
            java.lang.Object r9 = r9.J2(r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            r8 = r11
            r11 = r9
            r9 = r8
        Laa:
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r11)
            com.revolut.retail.core.navigation.FeatureCommand r10 = zh9.u0.f(r10)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r10)
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a.I2(com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cq4.c
            if (r0 == 0) goto L13
            r0 = r6
            cq4.c r0 = (cq4.c) r0
            int r1 = r0.f107990w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107990w = r1
            goto L18
        L13:
            cq4.c r0 = new cq4.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f107990w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L47
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            gte.a r6 = r5.v
            com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCancellationPlanDowngrade r2 = com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCancellationPlanDowngrade.f68678c
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L3e
            goto L52
        L3e:
            r0.f107990w = r3
            java.lang.Object r6 = r5.L2(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r6 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r6
            if (r6 != 0) goto L4c
            goto L52
        L4c:
            hha.d r0 = r6.f81129a
            boolean r1 = r0.f152296p
            if (r1 == 0) goto L53
        L52:
            return r4
        L53:
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$PlanDowngradeFlow r1 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$PlanDowngradeFlow
            java.lang.String r0 = r0.f152287a
            hha.i r6 = r6.f81144x
            if (r6 != 0) goto L5d
            hha.i r6 = hha.i.MONTHLY
        L5d:
            r1.<init>(r0, r6, r4)
            com.revolut.retail.core.navigation.FeatureCommand r6 = gc0.c.f(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a.J2(gim.c):java.lang.Object");
    }

    public final Object K2(c cVar) {
        CreditAccountType.CreditCard creditCard = new CreditAccountType.CreditCard(this.o.f69114a);
        rie.a aVar = rie.b.Companion;
        return this.f69133y.c(creditCard, null, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cq4.g
            if (r0 == 0) goto L13
            r0 = r7
            cq4.g r0 = (cq4.g) r0
            int r1 = r0.f107998w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107998w = r1
            goto L18
        L13:
            cq4.g r0 = new cq4.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f107998w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            goto L5b
        L28:
            r7 = move-exception
            goto L5f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            ffk.t r7 = r6.f69131w     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            w4l.h r2 = w4l.h.f294642c     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            efm.r r7 = r7.v(r2)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            zhm.h0 r2 = zhm.h0.f322473a     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            efm.r r7 = ue0.e.p(r7, r2)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            efm.r r7 = zi0.c.J(r7)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            clk.b r2 = new clk.b     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            r5 = 19
            r2.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            efm.r r7 = m70.a.g(r7, r4, r2, r3)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            r0.f107998w = r3     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            java.lang.Object r7 = nim.a.c(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r7 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r7     // Catch: java.util.concurrent.CancellationException -> L28 java.lang.Exception -> L5e
            return r7
        L5e:
            return r4
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        this.f69132x.a("CREDIT_CARD_DEACTIVATION_IDEMPOTENCY_TAG");
        CreditCardCancellationFlowContract$InputData creditCardCancellationFlowContract$InputData = this.o;
        CreditCardCancellationDestination.CancellationType cancellationType = creditCardCancellationFlowContract$InputData.f69115b;
        boolean z = cancellationType instanceof CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelAdditionalCard;
        i iVar = this.z;
        if (z) {
            h.t2(this, iVar, new CreditCardCancellationFlowContract$Step.AdditionalCardholderFacilityOwnerConfirmationScreen(((CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelAdditionalCard) cancellationType).f68902a), false, null, false, 12);
            return;
        }
        if (cancellationType instanceof CreditCardCancellationDestination.CancellationType.AdditionalCardOwnerCancelOwnCard) {
            h.t2(this, iVar, CreditCardCancellationFlowContract$Step.AdditionalCardholderSelfConfirmationScreen.f69119a, false, null, false, 12);
            return;
        }
        if (!(cancellationType instanceof CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelOwnCard)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVar = creditCardCancellationFlowContract$InputData.f69116c;
        dj0.d dVar = creditCardCancellationFlowContract$InputData.d;
        RepaymentDeferral repaymentDeferral = creditCardCancellationFlowContract$InputData.e;
        PayoffBreakdown payoffBreakdown = creditCardCancellationFlowContract$InputData.f;
        wi0.b bVar = creditCardCancellationFlowContract$InputData.f69117g;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h.t2(this, iVar, new CreditCardCancellationFlowContract$Step.ConfirmationScreen(gVar, dVar, repaymentDeferral, payoffBreakdown, bVar), false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
