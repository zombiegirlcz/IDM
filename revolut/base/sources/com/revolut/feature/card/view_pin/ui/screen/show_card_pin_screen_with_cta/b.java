package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e r0 = r7.v
            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
            if (r3 != r5) goto L12
            yhm.o.b(r8)
            goto L73
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            yhm.o.b(r8)
            cli.y r8 = r0.f64428r
            ysk.a r3 = new ysk.a
            r6 = 23
            r3.<init>(r6)
            r0.H2(r8, r3)
            rv2.a r8 = r0.f64426p
            java.lang.String r3 = r1.getF64420a()
            gwh.c r8 = (gwh.c) r8
            r8.getClass()
            java.lang.String r6 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            l93.f r8 = r8.f147329a
            ha3.x r8 = (ha3.x) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            z6l.s r8 = r8.f
            vkm.d r8 = r8.w(r3)
            kotlin.coroutines.g r3 = kotlin.coroutines.g.f186406a
            efm.r r8 = rd0.e.c(r8, r3)
            gvi.p r3 = new gvi.p
            r6 = 6
            r3.<init>(r6)
            efm.r r8 = nim.a.w(r8, r3)
            ypg.h r3 = new ypg.h
            r6 = 25
            r3.<init>(r6)
            efm.r r8 = m70.a.g(r8, r4, r3, r5)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r3 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            r7.u = r5
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r2) goto L73
            return r2
        L73:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r2 = r8.booleanValue()
            r3 = 0
            if (r2 == 0) goto L8f
            boolean r2 = r1 instanceof com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately
            if (r2 == 0) goto L83
            r4 = r1
            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData$ViewPinImmediately r4 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately) r4
        L83:
            if (r4 == 0) goto L8f
            boolean r1 = r4.f64422c
            if (r1 != r5) goto L8f
            yv2.g r8 = yv2.g.SHOW_NEW_PIN_WITHOUT_ACTIVATION_INSTRUCTIONS
            r0.I2(r3, r8)
            goto La6
        L8f:
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9f
            com.revolut.kompot.navigable.vc.modal.a r8 = r0.f64429s
            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$ModalStep$ShowOldOrNewPinDialog r0 = com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$ModalStep.ShowOldOrNewPinDialog.f64423a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r8, r0, r1)
            goto La6
        L9f:
            yv2.g r8 = yv2.g.SHOW_PREVIOUS_OR_SINGLE_PIN
            yv2.o r1 = com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e.Companion
            r0.I2(r3, r8)
        La6:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
