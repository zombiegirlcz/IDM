package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import ang.f;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.feature.voluntary.offboarding.impl.R$string;
import com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.AccountNotClosingViewController;
import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step;
import com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.RemoveObstaclesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dki.g;
import eli.j;
import ffk.t;
import igk.f;
import java.util.List;
import jec.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ksg.g;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import wli.x;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends g implements jsg.b {

    @NotNull
    public static final jsg.d Companion = new jsg.d();
    public final wif.a A;
    public final csg.a B;
    public final mre.c C;
    public final f D;
    public final uil.a E;
    public final h F;
    public final VoluntaryOffboardingFlowContract$Step.Loading G;
    public final VoluntaryOffboardingFlowContract$State H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f94838t;
    public final yf.c u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mli.e f94839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f94840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f94841y;
    public final gsg.d z;

    public e(x deeplinkHandler, yf.c supportInteractor, j twoFaErrorHandler, mli.e logoutController, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, t pricingPlanInteractor, gsg.d removeObstaclesInteractor, wif.a userFeaturesChecker, csg.a voluntaryOffboardingConfigurationProvider, mre.c termsNavigationFactory, f userInteractor, uil.a revolutAccountsManager, h serverErrorParser) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(logoutController, "logoutController");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(removeObstaclesInteractor, "removeObstaclesInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(voluntaryOffboardingConfigurationProvider, "voluntaryOffboardingConfigurationProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f94838t = deeplinkHandler;
        this.u = supportInteractor;
        this.v = twoFaErrorHandler;
        this.f94839w = logoutController;
        this.f94840x = userOnboardingNavigationProvider;
        this.f94841y = pricingPlanInteractor;
        this.z = removeObstaclesInteractor;
        this.A = userFeaturesChecker;
        this.B = voluntaryOffboardingConfigurationProvider;
        this.C = termsNavigationFactory;
        this.D = userInteractor;
        this.E = revolutAccountsManager;
        this.F = serverErrorParser;
        this.G = VoluntaryOffboardingFlowContract$Step.Loading.f94833a;
        this.H = new VoluntaryOffboardingFlowContract$State(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof jsg.i
            if (r0 == 0) goto L13
            r0 = r7
            jsg.i r0 = (jsg.i) r0
            int r1 = r0.f178178w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178178w = r1
            goto L18
        L13:
            jsg.i r0 = new jsg.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178178w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L74
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L4a
        L36:
            yhm.o.b(r7)
            ang.f r7 = r6.D
            zmg.d r7 = r7.d
            efm.k r7 = r7.c()
            r0.f178178w = r4
            java.lang.Object r7 = nim.a.i(r7, r0)
            if (r7 != r1) goto L4a
            goto L73
        L4a:
            do3.n r7 = (do3.n) r7
            if (r7 == 0) goto L77
            java.lang.String r7 = r7.f116409b
            if (r7 != 0) goto L53
            goto L77
        L53:
            uil.a r6 = r6.E
            cjl.b r2 = cjl.b.RETAIL
            r0.f178178w = r3
            pjl.z0 r6 = (pjl.z0) r6
            r6.getClass()
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            h4g.d r4 = new h4g.d
            r5 = 0
            r4.<init>(r6, r2, r7, r5)
            java.lang.Object r6 = skm.e0.J(r3, r4, r0)
            if (r6 != r1) goto L6f
            goto L71
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L71:
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L77:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.O2(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jsg.j
            if (r0 == 0) goto L13
            r0 = r6
            jsg.j r0 = (jsg.j) r0
            int r1 = r0.f178180x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178180x = r1
            goto L18
        L13:
            jsg.j r0 = new jsg.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178180x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            inh.g r6 = new inh.g
            r2 = 0
            r4 = 22
            r6.<init>(r4, r2, r5)
            r0.u = r5
            r0.f178180x = r3
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.kompot.navigable.flow.FlowState r6 = (com.revolut.kompot.navigable.flow.FlowState) r6
            r5.L2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.P2(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        l2(new c(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.F.a(throwable);
        if (serverErrorA == null || serverErrorA.f51362a != 9207) {
            super.o1(throwable);
            return false;
        }
        X1(new y0("cant_close_account_negative_balance_dialog", new z(new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_actionRequired_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_actionRequired_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4));
        return true;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        VoluntaryOffboardingFlowContract$Step step = (VoluntaryOffboardingFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.Loading.f94833a)) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.HeyWaitPromptStep.f94832a)) {
            if (((VoluntaryOffboardingFlowContract$State) A2().f98429a).f94828a) {
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_downgrade_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_downgrade_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D052", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.voluntary_offboarding_downgrade_button, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_close_account_button, null, null, 14), true, null, null, null, false, 16741324));
                final int i = 6;
                Function1 block = new Function1(this) { // from class: jsg.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                    {
                        this.f178175b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                                if (zF) {
                                    eVar.I2();
                                } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                    eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                                } else if (it8 instanceof c.a) {
                                    eVar.I2();
                                }
                                return Unit.f186387a;
                            case 1:
                                com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                    eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 2:
                                igk.f result = (igk.f) obj2;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                                if (zF2) {
                                    eVar3.I2();
                                } else {
                                    if (!Intrinsics.f(result, f.b.f161245a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 3:
                                ksg.g it10 = (ksg.g) obj2;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                boolean z = it10 instanceof ksg.f;
                                Continuation continuation = null;
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                                if (z) {
                                    eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                                } else if (it10 instanceof g.b) {
                                    eVar4.I2();
                                } else {
                                    if (!(it10 instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                                }
                                return Unit.f186387a;
                            case 4:
                                com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it11, "it");
                                boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                                Continuation continuation2 = null;
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                                if (zF3) {
                                    eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                                } else if (it11 instanceof c.a) {
                                    eVar5.I2();
                                } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                    eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                                }
                                return Unit.f186387a;
                            case 5:
                                com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it12, "it");
                                boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                                if (zF4) {
                                    eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                                } else if (it12 instanceof c.a) {
                                    eVar6.I2();
                                }
                                return Unit.f186387a;
                            case 6:
                                com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it13, "it");
                                boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                                if (zF5) {
                                    eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                                } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                    eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                                } else if (it13 instanceof c.a) {
                                    eVar7.I2();
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                                Intrinsics.checkNotNullParameter(it14, "it");
                                boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                                if (zF6) {
                                    eVar8.I2();
                                } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                    eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                                } else if (it14 instanceof c.a) {
                                    eVar8.I2();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block, "block");
                fullScreenPromptScreen.H = block;
                return fullScreenPromptScreen;
            }
            FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_wait_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_wait_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D052", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.voluntary_offboarding_keep_account_open_button, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_close_account_button, null, null, 14), true, null, null, null, false, 16741324));
            final int i2 = 0;
            Function1 block2 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            fullScreenPromptScreen2.H = block2;
            return fullScreenPromptScreen2;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.RemoveObstaclesStep.f94836a)) {
            RemoveObstaclesScreen removeObstaclesScreen = new RemoveObstaclesScreen();
            final int i3 = 3;
            Function1 function1 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            removeObstaclesScreen.H = function1;
            return removeObstaclesScreen;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a)) {
            FullScreenPromptScreen fullScreenPromptScreen3 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_protect_data_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_protect_data_subtitle, u.c(new TextLocalisedClause(R$string.voluntary_offboarding_protect_data_privacy_policy, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "PRIVACY_POLICY_ID", false), 10)), null, 12), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D174", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R.string.common_actions_understand, null, null, 14), null, true, null, null, null, false, 16743372));
            final int i5 = 4;
            Function1 block3 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            fullScreenPromptScreen3.H = block3;
            return fullScreenPromptScreen3;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a)) {
            ViewController viewControllerE1 = e1(new igk.e(new PlanCancelFeatures$InputData(PlanCancelFeatures$CancelReason.CloseAccount.f102909a)));
            final int i6 = 2;
            Function1 block4 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE1.H = block4;
            return viewControllerE1;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.RewardsUnavailableStep.f94837a)) {
            FullScreenPromptScreen fullScreenPromptScreen4 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_rewards_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_rewards_unavailable_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D172", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.voluntary_offboarding_keep_account_open_button, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_close_account_button, null, null, 14), true, null, null, null, false, 16741324));
            final int i21 = 7;
            Function1 block5 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i21) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            fullScreenPromptScreen4.H = block5;
            return fullScreenPromptScreen4;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.ApologyStep.f94830a)) {
            FullScreenPromptScreen fullScreenPromptScreen5 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_final_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_final_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), null, null, null, null, null, new TextLocalisedClause(R$string.voluntary_offboarding_final_button, null, null, 14), null, true, null, null, null, false, 16743372));
            final int i22 = 1;
            Function1 block6 = new Function1(this) { // from class: jsg.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

                {
                    this.f178175b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i22) {
                        case 0:
                            com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                            if (zF) {
                                eVar.I2();
                            } else if (Intrinsics.f(it8, c.d.f74507a)) {
                                eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                            } else if (it8 instanceof c.a) {
                                eVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                                eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 2:
                            igk.f result = (igk.f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                            if (zF2) {
                                eVar3.I2();
                            } else {
                                if (!Intrinsics.f(result, f.b.f161245a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 3:
                            ksg.g it10 = (ksg.g) obj2;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean z = it10 instanceof ksg.f;
                            Continuation continuation = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                            if (z) {
                                eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                            } else if (it10 instanceof g.b) {
                                eVar4.I2();
                            } else {
                                if (!(it10 instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                            Continuation continuation2 = null;
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                            if (zF3) {
                                eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                            } else if (it11 instanceof c.a) {
                                eVar5.I2();
                            } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                                eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                            if (zF4) {
                                eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                            } else if (it12 instanceof c.a) {
                                eVar6.I2();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it13, "it");
                            boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                            if (zF5) {
                                eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                            } else if (Intrinsics.f(it13, c.d.f74507a)) {
                                eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                            } else if (it13 instanceof c.a) {
                                eVar7.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                            Intrinsics.checkNotNullParameter(it14, "it");
                            boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                            if (zF6) {
                                eVar8.I2();
                            } else if (Intrinsics.f(it14, c.d.f74507a)) {
                                eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                            } else if (it14 instanceof c.a) {
                                eVar8.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block6, "block");
            fullScreenPromptScreen5.H = block6;
            return fullScreenPromptScreen5;
        }
        if (Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.AccountNotClosing.f94829a)) {
            return new AccountNotClosingViewController();
        }
        if (!Intrinsics.f(step, VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a)) {
            throw new NoWhenBranchMatchedException();
        }
        FullScreenPromptScreen fullScreenPromptScreen6 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.voluntary_offboarding_warning_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_warning_subtitle, null, null, 14), null, new GlyphImage(R$drawable.uikit_icn_24_lock_closed, null, null, 6), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.voluntary_offboarding_close_account_button, null, null, 14), null, true, null, null, null, false, 16743372));
        final int i32 = 5;
        Function1 block7 = new Function1(this) { // from class: jsg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178175b;

            {
                this.f178175b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        boolean zF = Intrinsics.f(it8, c.C0497c.f74506a);
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178175b;
                        if (zF) {
                            eVar.I2();
                        } else if (Intrinsics.f(it8, c.d.f74507a)) {
                            eVar.l2(new e(eVar, null, 0), new yi5.b(26));
                        } else if (it8 instanceof c.a) {
                            eVar.I2();
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.feature.full_screen_prompt.c it9 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if ((it9 instanceof c.a) || Intrinsics.f(it9, c.C0497c.f74506a)) {
                            com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178175b;
                            eVar2.l2(new e(eVar2, null, 1), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    case 2:
                        igk.f result = (igk.f) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF2 = Intrinsics.f(result, f.a.f161244a);
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178175b;
                        if (zF2) {
                            eVar3.I2();
                        } else {
                            if (!Intrinsics.f(result, f.b.f161245a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVar3.l2(new e(eVar3, null, 0), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    case 3:
                        ksg.g it10 = (ksg.g) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        boolean z = it10 instanceof ksg.f;
                        Continuation continuation = null;
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = this.f178175b;
                        if (z) {
                            eVar4.l2(new p(eVar4, it10, continuation, 29), new yi5.b(26));
                        } else if (it10 instanceof g.b) {
                            eVar4.I2();
                        } else {
                            if (!(it10 instanceof g.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVar4.E2(VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, false, null, false);
                        }
                        return Unit.f186387a;
                    case 4:
                        com.revolut.feature.full_screen_prompt.c it11 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        boolean zF3 = Intrinsics.f(it11, c.C0497c.f74506a);
                        Continuation continuation2 = null;
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar5 = this.f178175b;
                        if (zF3) {
                            eVar5.E2(VoluntaryOffboardingFlowContract$Step.ConfirmDecisionStep.f94831a, false, null, false);
                        } else if (it11 instanceof c.a) {
                            eVar5.I2();
                        } else if ((it11 instanceof d67.h) && Intrinsics.f(((d67.h) it11).f111458a.f275445a, "PRIVACY_POLICY_ID")) {
                            eVar5.n2(new p(eVar5, continuation2, 28), new whi.b(6));
                        }
                        return Unit.f186387a;
                    case 5:
                        com.revolut.feature.full_screen_prompt.c it12 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        boolean zF4 = Intrinsics.f(it12, c.C0497c.f74506a);
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar6 = this.f178175b;
                        if (zF4) {
                            eVar6.l2(new e(eVar6, null, 3), new yi5.b(26));
                        } else if (it12 instanceof c.a) {
                            eVar6.I2();
                        }
                        return Unit.f186387a;
                    case 6:
                        com.revolut.feature.full_screen_prompt.c it13 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        boolean zF5 = Intrinsics.f(it13, c.C0497c.f74506a);
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar7 = this.f178175b;
                        if (zF5) {
                            eVar7.C1(new KompotPricingPlanFeatureConfig.PlanCancelDestination(true, (PricingPlanUpdateSource) null, false));
                        } else if (Intrinsics.f(it13, c.d.f74507a)) {
                            eVar7.E2(VoluntaryOffboardingFlowContract$Step.PremiumBenefitsStep.f94834a, true, null, false);
                        } else if (it13 instanceof c.a) {
                            eVar7.I2();
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.full_screen_prompt.c it14 = (com.revolut.feature.full_screen_prompt.c) obj2;
                        Intrinsics.checkNotNullParameter(it14, "it");
                        boolean zF6 = Intrinsics.f(it14, c.C0497c.f74506a);
                        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar8 = this.f178175b;
                        if (zF6) {
                            eVar8.I2();
                        } else if (Intrinsics.f(it14, c.d.f74507a)) {
                            eVar8.l2(new com.revolut.feature.voluntary.offboarding.impl.ui.flow.b(eVar8, null), new yi5.b(26));
                        } else if (it14 instanceof c.a) {
                            eVar8.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block7, "block");
        fullScreenPromptScreen6.H = block7;
        return fullScreenPromptScreen6;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.H;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.G;
    }
}
