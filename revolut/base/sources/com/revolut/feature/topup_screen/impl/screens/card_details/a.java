package com.revolut.feature.topup_screen.impl.screens.card_details;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (com.revolut.feature.topup_screen.impl.screens.card_details.b.I2(r0, r10) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.feature.topup_screen.impl.screens.card_details.b r0 = r10.v
            com.revolut.kompot.navigable.vc.modal.a r1 = r0.F
            cli.y r2 = r0.G
            n60.a r3 = r0.f91096w
            rpi.j r4 = r0.v
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r10.u
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L28
            if (r6 == r9) goto L24
            if (r6 != r8) goto L1c
            yhm.o.b(r11)
            goto L88
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            yhm.o.b(r11)
            goto L5c
        L28:
            yhm.o.b(r11)
            n8b.a r11 = r0.z
            o8b.c r11 = (o8b.c) r11
            boolean r11 = r11.g()
            if (r11 == 0) goto L4b
            r4.y()
            r3.R()
            uyh.t r11 = new uyh.t
            r3 = 20
            r11.<init>(r3)
            r0.H2(r2, r11)
            com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreenContract$ModalStep$IndiaAddCardConsent r11 = com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreenContract$ModalStep.IndiaAddCardConsent.f91089a
            oki.h.v2(r1, r11, r7)
            goto L88
        L4b:
            l61.a r11 = r0.A
            ang.b r11 = (ang.b) r11
            efm.d0 r11 = r11.a()
            r10.u = r9
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r5) goto L5c
            goto L87
        L5c:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)
            l71.d r11 = (l71.d) r11
            boolean r11 = l71.f.e(r11)
            if (r11 == 0) goto L7f
            r4.y()
            r3.R()
            uyh.t r11 = new uyh.t
            r3 = 20
            r11.<init>(r3)
            r0.H2(r2, r11)
            com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreenContract$ModalStep$IsraelAddCardConsent r11 = com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreenContract$ModalStep.IsraelAddCardConsent.f91090a
            oki.h.v2(r1, r11, r7)
            goto L88
        L7f:
            r10.u = r8
            java.lang.Object r11 = com.revolut.feature.topup_screen.impl.screens.card_details.b.I2(r0, r10)
            if (r11 != r5) goto L88
        L87:
            return r5
        L88:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.screens.card_details.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
