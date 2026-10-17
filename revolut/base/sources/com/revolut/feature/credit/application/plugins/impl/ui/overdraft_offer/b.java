package com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer;

import ack.f;
import ag4.g;
import ag4.i;
import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements ag4.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverdraftOfferFlowContract$InputData f68165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f68166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rx3.a f68167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68168s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OverdraftOfferFlowContract$InputData inputData, a overdraftOfferFlowInteractor, rx3.a creditAnimatedIntroInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(overdraftOfferFlowInteractor, "overdraftOfferFlowInteractor");
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68165p = inputData;
        this.f68166q = overdraftOfferFlowInteractor;
        this.f68167r = creditAnimatedIntroInteractor;
        f fVar = new f(this, 11);
        this.f68168s = d.a(this, OverdraftOfferFlowContract$Step.Loading.f68160a, f0.f322471a, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r11 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b r9, cv3.s r10, gim.c r11) {
        /*
            yki.a r1 = r9.f68168s
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData r0 = r9.f68165p
            rx3.a r2 = r9.f68167r
            boolean r3 = r11 instanceof ag4.j
            if (r3 == 0) goto L19
            r3 = r11
            ag4.j r3 = (ag4.j) r3
            int r4 = r3.f4785x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f4785x = r4
            goto L1e
        L19:
            ag4.j r3 = new ag4.j
            r3.<init>(r9, r11)
        L1e:
            java.lang.Object r11 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f4785x
            java.lang.String r6 = "OVERDRAFT_REVEAL_ANIMATION_ID"
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L42
            if (r5 == r8) goto L3c
            if (r5 != r7) goto L34
            cv3.s r10 = r3.u
            yhm.o.b(r11)
            goto L74
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            cv3.s r10 = r3.u
            yhm.o.b(r11)
            goto L56
        L42:
            yhm.o.b(r11)
            if (r10 == 0) goto L5e
            r3.u = r10
            r3.f4785x = r8
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r11 = r0.f68159a
            java.lang.String r11 = r11.f66892b
            java.lang.Boolean r11 = r2.a(r11, r6)
            if (r11 != r4) goto L56
            goto L73
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L60
        L5e:
            r0 = r9
            goto L8d
        L60:
            r3.u = r10
            r3.f4785x = r7
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r11 = r0.f68159a
            java.lang.String r11 = r11.f66892b
            kotlin.Unit r11 = r2.b(r11, r6)
            if (r11 != r4) goto L6f
            goto L71
        L6f:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L71:
            if (r11 != r4) goto L74
        L73:
            return r4
        L74:
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$Step$OfferContent r2 = new com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$Step$OfferContent
            r2.<init>(r10)
            com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation r4 = new com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation
            int r10 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_navBarLargeCentred
            int r11 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_recyclerView
            int r0 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_twinVerticalButton
            r4.<init>(r10, r11, r0)
            r5 = 0
            r6 = 8
            r3 = 0
            r0 = r9
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L9b
        L8d:
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$Step$OfferContent r2 = new com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$Step$OfferContent
            r2.<init>(r10)
            com.revolut.kompot.navigable.TransitionAnimation$NONE r4 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r5 = 0
            r6 = 8
            r3 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L9b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b.P2(com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b, cv3.s, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f68168s.d() instanceof OverdraftOfferFlowContract$Step.Loading) {
            n2(new i(this, null, 1), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68168s;
    }
}
