package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function1 {
    public nu3.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f67380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditCardOfferFlowContract$Step.Loading f67381x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, CreditCardOfferFlowContract$Step.Loading loading, Continuation continuation) {
        super(1, continuation);
        this.f67380w = iVar;
        this.f67381x = loading;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f67380w, this.f67381x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$Loading r0 = r10.f67381x
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig$RegularOffer r0 = r0.f67365a
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i r1 = r10.f67380w
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r2 = r1.f67383p
            rx3.a r3 = r1.f67389x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r10.v
            java.lang.String r6 = "REVEAL_ANIMATION_ID"
            r7 = 3
            r8 = 1
            r9 = 2
            if (r5 == 0) goto L31
            if (r5 == r8) goto L2d
            if (r5 == r9) goto L29
            if (r5 != r7) goto L21
            nu3.c r2 = r10.u
            yhm.o.b(r11)
            goto L7f
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L29:
            yhm.o.b(r11)
            goto L68
        L2d:
            yhm.o.b(r11)
            goto L41
        L31:
            yhm.o.b(r11)
            r10.v = r8
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r11 = r2.f67362b
            java.lang.String r11 = r11.f66892b
            java.lang.Boolean r11 = r3.a(r11, r6)
            if (r11 != r4) goto L41
            goto L7d
        L41:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L5b
            yki.a r2 = r1.z
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$OfferContent r3 = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$OfferContent
            r11 = 0
            r3.<init>(r0, r11)
            com.revolut.kompot.navigable.TransitionAnimation$NONE r5 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r6 = 0
            r7 = 8
            r4 = 0
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto L9b
        L5b:
            g84.e r11 = r1.f67384q
            r10.v = r9
            g84.m r11 = (g84.m) r11
            java.lang.Object r11 = r11.h(r10)
            if (r11 != r4) goto L68
            goto L7d
        L68:
            nu3.c r11 = (nu3.c) r11
            r10.u = r11
            r10.v = r7
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r2.f67362b
            java.lang.String r2 = r2.f66892b
            kotlin.Unit r2 = r3.b(r2, r6)
            if (r2 != r4) goto L79
            goto L7b
        L79:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L7b:
            if (r2 != r4) goto L7e
        L7d:
            return r4
        L7e:
            r2 = r11
        L7f:
            yki.a r11 = r1.z
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$OfferContent r3 = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$OfferContent
            cv3.s r2 = r2.f219196c
            r3.<init>(r0, r2)
            com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation r5 = new com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation
            int r0 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_navBarLargeCentred
            int r2 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_recyclerView
            int r4 = com.revolut.feature.credit.application.plugins.impl.R$id.topItemOffer_twinVerticalButton
            r5.<init>(r0, r2, r4)
            r6 = 0
            r7 = 8
            r4 = 0
            r2 = r11
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
        L9b:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
