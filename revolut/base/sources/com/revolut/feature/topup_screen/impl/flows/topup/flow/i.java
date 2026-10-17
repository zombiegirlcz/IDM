package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.retail.common.ui.R$string;
import cu8.r0;
import fmc.z;
import io3.l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.o3;
import nii.y0;
import oe6.k;
import org.jetbrains.annotations.NotNull;
import un8.j;
import uwi.v;
import uye.m;
import uye.w;
import uye.y;
import wsg.n;
import xg6.x;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements uye.f {

    @NotNull
    public static final m Companion = new m();
    public final fk3.a A;
    public final f8a.a B;
    public final zu1.a C;
    public final x8k.c D;
    public final n E;
    public final uve.c F;
    public final eye.f G;
    public final eye.c H;
    public final kwe.b I;
    public final zte.b J;
    public final c1f.c K;
    public final wj0.a L;
    public final rye.e M;
    public final uye.d N;
    public final owe.d O;
    public final d1f.a P;
    public final owe.c Q;
    public final gye.h R;
    public final oe6.a S;
    public final z T;
    public final xye.d U;
    public final xye.a V;
    public final xye.c W;
    public final aue.d X;
    public final com.revolut.feature.topup_screen.api.topup_limits.a Y;
    public final jvh.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final til.m f90941a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final uye.a f90942b0;
    public final l2j.a c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final s99.i f90943d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final rea.m f90944e0;
    public final rfb.b f0;
    public final sye.a g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final je6.e f90945h0;
    public final yki.a i0;
    public final uye.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f90946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f90947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u0f.a f90948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h f90949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uye.c f90950t;
    public final uye.b u;
    public final u51.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f90951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f90952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final rve.i f90953y;
    public final wve.a z;

    public i(uye.g inputData, r0 kycRequiredActionTransformer, gte.a featureToggleInteractor, u0f.a topUpResultStateModifier, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h methodMapper, uye.c selectedMethodRelay, uye.b cardDetailsTransmitter, u51.a topupMethodsInteractor, x mandateInteractor, k mandateProposalInteractor, rve.i storedMethodInteractor, wve.a japanInboundOpenBankingInteractor, fk3.a configurationInteractor, f8a.a pixAreaInteractor, zu1.a brebInteractor, x8k.c transferInteractor, n walletInteractor, uve.c freelancerTopUpInteractor, eye.f topupCurrencyPocketCommandProvider, eye.c openBankingTopUpCommandProvider, kwe.b moveMoneyTargetPocketMapper, zte.b cardPaymentsTopUpDialogs, c1f.c openBankingTopUpDialogs, wj0.a idempotencyKeyHolder, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, rye.e walletLimitExceededErrorProvider, uye.d topUpFlowBottomSheetResultRelay, owe.d japaneseRestrictionDialogProvider, d1f.a japanEasyBankRelinkDialogProvider, owe.c cashDepositWarningDialogProvider, gye.h zeroFeeWithInfoDialogProvider, oe6.a externalInstitutionsInteractor, z newCardDataMethodMapper, xye.d topUpLimitsControllerInputFactory, xye.a pixLimitsBottomSheetInputFactory, xye.c nzAkahuLimitsBottomSheetInputFactory, aue.d topUpLimitUiModelMapper, com.revolut.feature.topup_screen.api.topup_limits.a topUpV2LimitUiModelMapper, jvh.a workflowInteractor, til.m workflowFlowProvider, uye.a amountSelectedCurrencyRelay, l2j.a currencyChooserFlowFactory, s99.i exchangeGlobalAccessInteractor, rea.m pocketDetailsInteractor, rfb.b salaryAccountFeatureChecker, sye.a beDrivenFeeInputModelMapper, je6.e brazilPixMandateStatusDialogConfigFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(topUpResultStateModifier, "topUpResultStateModifier");
        Intrinsics.checkNotNullParameter(methodMapper, "methodMapper");
        Intrinsics.checkNotNullParameter(selectedMethodRelay, "selectedMethodRelay");
        Intrinsics.checkNotNullParameter(cardDetailsTransmitter, "cardDetailsTransmitter");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(mandateProposalInteractor, "mandateProposalInteractor");
        Intrinsics.checkNotNullParameter(storedMethodInteractor, "storedMethodInteractor");
        Intrinsics.checkNotNullParameter(japanInboundOpenBankingInteractor, "japanInboundOpenBankingInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerTopUpInteractor, "freelancerTopUpInteractor");
        Intrinsics.checkNotNullParameter(topupCurrencyPocketCommandProvider, "topupCurrencyPocketCommandProvider");
        Intrinsics.checkNotNullParameter(openBankingTopUpCommandProvider, "openBankingTopUpCommandProvider");
        Intrinsics.checkNotNullParameter(moveMoneyTargetPocketMapper, "moveMoneyTargetPocketMapper");
        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
        Intrinsics.checkNotNullParameter(openBankingTopUpDialogs, "openBankingTopUpDialogs");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(walletLimitExceededErrorProvider, "walletLimitExceededErrorProvider");
        Intrinsics.checkNotNullParameter(topUpFlowBottomSheetResultRelay, "topUpFlowBottomSheetResultRelay");
        Intrinsics.checkNotNullParameter(japaneseRestrictionDialogProvider, "japaneseRestrictionDialogProvider");
        Intrinsics.checkNotNullParameter(japanEasyBankRelinkDialogProvider, "japanEasyBankRelinkDialogProvider");
        Intrinsics.checkNotNullParameter(cashDepositWarningDialogProvider, "cashDepositWarningDialogProvider");
        Intrinsics.checkNotNullParameter(zeroFeeWithInfoDialogProvider, "zeroFeeWithInfoDialogProvider");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(newCardDataMethodMapper, "newCardDataMethodMapper");
        Intrinsics.checkNotNullParameter(topUpLimitsControllerInputFactory, "topUpLimitsControllerInputFactory");
        Intrinsics.checkNotNullParameter(pixLimitsBottomSheetInputFactory, "pixLimitsBottomSheetInputFactory");
        Intrinsics.checkNotNullParameter(nzAkahuLimitsBottomSheetInputFactory, "nzAkahuLimitsBottomSheetInputFactory");
        Intrinsics.checkNotNullParameter(topUpLimitUiModelMapper, "topUpLimitUiModelMapper");
        Intrinsics.checkNotNullParameter(topUpV2LimitUiModelMapper, "topUpV2LimitUiModelMapper");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(amountSelectedCurrencyRelay, "amountSelectedCurrencyRelay");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        Intrinsics.checkNotNullParameter(beDrivenFeeInputModelMapper, "beDrivenFeeInputModelMapper");
        Intrinsics.checkNotNullParameter(brazilPixMandateStatusDialogConfigFactory, "brazilPixMandateStatusDialogConfigFactory");
        this.o = inputData;
        this.f90946p = kycRequiredActionTransformer;
        this.f90947q = featureToggleInteractor;
        this.f90948r = topUpResultStateModifier;
        this.f90949s = methodMapper;
        this.f90950t = selectedMethodRelay;
        this.u = cardDetailsTransmitter;
        this.v = topupMethodsInteractor;
        this.f90951w = mandateInteractor;
        this.f90952x = mandateProposalInteractor;
        this.f90953y = storedMethodInteractor;
        this.z = japanInboundOpenBankingInteractor;
        this.A = configurationInteractor;
        this.B = pixAreaInteractor;
        this.C = brebInteractor;
        this.D = transferInteractor;
        this.E = walletInteractor;
        this.F = freelancerTopUpInteractor;
        this.G = topupCurrencyPocketCommandProvider;
        this.H = openBankingTopUpCommandProvider;
        this.I = moveMoneyTargetPocketMapper;
        this.J = cardPaymentsTopUpDialogs;
        this.K = openBankingTopUpDialogs;
        this.L = idempotencyKeyHolder;
        this.M = walletLimitExceededErrorProvider;
        this.N = topUpFlowBottomSheetResultRelay;
        this.O = japaneseRestrictionDialogProvider;
        this.P = japanEasyBankRelinkDialogProvider;
        this.Q = cashDepositWarningDialogProvider;
        this.R = zeroFeeWithInfoDialogProvider;
        this.S = externalInstitutionsInteractor;
        this.T = newCardDataMethodMapper;
        this.U = topUpLimitsControllerInputFactory;
        this.V = pixLimitsBottomSheetInputFactory;
        this.W = nzAkahuLimitsBottomSheetInputFactory;
        this.X = topUpLimitUiModelMapper;
        this.Y = topUpV2LimitUiModelMapper;
        this.Z = workflowInteractor;
        this.f90941a0 = workflowFlowProvider;
        this.f90942b0 = amountSelectedCurrencyRelay;
        this.c0 = currencyChooserFlowFactory;
        this.f90943d0 = exchangeGlobalAccessInteractor;
        this.f90944e0 = pocketDetailsInteractor;
        this.f0 = salaryAccountFeatureChecker;
        this.g0 = beDrivenFeeInputModelMapper;
        this.f90945h0 = brazilPixMandateStatusDialogConfigFactory;
        umd.n nVar = new umd.n(this, 21);
        this.i0 = cp5.d.a(this, TopupFlowContract$Step.Amount.f90829a, f0.f322471a, nVar);
    }

    public static final void I2(i iVar, xi0.b bVar) {
        iVar.l2(new w(iVar, bVar, null, 1), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r9 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.flows.topup.flow.i r7, xi0.b r8, gim.c r9) {
        /*
            uye.g r0 = r7.o
            boolean r1 = r9 instanceof uye.z
            if (r1 == 0) goto L15
            r1 = r9
            uye.z r1 = (uye.z) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.z = r2
            goto L1a
        L15:
            uye.z r1 = new uye.z
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f284332x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.z
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L43
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            yhm.o.b(r9)
            goto L97
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.revolut.core.model.account.AccountId r8 = r1.f284331w
            io3.l r0 = r1.v
            xi0.b r3 = r1.u
            yhm.o.b(r9)
            r6 = r0
            r0 = r8
            r8 = r3
            r3 = r6
            goto L66
        L43:
            yhm.o.b(r9)
            com.revolut.feature.topup_screen.common.TopUpTarget r9 = r0.f284275a
            io3.l r9 = e1f.c.b(r9)
            com.revolut.feature.topup_screen.common.TopUpTarget r0 = r0.f284275a
            com.revolut.core.model.account.AccountId r0 = e1f.c.a(r0)
            s99.i r3 = r7.f90943d0
            r1.u = r8
            r1.v = r9
            r1.f284331w = r0
            r1.z = r5
            java.lang.Object r3 = r3.b(r1)
            if (r3 != r2) goto L63
            goto L96
        L63:
            r6 = r3
            r3 = r9
            r9 = r6
        L66:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r9 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r9
            boolean r5 = r9 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r5 == 0) goto L7d
            yki.a r7 = r7.i0
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$ExchangeGlobalAccess r0 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$ExchangeGlobalAccess
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r9 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r9
            bla.c r9 = r9.f78169a
            r0.<init>(r8, r9)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r8 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r7, r0, r8)
            goto L9e
        L7d:
            boolean r9 = r9 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch
            if (r9 == 0) goto La1
            rea.m r9 = r7.f90944e0
            ufm.i r8 = r9.g(r0, r3, r8)
            r9 = 0
            r1.u = r9
            r1.v = r9
            r1.f284331w = r9
            r1.z = r4
            java.lang.Object r9 = nim.a.b(r8, r1)
            if (r9 != r2) goto L97
        L96:
            return r2
        L97:
            eda.e r9 = (eda.e) r9
            io3.d r8 = r9.f124961a
            r7.S2(r8)
        L9e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La1:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.J2(com.revolut.feature.topup_screen.impl.flows.topup.flow.i, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c3, code lost:
    
        if (r0.e3(r11, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02f1, code lost:
    
        if (r0.d3(r11, com.revolut.domain.models.topup.mcy.McyTopUpMethod.BankTransfer.f60433a, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03eb, code lost:
    
        if (r20.f3(r11, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03fb, code lost:
    
        if (r0.a3(r11, r3, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044e, code lost:
    
        if (r2 == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (r0.X2(r1, r11, r3, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r0.Y2(r11, r6, r1) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        if (r0.d3(r11, r1, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (r0.d3(r11, r1, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        if (r0.Z2(r11, r6, r1) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        if (r0.U2(r1, r11, r3, r6) == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ae, code lost:
    
        if (r0.W2(r1, r11, r3, r4, r6) == r7) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.topup_screen.impl.flows.topup.flow.i r20, kye.a0 r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.K2(com.revolut.feature.topup_screen.impl.flows.topup.flow.i, kye.a0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.f90948r.f276169a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(com.revolut.feature.topup_screen.api.model.StoredMethod r6, dj0.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof uye.o
            if (r0 == 0) goto L13
            r0 = r8
            uye.o r0 = (uye.o) r0
            int r1 = r0.f284313y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284313y = r1
            goto L18
        L13:
            uye.o r0 = new uye.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f284311w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284313y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dj0.d r7 = r0.v
            com.revolut.feature.topup_screen.api.model.StoredMethod r6 = r0.u
            yhm.o.b(r8)
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            fk3.a r2 = r5.A
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r8 = r2.l(r4, r8)
            utk.b r2 = new utk.b
            r4 = 26
            r2.<init>(r4)
            r4 = 0
            efm.r r8 = m70.a.g(r8, r4, r2, r3)
            r0.u = r6
            r0.v = r7
            r0.f284313y = r3
            java.lang.Object r8 = nim.a.c(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            e7l.f r8 = (e7l.f) r8
            java.lang.Boolean r0 = r6.e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L84
            com.revolut.feature.topup_screen.api.model.StoredMethod$Institution r6 = r6.f90529a
            java.lang.String r6 = r6.f90538a
            oe6.k r0 = r5.f90952x
            en6.s r0 = (en6.s) r0
            boolean r6 = r0.a(r6)
            if (r6 == 0) goto L84
            dj0.d r6 = r8.O0
            r0 = 2
            dj0.d r6 = pyd.c.k(r6, r0)
            boolean r6 = r7.i(r6)
            if (r6 == 0) goto L84
            goto L85
        L84:
            r3 = 0
        L85:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.L2(com.revolut.feature.topup_screen.api.model.StoredMethod, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(com.revolut.feature.topup_screen.api.model.StoredMethod r12, dj0.d r13, com.revolut.feature.topup_screen.common.TopUpTarget r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof uye.p
            if (r0 == 0) goto L13
            r0 = r15
            uye.p r0 = (uye.p) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            uye.p r0 = new uye.p
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f284315x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            yki.a r5 = r11.i0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature.topup_screen.common.TopUpTarget r14 = r0.f284314w
            dj0.d r13 = r0.v
            com.revolut.feature.topup_screen.api.model.StoredMethod r12 = r0.u
            yhm.o.b(r15)
            goto L69
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            yhm.o.b(r15)
            com.revolut.feature.topup_screen.api.model.StoredMethod$Mandate r15 = r12.f
            if (r15 == 0) goto L5a
            java.lang.String r12 = r15.getF90547a()
            com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData r14 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData
            uye.g r15 = r11.o
            com.revolut.feature.topup_screen.common.TopUpTarget r15 = r15.f284275a
            com.revolut.domain.models.topup.TopUpContext r15 = e1f.c.d(r15)
            r14.<init>(r13, r12, r15)
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$MandateTopup r12 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$MandateTopup
            r12.<init>(r14)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r13 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            oki.h.w2(r5, r12, r13)
            goto Lc3
        L5a:
            r0.u = r12
            r0.v = r13
            r0.f284314w = r14
            r0.z = r3
            java.lang.Object r15 = r11.L2(r12, r13, r0)
            if (r15 != r1) goto L69
            return r1
        L69:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto La0
            com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet r15 = com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet.f72205c
            gte.a r0 = r11.f90947q
            jte.d r0 = (jte.d) r0
            boolean r15 = r0.c(r15)
            if (r15 == 0) goto L80
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r15 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            goto L82
        L80:
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r15 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
        L82:
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$CreateMandate r0 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$CreateMandate
            com.revolut.feature.topup_screen.api.model.StoredMethod$Institution r1 = r12.f90529a
            java.lang.String r1 = r1.f90538a
            com.revolut.feature.topup_screen.api.model.StoredMethod$AccountDetails r2 = r12.f90530b
            java.lang.String r2 = r2.f90532a
            com.revolut.domain.models.topup.TopUpContext r14 = e1f.c.d(r14)
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r3 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData
            r3.<init>(r2, r1, r13, r14)
            com.revolut.feature.topup_screen.api.model.StoredMethod$Institution r12 = r12.f90529a
            io3.o r12 = r12.d
            r0.<init>(r1, r3, r12)
            oki.h.w2(r5, r0, r15)
            goto Lc3
        La0:
            com.revolut.feature.topup_screen.api.model.StoredMethod$Institution r15 = r12.f90529a
            java.lang.String r15 = r15.f90538a
            com.revolut.feature.topup_screen.api.model.StoredMethod$AccountDetails r0 = r12.f90530b
            java.lang.String r0 = r0.f90532a
            com.revolut.domain.models.topup.TopUpContext r14 = e1f.c.d(r14)
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r1 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData
            r1.<init>(r0, r15, r13, r14)
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$StoredMethodTopUp r6 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$StoredMethodTopUp
            com.revolut.feature.topup_screen.api.model.StoredMethod$Institution r12 = r12.f90529a
            io3.o r12 = r12.d
            r6.<init>(r1, r12)
            r9 = 0
            r10 = 12
            r7 = 1
            r8 = 0
            r4 = r11
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
        Lc3:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.M2(com.revolut.feature.topup_screen.api.model.StoredMethod, dj0.d, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    public final void N2(CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData preselectedInstitutionData) {
        com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar = this.f90949s;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(preselectedInstitutionData, "preselectedInstitutionData");
        this.f90950t.a(new o3(new vye.e(new TextClause(preselectedInstitutionData.getF72258b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(preselectedInstitutionData.getF72258b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((di6.a) hVar.f90933a).d(preselectedInstitutionData.getF72259c()), preselectedInstitutionData), preselectedInstitutionData.getD().f306286a, true));
        v vVar = new v(25);
        yki.a aVar = this.i0;
        if (oki.h.E2(aVar, vVar)) {
            aVar.e(false);
        }
    }

    public final boolean O2() {
        pte.a aVar = this.o.f284276b;
        return aVar == pte.a.REVOLUT_PAY || aVar == pte.a.NESTED_TOP_UP;
    }

    public final void P2(xi0.b bVar) {
        l2(new w(this, bVar, null, 0), new yi5.b(26));
    }

    public final void Q2(xi0.b bVar) {
        if (e1f.c.b(this.o.f284275a) != l.MERCHANT) {
            l2(new w(this, bVar, null, 2), new yi5.b(26));
            return;
        }
        String currencyCode = bVar.f306286a;
        uye.a aVar = this.f90942b0;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        aVar.f284255a.k(currencyCode);
    }

    public final void R2(Throwable th10, xi0.b bVar) {
        y0 y0VarB = ((c1f.a) this.J).b(th10);
        if (y0VarB == null) {
            l1().M0(new aii.i(th10, (aii.a) null, 6));
        } else {
            yji.l.a1(this, X1(y0VarB), null, null, new y(this, bVar, null, 0), 3);
        }
    }

    public final void S2(io3.d dVar) {
        C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, e1f.c.a(this.o.f284275a), false, true, (wi0.b) null, false, true, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4016)));
    }

    public final void T2(String str) {
        C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U2(java.lang.String r8, dj0.d r9, com.revolut.feature.topup_screen.common.TopUpTarget r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof uye.a0
            if (r0 == 0) goto L14
            r0 = r11
            uye.a0 r0 = (uye.a0) r0
            int r1 = r0.f284257x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f284257x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            uye.a0 r0 = new uye.a0
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f284257x
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            dj0.d r9 = r6.u
            yhm.o.b(r11)
            r3 = r9
            goto L4c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r11)
            com.revolut.domain.models.topup.TopUpContext r5 = e1f.c.d(r10)
            r6.u = r9
            r6.f284257x = r2
            rve.i r1 = r7.f90953y
            r4 = 0
            r3 = r8
            r2 = r9
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            r3 = r2
        L4c:
            int r4 = com.revolut.feature.topup_screen.impl.R$string.open_banking_topup_submitted_toast_title
            dp4.y0 r1 = new dp4.y0
            r6 = 16
            r5 = 0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            yi5.b r8 = new yi5.b
            r9 = 26
            r8.<init>(r9)
            r7.l2(r1, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.U2(java.lang.String, dj0.d, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    public final void V2(SelectedMethod.StoredMethod.Card card, dj0.d dVar) {
        CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = card.f90908j;
        String str = card.f90903a;
        uye.g gVar = this.o;
        yki.a aVar = this.i0;
        if (cardDetailsScreenDescriptor$OutputData$CardData != null) {
            oki.h.t2(this, aVar, new TopupFlowContract$Step.TopupWithNewCard(new TopupWithNewCardFlowDescriptor$InputData(cardDetailsScreenDescriptor$OutputData$CardData.f90484a, cardDetailsScreenDescriptor$OutputData$CardData.f90485b, cardDetailsScreenDescriptor$OutputData$CardData.f90486c, dVar, gVar.f284275a, cardDetailsScreenDescriptor$OutputData$CardData.d, cardDetailsScreenDescriptor$OutputData$CardData.f, (Boolean) null, 288), dVar), true, null, false, 12);
        } else if (card.f90906g) {
            oki.h.t2(this, aVar, new TopupFlowContract$Step.ExpiredCardDetails(str), true, null, false, 12);
        } else {
            oki.h.t2(this, aVar, new TopupFlowContract$Step.CardTopup(new FacadeCardTopupFlowDescriptor$InputData(new CardTopUpType.RegularTopUp(dVar), str, gVar.f284275a, null)), true, null, false, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(java.lang.String r17, dj0.d r18, com.revolut.feature.topup_screen.common.TopUpTarget r19, java.lang.String r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.W2(java.lang.String, dj0.d, com.revolut.feature.topup_screen.common.TopUpTarget, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (M2(r10, r8, r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X2(java.lang.String r7, dj0.d r8, com.revolut.feature.topup_screen.common.TopUpTarget r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof uye.d0
            if (r0 == 0) goto L13
            r0 = r10
            uye.d0 r0 = (uye.d0) r0
            int r1 = r0.f284268y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284268y = r1
            goto L18
        L13:
            uye.d0 r0 = new uye.d0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f284266w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284268y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto L71
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.feature.topup_screen.common.TopUpTarget r9 = r0.v
            dj0.d r8 = r0.u
            yhm.o.b(r10)
            goto L60
        L3b:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            r0.f284268y = r4
            w4l.h r10 = w4l.h.f294642c
            u51.a r2 = r6.v
            e0f.r1 r2 = (e0f.r1) r2
            vkm.d r7 = r2.h(r7, r5, r10)
            utk.b r10 = new utk.b
            r2 = 25
            r10.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r5, r10, r4)
            java.lang.Object r10 = vkm.q.z(r7, r0)
            if (r10 != r1) goto L60
            goto L70
        L60:
            com.revolut.feature.topup_screen.api.model.StoredMethod r10 = (com.revolut.feature.topup_screen.api.model.StoredMethod) r10
            if (r10 == 0) goto L74
            r0.u = r5
            r0.v = r5
            r0.f284268y = r3
            java.lang.Object r7 = r6.M2(r10, r8, r9, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L74:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Details not received while trying to payWithOpenBankingStoredMethod"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.X2(java.lang.String, dj0.d, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (c3(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y2(dj0.d r6, gim.c r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uye.e0
            if (r0 == 0) goto L13
            r0 = r7
            uye.e0 r0 = (uye.e0) r0
            int r1 = r0.f284272x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284272x = r1
            goto L18
        L13:
            uye.e0 r0 = new uye.e0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284272x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            dj0.d r6 = r0.u
            yhm.o.b(r7)
            goto L50
        L38:
            yhm.o.b(r7)
            if (r8 == 0) goto L68
            oe6.a r7 = r5.S
            xg6.j r7 = (xg6.j) r7
            pfm.r r7 = r7.k(r6, r8)
            r0.u = r6
            r0.f284272x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L50
            goto L64
        L50:
            wsg.n r7 = r5.E
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r7.k0(r8)
            xi0.b r6 = r6.f115083b
            r7 = 0
            r0.u = r7
            r0.f284272x = r3
            java.lang.Object r6 = r5.c3(r6, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.Y2(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(dj0.d r10, gim.c r11, java.lang.String r12) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof uye.f0
            if (r0 == 0) goto L13
            r0 = r11
            uye.f0 r0 = (uye.f0) r0
            int r1 = r0.f284274x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284274x = r1
            goto L18
        L13:
            uye.f0 r0 = new uye.f0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284274x
            r7 = 0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            dj0.d r10 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2b
        L29:
            r5 = r10
            goto L4b
        L2b:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto L65
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            yhm.o.b(r11)
            xg6.x r11 = r9.f90951w     // Catch: java.lang.Throwable -> L62
            pfm.r r11 = r11.f(r10, r12, r3)     // Catch: java.lang.Throwable -> L62
            r0.u = r10     // Catch: java.lang.Throwable -> L62
            r0.f284274x = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r11 = nim.a.a(r11, r0)     // Catch: java.lang.Throwable -> L62
            if (r11 != r1) goto L29
            return r1
        L4b:
            int r6 = com.revolut.feature.topup_screen.impl.R$string.topup_pix_smart_transfer_success_sheet_title     // Catch: java.lang.Throwable -> L62
            dp4.y0 r3 = new dp4.y0     // Catch: java.lang.Throwable -> L62
            r8 = 16
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L60
            yi5.b r10 = new yi5.b     // Catch: java.lang.Throwable -> L60
            r11 = 26
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L60
            r9.l2(r3, r10)     // Catch: java.lang.Throwable -> L60
            goto L91
        L60:
            r0 = move-exception
            goto L64
        L62:
            r0 = move-exception
            r4 = r9
        L64:
            r10 = r0
        L65:
            je6.e r11 = r4.f90945h0
            ug6.b r11 = (ug6.b) r11
            je6.d r11 = r11.a(r10)
            boolean r12 = r11 instanceof je6.b
            if (r12 == 0) goto L80
            nii.y0 r10 = new nii.y0
            je6.b r11 = (je6.b) r11
            nii.z r11 = r11.f173231a
            r12 = 0
            r0 = 5
            r10.<init>(r7, r11, r12, r0)
            r9.X1(r10)
            goto L91
        L80:
            boolean r11 = r11 instanceof je6.c
            if (r11 == 0) goto L94
            aii.o r11 = r9.l1()
            aii.i r12 = new aii.i
            r0 = 6
            r12.<init>(r10, r7, r0)
            r11.M0(r12)
        L91:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L94:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.Z2(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a3(dj0.d r13, com.revolut.feature.topup_screen.common.TopUpTarget r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof uye.g0
            if (r0 == 0) goto L13
            r0 = r15
            uye.g0 r0 = (uye.g0) r0
            int r1 = r0.f284279x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284279x = r1
            goto L18
        L13:
            uye.g0 r0 = new uye.g0
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284279x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r13 = r0.u
            yhm.o.b(r15)
            goto L52
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r15)
            xi0.b r5 = r13.f115083b
            io3.l r6 = e1f.c.b(r14)
            com.revolut.core.model.account.AccountId r8 = e1f.c.a(r14)
            r9 = 28
            wsg.n r4 = r12.E
            r7 = 0
            efm.d0 r14 = osg.b.r(r4, r5, r6, r7, r8, r9)
            r0.u = r13
            r0.f284279x = r3
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L52
            return r1
        L52:
            io3.d r15 = (io3.d) r15
            java.lang.String r14 = r15.f163145a
            uye.g r15 = r12.o
            pte.a r0 = r15.f284276b
            com.revolut.feature.topup_screen.common.TopUpTarget r15 = r15.f284275a
            yte.n r0 = pw5.a.K(r0, r15)
            kwe.b r1 = r12.I
            r1.getClass()
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r4 = kwe.b.a(r14, r0, r15)
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$MoveMoney r14 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$MoveMoney
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r15 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoneyWithAccountPair r2 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoneyWithAccountPair
            long r0 = r13.f115082a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            k8l.a r6 = k8l.a.ADD
            r7 = 48
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$FiatAccountsAll r3 = com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.FiatAccountsAll.f104847a
            r2.<init>(r3, r4, r5, r6, r7)
            r13 = 0
            r0 = 4
            r15.<init>(r2, r13, r0)
            r14.<init>(r15)
            r10 = 0
            r11 = 12
            yki.a r6 = r12.i0
            r8 = 1
            r9 = 0
            r5 = r12
            r7 = r14
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.a3(dj0.d, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    public final void b3() {
        X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(xi0.b r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof uye.h0
            if (r3 == 0) goto L19
            r3 = r2
            uye.h0 r3 = (uye.h0) r3
            int r4 = r3.f284283x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f284283x = r4
            goto L1e
        L19:
            uye.h0 r3 = new uye.h0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f284283x
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            xi0.b r1 = r3.u
            yhm.o.b(r2)
            goto L5f
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$TopUpCurrencyChooserImprovements r2 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c
            gte.a r5 = r0.f90947q
            jte.d r5 = (jte.d) r5
            boolean r2 = r5.c(r2)
            if (r2 == 0) goto L5f
            uye.g r2 = r0.o
            com.revolut.feature.topup_screen.common.TopUpTarget r2 = r2.f284275a
            com.revolut.core.model.account.AccountId r2 = e1f.c.a(r2)
            wsg.n r5 = r0.E
            pfm.r r2 = r5.n0(r1, r2)
            r3.u = r1
            r3.f284283x = r6
            java.lang.Object r2 = nim.a.a(r2, r3)
            if (r2 != r4) goto L5f
            return r4
        L5f:
            nii.y0 r2 = new nii.y0
            nii.j0 r3 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.topup_screen.impl.R$string.top_up_pending_title
            r6 = 0
            r7 = 14
            r4.<init>(r5, r6, r6, r7)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.topup_screen.impl.R$string.topup_transaction_pending_generic_subtitle
            r5.<init>(r8, r6, r6, r7)
            r14 = 0
            r15 = 4092(0xffc, float:5.734E-42)
            r7 = r6
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r16 = r13
            r13 = 0
            r18 = r1
            r1 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r5 = 5
            r2.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r2 = r0.X1(r2)
            uye.y r3 = new uye.y
            r4 = 1
            r5 = r18
            r3.<init>(r0, r5, r1, r4)
            r4 = 3
            yji.l.b1(r0, r2, r1, r3, r4)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.c3(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(dj0.d r8, com.revolut.domain.models.topup.mcy.McyTopUpMethod r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof uye.j0
            if (r0 == 0) goto L13
            r0 = r10
            uye.j0 r0 = (uye.j0) r0
            int r1 = r0.f284292y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284292y = r1
            goto L18
        L13:
            uye.j0 r0 = new uye.j0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f284290w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284292y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.domain.models.topup.mcy.McyTopUpMethod r9 = r0.v
            dj0.d r8 = r0.u
            yhm.o.b(r10)
            goto L4b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            wsg.n r10 = r7.E
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r10 = r10.x(r2)
            r0.u = r8
            r0.v = r9
            r0.f284292y = r3
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L4b
            return r1
        L4b:
            xi0.b r10 = (xi0.b) r10
            com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$McyFlow r2 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step$McyFlow
            kotlin.jvm.internal.Intrinsics.h(r10)
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r0 = new com.revolut.feature.topup_screen.api.model.TopUpMethodsContext
            xi0.b r1 = r8.f115083b
            java.lang.String r1 = r1.f306286a
            uye.g r3 = r7.o
            pte.a r4 = r3.f284276b
            com.revolut.feature.topup_screen.common.TopUpTarget r3 = r3.f284275a
            yte.n r3 = pw5.a.K(r4, r3)
            r0.<init>(r1, r3)
            com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData$TopupSelectCountry r1 = new com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData$TopupSelectCountry
            r1.<init>(r0, r8, r10, r9)
            r2.<init>(r1)
            r5 = 0
            r6 = 14
            yki.a r1 = r7.i0
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.d3(dj0.d, com.revolut.domain.models.topup.mcy.McyTopUpMethod, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(dj0.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uye.k0
            if (r0 == 0) goto L13
            r0 = r6
            uye.k0 r0 = (uye.k0) r0
            int r1 = r0.f284297x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284297x = r1
            goto L18
        L13:
            uye.k0 r0 = new uye.k0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284297x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            zu1.a r6 = r4.C
            rv1.r r6 = (rv1.r) r6
            t38.e r6 = r6.c()
            r0.u = r5
            r0.f284297x = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            r0 = 0
            if (r6 == 0) goto L53
            java.lang.Object r6 = r6.getContent()
            av1.d r6 = (av1.d) r6
            goto L54
        L53:
            r6 = r0
        L54:
            if (r6 == 0) goto L58
            com.revolut.feature.apm.core.models.alias.Alias r0 = r6.f9873a
        L58:
            if (r0 != 0) goto L65
            com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination r5 = new com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination
            com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType$NewAlias r6 = com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType.NewAlias.f61700a
            r5.<init>(r6)
            r4.C1(r5)
            goto L74
        L65:
            com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination r1 = new com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination
            java.util.List r6 = r6.f9874b
            com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType$QrRequest r2 = new com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType$QrRequest
            r2.<init>(r0, r5, r6)
            r1.<init>(r2)
            r4.C1(r1)
        L74:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.e3(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(dj0.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof uye.l0
            if (r0 == 0) goto L13
            r0 = r9
            uye.l0 r0 = (uye.l0) r0
            int r1 = r0.f284302x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284302x = r1
            goto L18
        L13:
            uye.l0 r0 = new uye.l0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284302x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r8 = r0.u
            yhm.o.b(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            f8a.a r9 = r7.B
            t38.e r9 = f8a.a.a(r9)
            zfd.e r9 = zi0.c.w(r9)
            r0.u = r8
            r0.f284302x = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            r0 = 0
            if (r9 == 0) goto L53
            java.lang.Throwable r1 = r9.getError()
            goto L54
        L53:
            r1 = r0
        L54:
            if (r1 == 0) goto L5c
            r7.b3()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            goto Lbb
        L5c:
            if (r9 == 0) goto L6b
            java.lang.Object r1 = r9.getContent()
            com.revolut.feature.pix.api.model.PixKeys r1 = (com.revolut.feature.pix.api.model.PixKeys) r1
            if (r1 == 0) goto L6b
            com.revolut.feature.pix.api.model.PixKey r1 = r1.a()
            goto L6c
        L6b:
            r1 = r0
        L6c:
            r2 = 12
            if (r1 == 0) goto L9e
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r3 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.pix.api.navigation.PixQrNavigation$Destination r4 = new com.revolut.feature.pix.api.navigation.PixQrNavigation$Destination
            com.revolut.feature.pix.api.navigation.PixQrNavigation$InputData$Request r5 = new com.revolut.feature.pix.api.navigation.PixQrNavigation$InputData$Request
            java.lang.Object r9 = r9.getContent()
            com.revolut.feature.pix.api.model.PixKeys r9 = (com.revolut.feature.pix.api.model.PixKeys) r9
            if (r9 == 0) goto L85
            com.revolut.feature.pix.api.model.PixKey r9 = r9.a()
            goto L86
        L85:
            r9 = r0
        L86:
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r5.<init>(r6, r9, r8)
            r4.<init>(r5)
            yhi.b r8 = yhi.b.SOLID
            r3.<init>(r4, r8, r0, r2)
            r1.<init>(r3)
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r1)
            r7.C1(r8)
            goto Lbb
        L9e:
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.pix.api.navigation.PixAliasNavigation$Destination r4 = new com.revolut.feature.pix.api.navigation.PixAliasNavigation$Destination
            com.revolut.feature.pix.api.navigation.PixAliasNavigation$InputData$Registration r5 = new com.revolut.feature.pix.api.navigation.PixAliasNavigation$InputData$Registration
            r5.<init>(r0, r8, r3)
            r4.<init>(r5)
            yhi.b r8 = yhi.b.SOLID
            r1.<init>(r4, r8, r0, r2)
            r9.<init>(r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r9)
            r7.C1(r8)
        Lbb:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.flow.i.f3(dj0.d, gim.c):java.lang.Object");
    }

    public final void g3(Function1 function1) {
        l2(new j(this, function1, (Continuation) null), new uye.i(this, 6));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "Exception during top-up", null, throwable, h0Var);
        if (!(throwable instanceof IllegalStateException) && !(throwable instanceof IllegalArgumentException)) {
            return false;
        }
        b3();
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.i0;
    }
}
