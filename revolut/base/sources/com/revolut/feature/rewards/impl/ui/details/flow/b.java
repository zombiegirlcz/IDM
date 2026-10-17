package com.revolut.feature.rewards.impl.ui.details.flow;

import bgc.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.api.model.rewards.ActivationNotice;
import com.revolut.feature.rewards.api.model.rewards.ExistingSubscriptionCheck;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$Step;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.R$string;
import kic.g;
import kic.k;
import kic.m;
import kic.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lic.s;
import mre.c;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pic.f;
import qki.d;
import wli.x;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements g {

    @NotNull
    public static final k Companion = new k();
    public final sjc.a A;
    public final h81.b B;
    public final d C;
    public final i D;
    public final PerkDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f84940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kic.b f84941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lic.g f84942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kic.d f84943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f84944t;
    public final x u;
    public final h4g.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f84945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gic.h f84946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f84947y;
    public final ajk.b z;

    public b(PerkDetailsFlowContract$InputData inputData, e rewardsInteractor, kic.b activateActionHandler, lic.g externalRegistrationActionHandler, kic.d partnerMembershipActionHandler, s subscriptionCancellationHandler, x deeplinkHandler, h4g.g shopsFeatureAvailabilityInteractor, f availabilityMapper, gic.h rewardActionNavigator, c termsNavigationFactory, ajk.b outOfAppNavigationProvider, sjc.a subscriptionStatusDialogFactory, h81.b errorMessagesProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(activateActionHandler, "activateActionHandler");
        Intrinsics.checkNotNullParameter(externalRegistrationActionHandler, "externalRegistrationActionHandler");
        Intrinsics.checkNotNullParameter(partnerMembershipActionHandler, "partnerMembershipActionHandler");
        Intrinsics.checkNotNullParameter(subscriptionCancellationHandler, "subscriptionCancellationHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(availabilityMapper, "availabilityMapper");
        Intrinsics.checkNotNullParameter(rewardActionNavigator, "rewardActionNavigator");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(subscriptionStatusDialogFactory, "subscriptionStatusDialogFactory");
        Intrinsics.checkNotNullParameter(errorMessagesProvider, "errorMessagesProvider");
        this.o = inputData;
        this.f84940p = rewardsInteractor;
        this.f84941q = activateActionHandler;
        this.f84942r = externalRegistrationActionHandler;
        this.f84943s = partnerMembershipActionHandler;
        this.f84944t = subscriptionCancellationHandler;
        this.u = deeplinkHandler;
        this.v = shopsFeatureAvailabilityInteractor;
        this.f84945w = availabilityMapper;
        this.f84946x = rewardActionNavigator;
        this.f84947y = termsNavigationFactory;
        this.z = outOfAppNavigationProvider;
        this.A = subscriptionStatusDialogFactory;
        this.B = errorMessagesProvider;
        this.C = hx7.e.b(this, new PerkDetailsFlowContract$State(false, false));
        this.D = d8l.d.a(this, new k3k.k(this, 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r6.O2(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rewards.impl.ui.details.flow.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof kic.l
            if (r0 == 0) goto L13
            r0 = r7
            kic.l r0 = (kic.l) r0
            int r1 = r0.f184206w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184206w = r1
            goto L18
        L13:
            kic.l r0 = new kic.l
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184206w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            goto L49
        L36:
            yhm.o.b(r7)
            kic.m r7 = new kic.m     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            r2 = 0
            r5 = 0
            r7.<init>(r6, r5, r2)     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            r0.f184206w = r4     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            java.lang.Object r7 = r6.p2(r0, r7)     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            if (r7 != r1) goto L49
            goto L55
        L49:
            ggc.j0 r7 = (ggc.j0) r7     // Catch: java.lang.Throwable -> L59 java.util.concurrent.CancellationException -> L5f
            java.lang.String r7 = r7.f143638a
            r0.f184206w = r3
            java.lang.Object r6 = r6.O2(r7, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L59:
            r6.S2()
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5f:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.flow.b.I2(com.revolut.feature.rewards.impl.ui.details.flow.b, gim.c):java.lang.Object");
    }

    public static final Object J2(b bVar, RewardFooterAction rewardFooterAction, gim.i iVar) {
        i iVar2 = bVar.D;
        if (rewardFooterAction instanceof RewardFooterAction.OpenUrl) {
            Object objA = igk.k.a(bVar.l1(), bVar.z, ((RewardFooterAction.OpenUrl) rewardFooterAction).f84859a, new k8e.a(bVar, rewardFooterAction, 14), iVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        if (rewardFooterAction instanceof RewardFooterAction.CopyAndOpenUrl) {
            gic.h hVar = bVar.f84946x;
            RewardFooterAction.CopyAndOpenUrl copyAndOpenUrl = (RewardFooterAction.CopyAndOpenUrl) rewardFooterAction;
            String str = copyAndOpenUrl.f84857a;
            String str2 = copyAndOpenUrl.f84858b;
            hVar.b3(str);
            Object objA2 = igk.k.a(hVar.f144118m, hVar.o, str2, new gic.b(hVar, str2, 0), iVar);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objA2 != aVar) {
                objA2 = Unit.f186387a;
            }
            return objA2 == aVar ? objA2 : Unit.f186387a;
        }
        boolean z = rewardFooterAction instanceof RewardFooterAction.ShowBottomSheet;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            h.w2(iVar2, new PerkDetailsFlowContract$Step.FooterBottomSheet(((RewardFooterAction.ShowBottomSheet) rewardFooterAction).f84860a), bottom_dialog);
        } else if (rewardFooterAction instanceof RewardFooterAction.Subscribe) {
            RewardFooterAction.Subscribe subscribe = (RewardFooterAction.Subscribe) rewardFooterAction;
            ActivationNotice activationNotice = subscribe.f84863c;
            String str3 = subscribe.f84861a;
            ExistingSubscriptionCheck existingSubscriptionCheck = subscribe.f84862b;
            if (existingSubscriptionCheck != null) {
                h.w2(iVar2, new PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt(str3, existingSubscriptionCheck, activationNotice), bottom_dialog);
            } else if (activationNotice != null) {
                h.w2(iVar2, new PerkDetailsFlowContract$Step.ActivationNotice(str3, activationNotice), bottom_dialog);
            } else {
                bVar.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new m(bVar, null, 4));
            }
        } else {
            if (!(rewardFooterAction instanceof RewardFooterAction.Cancel)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(iVar2, new PerkDetailsFlowContract$Step.CancelSubscription((RewardFooterAction.Cancel) rewardFooterAction), bottom_dialog);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.rewards.impl.ui.details.flow.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof kic.o
            if (r0 == 0) goto L13
            r0 = r8
            kic.o r0 = (kic.o) r0
            int r1 = r0.f184210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184210w = r1
            goto L18
        L13:
            kic.o r0 = new kic.o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184210w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L37
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto Lab
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L6d
        L37:
            yhm.o.b(r8)
            bgc.e r8 = r7.f84940p
            com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData r2 = r7.o
            java.lang.String r5 = r2.f84922a
            boolean r2 = r2.f
            r6 = 0
            ugc.g r8 = (ugc.g) r8
            efm.r r8 = r8.h(r5, r2, r6)
            kh4.b r2 = new kh4.b
            r5 = 12
            r2.<init>(r5)
            kce.c r5 = new kce.c
            r6 = 14
            r5.<init>(r2, r6)
            efm.r r8 = r8.filter(r5)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f184210w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L6d
            goto Laa
        L6d:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            ggc.l r8 = (ggc.l) r8
            if (r8 != 0) goto L7a
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7a:
            ggc.t r2 = r8.d
            h4g.g r3 = r7.v
            boolean r3 = r3.e()
            if (r3 == 0) goto L8d
            ggc.t r8 = r8.e
            if (r8 != 0) goto L89
            goto L8a
        L89:
            r2 = r8
        L8a:
            java.lang.String r8 = r2.e
            goto L8f
        L8d:
            java.lang.String r8 = r2.e
        L8f:
            if (r8 == 0) goto L95
            r7.P2(r8)
            goto Lbc
        L95:
            mre.c r8 = r7.f84947y
            com.revolut.feature.terms.api.model.TermsScope$a r2 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r2.getClass()
            com.revolut.feature.terms.api.model.TermsScope r2 = com.revolut.feature.terms.api.model.TermsScope.i0
            ufm.i r8 = mre.c.a(r8, r2)
            r0.f184210w = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto Lab
        Laa:
            return r1
        Lab:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            aii.o r7 = r7.l1()
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.<init>(r8)
            knm.b.j(r7, r0)
        Lbc:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.flow.b.K2(com.revolut.feature.rewards.impl.ui.details.flow.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6.Q2(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.rewards.impl.ui.details.flow.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof kic.r
            if (r0 == 0) goto L13
            r0 = r7
            kic.r r0 = (kic.r) r0
            int r1 = r0.f184213w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184213w = r1
            goto L18
        L13:
            kic.r r0 = new kic.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184213w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L53
        L36:
            yhm.o.b(r7)
            bgc.e r7 = r6.f84940p
            ugc.g r7 = (ugc.g) r7
            toa.a r7 = r7.f280009c
            soa.b r2 = new soa.b
            soa.c r5 = soa.c.PERSONALIZED_THIRD_PARTY
            r2.<init>(r5, r4, r4)
            efm.b r7 = r7.a(r2)
            r0.f184213w = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L53
            goto L6a
        L53:
            qki.d r7 = r6.C
            kh4.b r2 = new kh4.b
            r4 = 11
            r2.<init>(r4)
            r6.H2(r7, r2)
            r6.R2()
            r0.f184213w = r3
            java.lang.Object r6 = r6.Q2(r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.flow.b.L2(com.revolut.feature.rewards.impl.ui.details.flow.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.feature.rewards.impl.ui.details.flow.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof kic.s
            if (r0 == 0) goto L13
            r0 = r5
            kic.s r0 = (kic.s) r0
            int r1 = r0.f184214w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184214w = r1
            goto L18
        L13:
            kic.s r0 = new kic.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184214w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            goto L56
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            bgc.e r5 = r4.f84940p     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData r4 = r4.o     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            java.lang.String r2 = r4.f84922a     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            boolean r4 = r4.f     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            r0.f184214w = r3     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            ugc.g r5 = (ugc.g) r5     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            java.lang.Object r4 = r5.k(r0, r2, r4)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L59
            if (r4 != r1) goto L56
            return r1
        L45:
            r4 = move-exception
            java.lang.String r5 = "PerkDetailsFlowModel"
            java.lang.String r0 = "reloadRewardDetails"
            java.util.Set r5 = m72.b.w(r5, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
        L56:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L59:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.flow.b.M2(com.revolut.feature.rewards.impl.ui.details.flow.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new q(this, null, 0), new yi5.b(26));
    }

    @Override // yki.j
    public final void M0() {
        R2();
    }

    public final void N2(String str, Function1 function1) {
        l2(new k0g.b(this, str, function1, (Continuation) null), new yi5.b(26));
    }

    public final Object O2(String str, gim.c cVar) {
        Object objL1 = this.u.L1(str, lg0.a.OPEN_BROWSER, Boolean.FALSE, cVar);
        return objL1 == fim.a.COROUTINE_SUSPENDED ? objL1 : Unit.f186387a;
    }

    public final void P2(String str) {
        knm.b.j(l1(), new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kic.t
            if (r0 == 0) goto L13
            r0 = r5
            kic.t r0 = (kic.t) r0
            int r1 = r0.f184215w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184215w = r1
            goto L18
        L13:
            kic.t r0 = new kic.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184215w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r5 = move-exception
            goto L41
        L29:
            r5 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            bgc.e r5 = r4.f84940p     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f184215w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = bgc.e.a(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L51
            return r1
        L41:
            java.lang.String r0 = "PerkDetailsFlowModel"
            java.lang.String r1 = "reloadRewardsAfterOptIn"
            java.util.Set r0 = m72.b.w(r0, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L51:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.flow.b.Q2(gim.c):java.lang.Object");
    }

    public final void R2() {
        PerkDetailsFlowContract$Step.Content content = new PerkDetailsFlowContract$Step.Content(this.o);
        if (content.equals((PerkDetailsFlowContract$Step) this.D.d())) {
            return;
        }
        h.t2(this, this.D, content, false, TransitionAnimation.REPLACE.f98394a, false, 8);
    }

    public final void S2() {
        this.A.getClass();
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.common_state_error_title_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 5)), null, null, null, 7);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            n2(new q(this, null, 1), new whi.b(6));
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.C;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.D;
    }
}
