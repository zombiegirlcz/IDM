package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import c84.t;
import ce4.n;
import ce4.q;
import ce4.x;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import e84.e;
import hs3.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements ce4.b {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MortgageOfferFlowContract$InputData f67997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f67998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rx3.a f67999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MortgageOfferFlowContract$InputData inputData, n mortgageOfferFlowInteractor, rx3.a creditAnimatedIntroInteractor, e pluginControllerResolver) {
        FlowStep intro;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mortgageOfferFlowInteractor, "mortgageOfferFlowInteractor");
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67997p = inputData;
        this.f67998q = mortgageOfferFlowInteractor;
        this.f67999r = creditAnimatedIntroInteractor;
        j0 j0Var = inputData.f67970c;
        if (j0Var == j0.TOP_ITEM) {
            intro = MortgageOfferFlowContract$Step.LoadingTopItemOffer.f67980a;
        } else {
            hs3.c cVar = inputData.f67968a;
            intro = cVar != null ? new MortgageOfferFlowContract$Step.Intro(cVar) : new MortgageOfferFlowContract$Step.OfferContent(null, j0Var, null, 5);
        }
        this.f68000s = cp5.d.a(this, intro, f0.f322471a, new c9f.c(this, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (c84.t.N2(r5, (it3.d) r6, r0, 2) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ce4.s
            if (r0 == 0) goto L13
            r0 = r6
            ce4.s r0 = (ce4.s) r0
            int r1 = r0.f23385w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23385w = r1
            goto L18
        L13:
            ce4.s r0 = new ce4.s
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23385w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            ce4.n r6 = r5.f67998q
            r0.f23385w = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            it3.d r6 = (it3.d) r6
            r0.f23385w = r3
            java.lang.Object r5 = c84.t.N2(r5, r6, r0, r3)
            if (r5 != r1) goto L4f
        L4e:
            return r1
        L4f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.P2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d r11, gim.c r12) {
        /*
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData r2 = r11.f67997p
            boolean r3 = r12 instanceof ce4.w
            if (r3 == 0) goto L15
            r3 = r12
            ce4.w r3 = (ce4.w) r3
            int r4 = r3.f23392x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L15
            int r4 = r4 - r5
            r3.f23392x = r4
            goto L1a
        L15:
            ce4.w r3 = new ce4.w
            r3.<init>(r11, r12)
        L1a:
            java.lang.Object r1 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f23392x
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L44
            if (r5 == r9) goto L40
            if (r5 == r8) goto L3a
            if (r5 != r7) goto L32
            cv3.s r3 = r3.u
            yhm.o.b(r1)
            goto L8b
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            cv3.s r5 = r3.u
            yhm.o.b(r1)
            goto L6a
        L40:
            yhm.o.b(r1)
            goto L56
        L44:
            yhm.o.b(r1)
            r3.f23392x = r9
            ce4.u r1 = new ce4.u
            r5 = 0
            r1.<init>(r11, r6, r5)
            java.lang.Object r1 = r11.p2(r3, r1)
            if (r1 != r4) goto L56
            goto L89
        L56:
            cv3.s r1 = (cv3.s) r1
            if (r1 == 0) goto L99
            hs3.j0 r5 = r2.f67970c
            r3.u = r1
            r3.f23392x = r8
            java.lang.Object r5 = r11.R2(r5, r3)
            if (r5 != r4) goto L67
            goto L89
        L67:
            r10 = r5
            r5 = r1
            r1 = r10
        L6a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
            r3.u = r5
            r3.f23392x = r7
            rx3.a r1 = r11.f67999r
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r3 = r2.f67969b
            java.lang.String r3 = r3.f66892b
            java.lang.String r7 = "MORTGAGE_REVEAL_ANIMATION_ID"
            kotlin.Unit r1 = r1.b(r3, r7)
            if (r1 != r4) goto L85
            goto L87
        L85:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L87:
            if (r1 != r4) goto L8a
        L89:
            return r4
        L8a:
            r3 = r5
        L8b:
            com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation r1 = new com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation
            int r4 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_navBarLargeCentred
            int r5 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_recyclerView
            int r7 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_twinVerticalButton
            r1.<init>(r4, r5, r7)
            r4 = r1
            goto L9d
        L98:
            r1 = r5
        L99:
            com.revolut.kompot.navigable.TransitionAnimation$NONE r3 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r4 = r3
            r3 = r1
        L9d:
            yki.a r1 = r11.f68000s
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step$OfferContent r5 = new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step$OfferContent
            hs3.j0 r2 = r2.f67970c
            r5.<init>(r6, r2, r3, r9)
            r2 = r5
            r5 = 0
            r6 = 8
            r3 = 0
            r0 = r11
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.Q2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(hs3.j0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ce4.y
            if (r0 == 0) goto L13
            r0 = r6
            ce4.y r0 = (ce4.y) r0
            int r1 = r0.f23394w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23394w = r1
            goto L18
        L13:
            ce4.y r0 = new ce4.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23394w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            hs3.j0 r6 = hs3.j0.TOP_ITEM
            if (r5 != r6) goto L52
            r0.f23394w = r3
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData r5 = r4.f67997p
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r5 = r5.f67969b
            java.lang.String r5 = r5.f66892b
            java.lang.String r6 = "MORTGAGE_REVEAL_ANIMATION_ID"
            rx3.a r0 = r4.f67999r
            java.lang.Boolean r6 = r0.a(r5, r6)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L52
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.R2(hs3.j0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f68000s.d() instanceof MortgageOfferFlowContract$Step.LoadingTopItemOffer) {
            n2(new x(this, null, 0), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68000s;
    }
}
