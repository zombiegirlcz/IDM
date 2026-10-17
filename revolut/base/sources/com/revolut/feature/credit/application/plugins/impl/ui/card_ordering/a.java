package com.revolut.feature.credit.application.plugins.impl.ui.card_ordering;

import c84.t;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import g64.b;
import g64.d;
import g64.h;
import g64.s;
import g64.z;
import h93.f0;
import hw3.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import te0.w;
import wli.x;
import yji.l;
import yki.i;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {
    public static final long C;

    @NotNull
    public static final d Companion = new d();
    public static final long D;
    public a2 A;
    public final i B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nw3.d f67203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CardOrderingFlowContract$InputData f67204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f67205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f67206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g64.a f67207t;
    public final z u;
    public final an4.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f67208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f67209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f67210y;
    public a2 z;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        C = c.g(5, eVar);
        D = c.g(3, eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nw3.d cardOrderingInteractor, CardOrderingFlowContract$InputData inputData, e84.e pluginControllerResolver, j60.a bottomDialogExtension, x deeplinkHandler, g64.a cardOrderingDialogProvider, z issueVirtualCreditCardInteractor, an4.i creditProductCommandFactory, e creditApplicationConfigInteractor, s cardOrderingNavigationProvider) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(cardOrderingInteractor, "cardOrderingInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(cardOrderingDialogProvider, "cardOrderingDialogProvider");
        Intrinsics.checkNotNullParameter(issueVirtualCreditCardInteractor, "issueVirtualCreditCardInteractor");
        Intrinsics.checkNotNullParameter(creditProductCommandFactory, "creditProductCommandFactory");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(cardOrderingNavigationProvider, "cardOrderingNavigationProvider");
        this.f67203p = cardOrderingInteractor;
        this.f67204q = inputData;
        this.f67205r = bottomDialogExtension;
        this.f67206s = deeplinkHandler;
        this.f67207t = cardOrderingDialogProvider;
        this.u = issueVirtualCreditCardInteractor;
        this.v = creditProductCommandFactory;
        this.f67208w = creditApplicationConfigInteractor;
        this.f67209x = cardOrderingNavigationProvider;
        this.f67210y = w.y0(new g53.e(1));
        this.B = d8l.d.a(this, new fv1.a(this, 27));
    }

    public static final nii.z P2(a aVar, Throwable th10) {
        return new nii.z(new TextLocalisedClause(tj0.a.a(th10) ? R$string.credit_card_ordering_intro_error_internet : R$string.credit_card_ordering_intro_error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q2(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a r8, hs3.q r9, com.revolut.feature.credit.application.models.plugins.PluginPayload r10, gim.c r11) {
        /*
            com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData r0 = r8.f67204q
            boolean r1 = r11 instanceof g64.j
            if (r1 == 0) goto L16
            r1 = r11
            g64.j r1 = (g64.j) r1
            int r2 = r1.f140847w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f140847w = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            g64.j r1 = new g64.j
            r1.<init>(r8, r11)
            goto L14
        L1c:
            java.lang.Object r11 = r7.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f140847w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            goto L6e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r11)
            goto L95
        L3a:
            yhm.o.b(r11)
            if (r9 == 0) goto L42
            hs3.o1 r9 = r9.f154930b
            goto L43
        L42:
            r9 = 0
        L43:
            r11 = -1
            if (r9 != 0) goto L48
            r9 = r11
            goto L50
        L48:
            int[] r2 = g64.e.f140842a
            int r9 = r9.ordinal()
            r9 = r2[r9]
        L50:
            if (r9 == r11) goto L7f
            if (r9 == r4) goto L7f
            if (r9 != r3) goto L79
            g64.s r2 = r8.f67209x
            h93.j0 r4 = r0.getD()
            h93.l0 r5 = r0.getE()
            boolean r6 = r0.getF()
            r7.f140847w = r3
            r3 = r10
            java.lang.Object r11 = r2.a(r3, r4, r5, r6, r7)
            if (r11 != r1) goto L6e
            goto L94
        L6e:
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r9.<init>(r11)
            r8.C1(r9)
            goto La2
        L79:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L7f:
            r3 = r10
            hw3.e r9 = r8.f67208w
            ju3.a r10 = ju3.a.CARD_ORDERING_INTRO
            it3.d r11 = r3.f66247a
            ft3.j1 r11 = r11.f168328j
            ufm.i r9 = r9.b(r10, r11)
            r7.f140847w = r4
            java.lang.Object r11 = nim.a.b(r9, r7)
            if (r11 != r1) goto L95
        L94:
            return r1
        L95:
            com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig r11 = (com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig) r11
            com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step$OrderCardIntro r9 = new com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step$OrderCardIntro
            kotlin.jvm.internal.Intrinsics.h(r11)
            r9.<init>(r11)
            r8.V2(r9)
        La2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Q2(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a, hs3.q, com.revolut.feature.credit.application.models.plugins.PluginPayload, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R2(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a r4, com.revolut.feature.credit.application.models.plugins.PluginPayload r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof g64.k
            if (r0 == 0) goto L13
            r0 = r6
            g64.k r0 = (g64.k) r0
            int r1 = r0.f140848w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140848w = r1
            goto L18
        L13:
            g64.k r0 = new g64.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140848w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            hw3.e r6 = r4.f67208w
            ju3.a r2 = ju3.a.CARD_ORDERING_SPINNER
            it3.d r5 = r5.f66247a
            ft3.j1 r5 = r5.f168328j
            ufm.i r5 = r6.b(r2, r5)
            r0.f140848w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig r6 = (com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig) r6
            com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step$VirtualCardOrdering r5 = new com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step$VirtualCardOrdering
            kotlin.jvm.internal.Intrinsics.h(r6)
            r5.<init>(r6)
            r4.V2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.R2(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a, com.revolut.feature.credit.application.models.plugins.PluginPayload, gim.c):java.lang.Object");
    }

    public static final void S2(a aVar, f0 f0Var) {
        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = aVar.f67204q;
        an4.i iVar = aVar.v;
        aVar.C1(f0Var != null ? new BridgeDestination(new FeatureCommand(new AddToGooglePayFeatureConfig(f0Var, iVar.b(cardOrderingFlowContract$InputData.getF67197a()), iVar.b(cardOrderingFlowContract$InputData.getF67197a()), null, null, false, 482))) : new BridgeDestination(iVar.b(cardOrderingFlowContract$InputData.getF67197a())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yki.j
    public final void M0() {
        ?? r06 = this.f67210y;
        this.f67205r.d(u.c((LargeActionButtonDelegate) r06.getValue()));
        vkm.d dVarB = rd0.e.b(((LargeActionButtonDelegate) r06.getValue()).d.f121375b);
        Continuation continuation = null;
        l.a1(this, dVarB, null, null, new h(this, null), 3);
        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = this.f67204q;
        if (cardOrderingFlowContract$InputData instanceof CardOrderingFlowContract$InputData.FromPayload) {
            l2(new g1k.i(this, ((CardOrderingFlowContract$InputData.FromPayload) cardOrderingFlowContract$InputData).f67192a, continuation, 10), new yi5.b(26));
            return;
        }
        if (cardOrderingFlowContract$InputData instanceof CardOrderingFlowContract$InputData.PhysicalAndVirtualCard) {
            V2(new CardOrderingFlowContract$Step.OrderCardIntro(((CardOrderingFlowContract$InputData.PhysicalAndVirtualCard) cardOrderingFlowContract$InputData).f67195b));
        } else if (cardOrderingFlowContract$InputData instanceof CardOrderingFlowContract$InputData.VirtualCard) {
            V2(new CardOrderingFlowContract$Step.VirtualCardOrdering(((CardOrderingFlowContract$InputData.VirtualCard) cardOrderingFlowContract$InputData).f67198b));
        } else {
            if (!(cardOrderingFlowContract$InputData instanceof CardOrderingFlowContract$InputData.CardOrdered)) {
                throw new NoWhenBranchMatchedException();
            }
            V2(new CardOrderingFlowContract$Step.Ordered(((CardOrderingFlowContract$InputData.CardOrdered) cardOrderingFlowContract$InputData).f67190b));
        }
    }

    public final ViewController T2(CardOrderingFlowContract$Step cardOrderingFlowContract$Step) {
        if (!(cardOrderingFlowContract$Step instanceof CardOrderingFlowContract$Step.OrderCardIntro)) {
            if (cardOrderingFlowContract$Step instanceof CardOrderingFlowContract$Step.VirtualCardOrdering) {
                return U2(((CardOrderingFlowContract$Step.VirtualCardOrdering) cardOrderingFlowContract$Step).f67202a);
            }
            if (cardOrderingFlowContract$Step instanceof CardOrderingFlowContract$Step.Ordered) {
                return U2(((CardOrderingFlowContract$Step.Ordered) cardOrderingFlowContract$Step).f67201a);
            }
            throw new NoWhenBranchMatchedException();
        }
        CardOrderingIntroScreenConfig cardOrderingIntroScreenConfig = ((CardOrderingFlowContract$Step.OrderCardIntro) cardOrderingFlowContract$Step).f67200a;
        FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(ug4.a.b(cardOrderingIntroScreenConfig.f66337a, cardOrderingIntroScreenConfig.f66338b, this.f67204q.getF68419b(), false, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D016", null, null, null, 30), new TextLocalisedClause(R$string.credit_card_ordering_intro_button_orderPhysical, null, null, 14), new TextLocalisedClause(R$string.credit_card_ordering_intro_button_orderVirtual, null, null, 14), 15928));
        g4k.e block = new g4k.e(this, 4);
        Intrinsics.checkNotNullParameter(block, "block");
        fullScreenPromptScreen.H = block;
        return fullScreenPromptScreen;
    }

    public final SpinnerScreen U2(CardOrderingLoadingScreenConfig cardOrderingLoadingScreenConfig) {
        return new SpinnerScreen(new SpinnerScreenContract$InputData(new SpinnerConfiguration.FullScreen(new SpinnerConfiguration.Content.Static(new SpinnerConfiguration.Content.SpinnerContent(cardOrderingLoadingScreenConfig.f66339a, cardOrderingLoadingScreenConfig.f66340b)), SpinnerConfiguration.Mode.Infinite.f66380a), this.f67204q.getF68419b()));
    }

    public final void V2(CardOrderingFlowContract$Step cardOrderingFlowContract$Step) {
        oki.h.t2(this, this.B, cardOrderingFlowContract$Step, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.B;
    }
}
