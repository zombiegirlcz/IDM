package com.revolut.feature.apm.blik.impl.ui.flow;

import c12.j0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.feature.apm.blik.impl.ui.apm_ext.BlikPendingPaymentExtension$BlikTransactionParcel;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreen;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step;
import com.revolut.feature.apm.blik.impl.ui.remediation_pending.RemediationPendingPromptScreen;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.BlikTermsAcceptanceFlow;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.BlikTermsAcceptanceFlowContract$InputData;
import com.revolut.feature.apm.core.models.blik.BlikEligibilityTerms;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Blik;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import d12.b;
import dki.g;
import fmc.z;
import fnc.s;
import gim.i;
import hrf.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import os9.t;
import tak.d;
import til.m;
import v02.c;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements ou1.a {
    public final d A;
    public final gte.a B;
    public final b C;
    public final c D;
    public final BlikFlowContract$Step E;
    public final EmptyFlowState F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ju1.a f61681t;
    public final m u;
    public final s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f61682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wj0.a f61683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BlikFlowDestination.InputData f61684y;
    public final eu1.a z;

    public a(ju1.a codeUsageObserver, m workflowFlowProvider, s newContactNavigationProvider, z recipientListNavigationProvider, wj0.a idempotencyKeyHolder, BlikFlowDestination.InputData inputData, eu1.a blikInteractor, d pendingPaymentExtension, gte.a featureToggleInteractor, b entryExtension, c aliasDialogProvider) {
        Intrinsics.checkNotNullParameter(codeUsageObserver, "codeUsageObserver");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        Intrinsics.checkNotNullParameter(aliasDialogProvider, "aliasDialogProvider");
        this.f61681t = codeUsageObserver;
        this.u = workflowFlowProvider;
        this.v = newContactNavigationProvider;
        this.f61682w = recipientListNavigationProvider;
        this.f61683x = idempotencyKeyHolder;
        this.f61684y = inputData;
        this.z = blikInteractor;
        this.A = pendingPaymentExtension;
        this.B = featureToggleInteractor;
        this.C = entryExtension;
        this.D = aliasDialogProvider;
        BlikFlowDestination.StartType startType = inputData.f61648a;
        boolean z = startType instanceof BlikFlowDestination.StartType.OpenBlikCode;
        BlikFlowContract$Step blikConfirmationStep = BlikFlowContract$Step.LoadingStep.f61674a;
        if (!z) {
            if (startType instanceof BlikFlowDestination.StartType.OpenBlikConfirmation) {
                blikConfirmationStep = new BlikFlowContract$Step.BlikConfirmationStep(((BlikFlowDestination.StartType.OpenBlikConfirmation) startType).f61651a);
            } else if (!(startType instanceof BlikFlowDestination.StartType.NewContact) && !(startType instanceof BlikFlowDestination.StartType.RecipientList)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.E = blikConfirmationStep;
        this.F = EmptyFlowState.f98428a;
    }

    public static final Object O2(a aVar, BlikFlowDestination.StartType startType, i iVar) {
        if (startType instanceof BlikFlowDestination.StartType.OpenBlikCode) {
            return new BlikFlowContract$Step.BlikCodeStep(((BlikFlowDestination.StartType.OpenBlikCode) startType).f61650a);
        }
        if (startType instanceof BlikFlowDestination.StartType.OpenBlikConfirmation) {
            return new BlikFlowContract$Step.BlikConfirmationStep(((BlikFlowDestination.StartType.OpenBlikConfirmation) startType).f61651a);
        }
        if (startType instanceof BlikFlowDestination.StartType.NewContact) {
            return aVar.Q2(BlikFlowContract$Step.NewContact.f61675a, iVar);
        }
        if (startType instanceof BlikFlowDestination.StartType.RecipientList) {
            return aVar.Q2(BlikFlowContract$Step.RecipientList.f61678a, iVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        this.f61683x.a("IDEMPOTENCY_TAG_REGISTER_ALIAS");
    }

    public final void P2(String str) {
        this.f61681t.D(Unit.f186387a);
        C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), null, null, null, 126))));
        I2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ou1.e
            if (r0 == 0) goto L13
            r0 = r7
            ou1.e r0 = (ou1.e) r0
            int r1 = r0.f229771x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229771x = r1
            goto L18
        L13:
            ou1.e r0 = new ou1.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229771x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step r6 = r0.u
            yhm.o.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f229771x = r3
            eu1.a r7 = r5.z
            eu1.h r7 = (eu1.h) r7
            xt1.d r7 = r7.f129469a
            xt1.c r2 = new xt1.c
            r3 = 0
            r4 = 0
            r2.<init>(r7, r3, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            java.util.List r7 = (java.util.List) r7
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L61
            com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step$P2PTerms r0 = new com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step$P2PTerms
            r0.<init>(r7, r6)
            return r0
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.blik.impl.ui.flow.a.Q2(com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step, gim.c):java.lang.Object");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BlikFlowContract$Step step = (BlikFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BlikFlowContract$Step.LoadingStep) {
            ViewController viewControllerE1 = e1(new d12.a(new d12.c(new TextLocalisedClause(R$string.blik_entry, null, null, 14)), this.C));
            ou1.b block = new ou1.b(this, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof BlikFlowContract$Step.TermsAcceptanceStep) {
            BlikTermsAcceptanceFlow blikTermsAcceptanceFlow = new BlikTermsAcceptanceFlow(new BlikTermsAcceptanceFlowContract$InputData(((BlikFlowContract$Step.TermsAcceptanceStep) step).f61680a));
            ou1.b block2 = new ou1.b(this, 0);
            Intrinsics.checkNotNullParameter(block2, "block");
            blikTermsAcceptanceFlow.H = block2;
            return blikTermsAcceptanceFlow;
        }
        if (step instanceof BlikFlowContract$Step.BlikCodeStep) {
            BlikCodeScreen blikCodeScreen = new BlikCodeScreen(new BlikCodeScreenContract$InputData(((BlikFlowContract$Step.BlikCodeStep) step).f61672a));
            ou1.b bVar = new ou1.b(this, 7);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            blikCodeScreen.H = bVar;
            return blikCodeScreen;
        }
        if (step instanceof BlikFlowContract$Step.BlikConfirmationStep) {
            String str = ((BlikFlowContract$Step.BlikConfirmationStep) step).f61673a;
            if (((jte.d) this.B).c(PendingPaymentsToggles$Blik.f102394c)) {
                ViewController viewControllerE12 = e1(new tak.a(new PendingPaymentContract$InputData.Apm(new BlikPendingPaymentExtension$BlikTransactionParcel(str), false, null, true), this.A));
                ou1.b block3 = new ou1.b(this, 2);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE12.H = block3;
                return viewControllerE12;
            }
            BlikConfirmationScreen blikConfirmationScreen = new BlikConfirmationScreen(new BlikConfirmationScreenContract$InputData(str));
            ou1.b bVar2 = new ou1.b(this, 3);
            Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
            blikConfirmationScreen.H = bVar2;
            return blikConfirmationScreen;
        }
        if (step instanceof BlikFlowContract$Step.RemediationPendingPrompt) {
            RemediationPendingPromptScreen remediationPendingPromptScreen = new RemediationPendingPromptScreen();
            ou1.b block4 = new ou1.b(this, 4);
            Intrinsics.checkNotNullParameter(block4, "block");
            remediationPendingPromptScreen.H = block4;
            return remediationPendingPromptScreen;
        }
        if (step instanceof BlikFlowContract$Step.NewContact) {
            ViewController viewControllerE13 = e1(this.v.h(null));
            ou1.b block5 = new ou1.b(this, 5);
            Intrinsics.checkNotNullParameter(block5, "block");
            viewControllerE13.H = block5;
            return viewControllerE13;
        }
        if (step instanceof BlikFlowContract$Step.RecipientList) {
            ViewController viewControllerE14 = e1(this.f61682w.g(f.OUTGOING));
            ou1.b block6 = new ou1.b(this, 6);
            Intrinsics.checkNotNullParameter(block6, "block");
            viewControllerE14.H = block6;
            return viewControllerE14;
        }
        if (!(step instanceof BlikFlowContract$Step.P2PTerms)) {
            throw new NoWhenBranchMatchedException();
        }
        BlikFlowContract$Step.P2PTerms p2PTerms = (BlikFlowContract$Step.P2PTerms) step;
        List list = p2PTerms.f61676a;
        BlikFlowContract$Step blikFlowContract$Step = p2PTerms.f61677b;
        List<BlikEligibilityTerms> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (BlikEligibilityTerms blikEligibilityTerms : list2) {
            arrayList.add(new ApmOnboardingStatusTerms(blikEligibilityTerms.f61929a, blikEligibilityTerms.f61930b, blikEligibilityTerms.f61931c));
        }
        ViewController viewControllerE15 = e1(new j0(new ApmRegistrationTermsScope$InputData(arrayList)));
        t block7 = new t(this, blikFlowContract$Step, 2);
        Intrinsics.checkNotNullParameter(block7, "block");
        viewControllerE15.H = block7;
        return viewControllerE15;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.F;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.E;
    }
}
