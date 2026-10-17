package com.revolut.feature.card_design.impl.card_design.carousel;

import gim.i;
import hx2.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f64705w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f64705w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f64705w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 0
            hx2.h r3 = r6.f64705w
            com.revolut.feature.card_design.impl.card_design.carousel.e r4 = r6.v
            r5 = 1
            if (r1 == 0) goto L1a
            if (r1 != r5) goto L12
            yhm.o.b(r7)
            goto L4b
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            r6.u = r5
            gte.a r7 = r4.D
            com.revolut.feature.cards_core.api.CardsCoreApi$Toggles$LocalComboCardsImprovements r1 = com.revolut.feature.cards_core.api.CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c
            jte.d r7 = (jte.d) r7
            boolean r7 = r7.c(r1)
            if (r7 != 0) goto L2d
        L2b:
            r7 = r2
            goto L48
        L2d:
            int[] r7 = sx2.k.f266300a
            int r1 = r3.ordinal()
            r7 = r7[r1]
            if (r7 == r5) goto L42
            r1 = 2
            if (r7 == r1) goto L3b
            goto L2b
        L3b:
            h93.l0 r7 = h93.l0.BRAZIL_LOCAL
            java.lang.Object r7 = r4.K2(r7, r6)
            goto L48
        L42:
            h93.l0 r7 = h93.l0.BRAZIL_GLOBAL
            java.lang.Object r7 = r4.K2(r7, r6)
        L48:
            if (r7 != r0) goto L4b
            return r0
        L4b:
            h93.f0 r7 = (h93.f0) r7
            com.revolut.kompot.navigable.vc.modal.a r0 = r4.O
            com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$ModalStep$LocalGlobalCardInfo r1 = new com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$ModalStep$LocalGlobalCardInfo
            com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData r5 = r4.o
            c93.e r5 = r5.f64682b
            cli.y r4 = r4.N
            java.lang.Object r4 = r4.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            sx2.c0 r4 = (sx2.c0) r4
            boolean r4 = r4.o
            if (r7 == 0) goto L67
            java.lang.String r2 = r7.f150110a
        L67:
            r1.<init>(r5, r3, r4, r2)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r0, r1, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.carousel.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
