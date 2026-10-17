package com.revolut.feature.security_hub.impl.ui.flow;

import ack.o;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import hg0.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import smd.s;
import wtc.g0;
import wtc.q0;
import wtc.u;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements huc.c {
    public final wt2.c A;
    public final tla.d B;
    public final wtc.k C;
    public final buc.g D;
    public final t E;
    public final gte.a F;
    public final w39.b G;
    public final tb4.t H;
    public final buc.d I;
    public final buc.h J;
    public final ptc.a K;
    public String L;
    public final List M;
    public final yki.a N;
    public final SecurityHubInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f85570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f85571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final huc.a f85572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wtc.h f85573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qka.c f85574t;
    public final s u;
    public final ufm.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g0 f85575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ang.f f85576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q0 f85577y;
    public final st2.e z;

    public m(SecurityHubInputData inputData, zja.a productArticleInteractor, u securityHubChecklistInteractor, huc.a securityHubDialogFactory, wtc.h linkedWalletsInteractor, qka.c productArticleNavigationProvider, s countryTransactionLimitsInteractor, ufm.d securityDelayInteractor, g0 streetModeInteractor, ang.f userInteractor, q0 userCountryInteractor, st2.e callSecurityPermissionBannerInteractor, wt2.c callSecurityProductArticleConfiguration, tla.d profileAppNavigationCommandsProvider, wtc.k outboundTransactionLimitsInteractor, buc.g transactionLimitsFlowTypeProvider, t streetModeProductArticleProvider, gte.a featureToggleInteractor, w39.b locationInteractor, tb4.t connectedWifiInteractor, buc.d streetModeWifiSuggestionControllerProvider, buc.h trustedWifiLocationErrorDialogProvider, ptc.a wealthProtectionInteractor) {
        List listL;
        FlowStep linkedWallets;
        FlowStep initial;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(securityHubChecklistInteractor, "securityHubChecklistInteractor");
        Intrinsics.checkNotNullParameter(securityHubDialogFactory, "securityHubDialogFactory");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(countryTransactionLimitsInteractor, "countryTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(securityDelayInteractor, "securityDelayInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        Intrinsics.checkNotNullParameter(callSecurityPermissionBannerInteractor, "callSecurityPermissionBannerInteractor");
        Intrinsics.checkNotNullParameter(callSecurityProductArticleConfiguration, "callSecurityProductArticleConfiguration");
        Intrinsics.checkNotNullParameter(profileAppNavigationCommandsProvider, "profileAppNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(outboundTransactionLimitsInteractor, "outboundTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(transactionLimitsFlowTypeProvider, "transactionLimitsFlowTypeProvider");
        Intrinsics.checkNotNullParameter(streetModeProductArticleProvider, "streetModeProductArticleProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(connectedWifiInteractor, "connectedWifiInteractor");
        Intrinsics.checkNotNullParameter(streetModeWifiSuggestionControllerProvider, "streetModeWifiSuggestionControllerProvider");
        Intrinsics.checkNotNullParameter(trustedWifiLocationErrorDialogProvider, "trustedWifiLocationErrorDialogProvider");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        this.o = inputData;
        this.f85570p = productArticleInteractor;
        this.f85571q = securityHubChecklistInteractor;
        this.f85572r = securityHubDialogFactory;
        this.f85573s = linkedWalletsInteractor;
        this.f85574t = productArticleNavigationProvider;
        this.u = countryTransactionLimitsInteractor;
        this.v = securityDelayInteractor;
        this.f85575w = streetModeInteractor;
        this.f85576x = userInteractor;
        this.f85577y = userCountryInteractor;
        this.z = callSecurityPermissionBannerInteractor;
        this.A = callSecurityProductArticleConfiguration;
        this.B = profileAppNavigationCommandsProvider;
        this.C = outboundTransactionLimitsInteractor;
        this.D = transactionLimitsFlowTypeProvider;
        this.E = streetModeProductArticleProvider;
        this.F = featureToggleInteractor;
        this.G = locationInteractor;
        this.H = connectedWifiInteractor;
        this.I = streetModeWifiSuggestionControllerProvider;
        this.J = trustedWifiLocationErrorDialogProvider;
        this.K = wealthProtectionInteractor;
        SecurityHubStartScreen securityHubStartScreen = inputData.f85462a;
        if (Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.WealthProtection.f85392a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.GamblingBlock.f85374a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.ManageMerchants.f85383a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.LinkedWallets.f85379a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.TransactionsLimits.f85391a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.LearnAboutSecurity.f85376a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.CardSecurity.f85373a) || Intrinsics.f(securityHubStartScreen, SecurityHubStartScreen.HiddenAccountsAndTransactions.f85375a) || (securityHubStartScreen instanceof SecurityHubStartScreen.Payees)) {
            listL = v.l(!inputData.d ? new BackStackEntry(new SecurityHubFlowContract$Step.SecurityHub(false), TransitionAnimation.SLIDE_END_TO_START.f98395a) : null);
        } else {
            listL = f0.f322471a;
        }
        this.M = listL;
        SecurityHubStartScreen securityHubStartScreen2 = inputData.f85462a;
        if (securityHubStartScreen2 instanceof SecurityHubStartScreen.WealthProtection) {
            linkedWallets = new SecurityHubFlowContract$Step.Initial(SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main.f85523a);
        } else {
            if (securityHubStartScreen2 instanceof SecurityHubStartScreen.WealthProtectionChangeLimit) {
                SecurityHubStartScreen.WealthProtectionChangeLimit wealthProtectionChangeLimit = (SecurityHubStartScreen.WealthProtectionChangeLimit) securityHubStartScreen2;
                initial = new SecurityHubFlowContract$Step.Initial(new SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.ChangeLimit(wealthProtectionChangeLimit.f85393a, wealthProtectionChangeLimit.f85394b));
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.GamblingBlock) {
                linkedWallets = SecurityHubFlowContract$Step.GamblingBlock.f85512a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.ManageMerchants) {
                linkedWallets = SecurityHubFlowContract$Step.ManageMerchants.f85533a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LostDevice) {
                linkedWallets = SecurityHubFlowContract$Step.LostDevice.f85532a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.TransactionsDayNightLimitsWithoutSecurityHub) {
                linkedWallets = SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.TransactionsLimits) {
                linkedWallets = new SecurityHubFlowContract$Step.Initial(SecurityHubFlowContract$Step.Initial.Destination.Limits.f85520a);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.SecureAccount) {
                linkedWallets = SecurityHubFlowContract$Step.SecureAccount.f85539a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.SignInMethods) {
                linkedWallets = SecurityHubFlowContract$Step.SignInMethods.f85541a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.CardSecurity) {
                linkedWallets = SecurityHubFlowContract$Step.CardSecurity.f85511a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.SecurityHub) {
                linkedWallets = new SecurityHubFlowContract$Step.Initial(SecurityHubFlowContract$Step.Initial.Destination.Default.f85519a);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LinkedWallets) {
                linkedWallets = new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.SECURITY_HUB, null);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LinkedWalletsFromCardSettings) {
                initial = new SecurityHubFlowContract$Step.LinkedWallets(vuc.g.CARD_SETTINGS, ((SecurityHubStartScreen.LinkedWalletsFromCardSettings) securityHubStartScreen2).f85381a);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LinkedWalletsAcknowledgeNew) {
                linkedWallets = SecurityHubFlowContract$Step.LinkedWalletsAcknowledgeNew.f85530a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.Payees) {
                initial = new SecurityHubFlowContract$Step.Payees(((SecurityHubStartScreen.Payees) securityHubStartScreen2).f85384a);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LearnAboutSecurity) {
                linkedWallets = SecurityHubFlowContract$Step.Learn.f85524a;
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.LinkedWalletDetailsFromDeeplink) {
                SecurityHubStartScreen.LinkedWalletDetailsFromDeeplink linkedWalletDetailsFromDeeplink = (SecurityHubStartScreen.LinkedWalletDetailsFromDeeplink) securityHubStartScreen2;
                initial = new SecurityHubFlowContract$Step.LinkedWalletDetails(linkedWalletDetailsFromDeeplink.f85377a, linkedWalletDetailsFromDeeplink.f85378b, vuc.g.CARD_SETTINGS, tuc.m.LINKED_WALLETS);
            } else if (securityHubStartScreen2 instanceof SecurityHubStartScreen.TransactionsLimitChange) {
                SecurityHubStartScreen.TransactionsLimitChange transactionsLimitChange = (SecurityHubStartScreen.TransactionsLimitChange) securityHubStartScreen2;
                initial = new SecurityHubFlowContract$Step.Initial(new SecurityHubFlowContract$Step.Initial.Destination.ChangeTransactionLimit(transactionsLimitChange.f85389a, transactionsLimitChange.f85390b));
            } else {
                if (!(securityHubStartScreen2 instanceof SecurityHubStartScreen.HiddenAccountsAndTransactions)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedWallets = SecurityHubFlowContract$Step.HiddenAccountsAndTransactions.f85513a;
            }
            linkedWallets = initial;
        }
        this.N = cp5.d.a(this, linkedWallets, listL, new hfb.d(this, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.security_hub.impl.ui.flow.m r20, java.lang.String r21, gim.c r22) throws java.lang.Throwable {
        /*
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof huc.h
            if (r2 == 0) goto L17
            r2 = r1
            huc.h r2 = (huc.h) r2
            int r3 = r2.f155618w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f155618w = r3
            goto L1c
        L17:
            huc.h r2 = new huc.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f155618w
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2c
            yhm.o.b(r1)
            goto L5c
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r1)
            wtc.h r1 = r0.f85573s
            r2.f155618w = r6
            cuc.d r1 = r1.f299872a
            r1.getClass()
            cuc.b r4 = new cuc.b
            r7 = r21
            r4.<init>(r1, r7, r5, r6)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r4, r2)
            if (r1 != r3) goto L52
            goto L54
        L52:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L54:
            if (r1 != r3) goto L57
            goto L59
        L57:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L59:
            if (r1 != r3) goto L5c
            return r3
        L5c:
            yki.a r1 = r0.N
            com.revolut.kompot.navigable.a r1 = r1.s()
            boolean r1 = r1 instanceof com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen
            if (r1 == 0) goto L69
            r0.B2()
        L69:
            huc.a r1 = r0.f85572r
            r1.getClass()
            nii.y0 r1 = new nii.y0
            nii.g0 r6 = new nii.g0
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.card_click_to_pay_bottomSheet_title
            r3 = 14
            r7.<init>(r2, r5, r5, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.card_click_to_pay_bottomSheet_subtitle
            r8.<init>(r2, r5, r5, r3)
            r18 = 0
            r19 = 16380(0x3ffc, float:2.2953E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r1.<init>(r5, r6, r2, r3)
            r0.X1(r1)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.m.I2(com.revolut.feature.security_hub.impl.ui.flow.m, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.security_hub.impl.ui.flow.m r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof huc.i
            if (r0 == 0) goto L13
            r0 = r5
            huc.i r0 = (huc.i) r0
            int r1 = r0.f155619w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155619w = r1
            goto L18
        L13:
            huc.i r0 = new huc.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f155619w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f85576x
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f155619w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            wtc.q0 r4 = r4.f85577y
            r4.getClass()
            boolean r4 = wtc.q0.b(r5)
            if (r4 == 0) goto L52
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r4 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.SECURITY_HUB_INTRO_IN
            goto L54
        L52:
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r4 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.SECURITY_HUB_INTRO
        L54:
            com.revolut.feature.product_article.api.models.ProductArticleParams r4 = rwc.d.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.m.J2(com.revolut.feature.security_hub.impl.ui.flow.m, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f85571q.f299909a.d.b(Unit.f186387a, w4l.h.f294642c), null, null, null, 7);
    }

    public final void K2(SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection) {
        if (!(wealthProtection instanceof SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.ChangeLimit)) {
            if (!(wealthProtection instanceof SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new j(this, null), new yi5.b(26));
        } else {
            SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.ChangeLimit changeLimit = (SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.ChangeLimit) wealthProtection;
            SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount wealthProtectionLimitChangeAmount = new SecurityHubFlowContract$Step.WealthProtectionLimitChangeAmount(changeLimit.f85521a, changeLimit.f85522b);
            oki.h.t2(this, this.N, wealthProtectionLimitChangeAmount, !(r2.d() instanceof SecurityHubFlowContract$Step.Initial), null, false, 12);
        }
    }

    public final void L2(String str) {
        C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 6), (SharedFaqDestination.PassthroughData) null, false, 14));
    }

    @Override // yji.l
    public final void T1(long j2) {
        m mVar;
        FlowStep flowStepD = this.N.d();
        Continuation continuation = null;
        SecurityHubFlowContract$Step.Initial initial = flowStepD instanceof SecurityHubFlowContract$Step.Initial ? (SecurityHubFlowContract$Step.Initial) flowStepD : null;
        if (initial != null) {
            SecurityHubFlowContract$Step.Initial.Destination destination = initial.f85516a;
            if (destination instanceof SecurityHubFlowContract$Step.Initial.Destination.Default) {
                n2(new f(this, null), new whi.b(6));
            } else if (destination instanceof SecurityHubFlowContract$Step.Initial.Destination.Limits) {
                n2(new e(this, null), new whi.b(6));
            } else if ((destination instanceof SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.Main) || (destination instanceof SecurityHubFlowContract$Step.Initial.Destination.WealthProtection.ChangeLimit)) {
                mVar = this;
                l2(new i(this, (SecurityHubFlowContract$Step.Initial.Destination.WealthProtection) destination, null), new yi5.b(26));
            } else {
                if (!(destination instanceof SecurityHubFlowContract$Step.Initial.Destination.ChangeTransactionLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                SecurityHubFlowContract$Step.Initial.Destination.ChangeTransactionLimit changeTransactionLimit = (SecurityHubFlowContract$Step.Initial.Destination.ChangeTransactionLimit) destination;
                mVar = this;
                n2(new o(mVar, changeTransactionLimit.f85517a, changeTransactionLimit.f85518b, continuation, 7), new whi.b(6));
            }
            mVar = this;
        } else {
            mVar = this;
        }
        String str = mVar.L;
        mVar.L = null;
        if (str == null) {
            return;
        }
        n2(new n(this, str, continuation, 27), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.N;
    }
}
