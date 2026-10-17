package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r12 != r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 3
            r3 = 2
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i r4 = r11.v
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r12)
            goto L6b
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            yhm.o.b(r12)
            goto L56
        L22:
            yhm.o.b(r12)
            goto L49
        L26:
            yhm.o.b(r12)
            egk.e r12 = r4.f67385r
            ggk.g0 r1 = ggk.g0.CREDIT_CARD
            w4l.j r7 = w4l.j.f294644c
            wik.t r12 = (wik.t) r12
            vkm.d r12 = r12.g(r1, r7)
            g5k.f r1 = new g5k.f
            r7 = 10
            r1.<init>(r7)
            jhi.b r12 = mo3.a.g(r12, r6, r1, r5)
            r11.u = r5
            java.lang.Object r12 = vkm.q.z(r12, r11)
            if (r12 != r0) goto L49
            goto L6a
        L49:
            g84.e r12 = r4.f67384q
            r11.u = r3
            g84.m r12 = (g84.m) r12
            java.lang.Object r12 = r12.h(r11)
            if (r12 != r0) goto L56
            goto L6a
        L56:
            nu3.c r12 = (nu3.c) r12
            ffk.t r1 = r4.f67386s
            nu3.f r12 = r12.f219195b
            java.lang.String r12 = r12.f219202a
            efm.d0 r12 = r1.f(r12)
            r11.u = r2
            java.lang.Object r12 = nim.a.b(r12, r11)
            if (r12 != r0) goto L6b
        L6a:
            return r0
        L6b:
            od0.i r12 = (od0.i) r12
            yki.a r5 = r4.z
            r0 = r6
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$PlanSelection r6 = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$PlanSelection
            java.lang.Object r12 = r12.f224257a
            hha.d r12 = (hha.d) r12
            if (r12 == 0) goto L7d
            hha.w0 r12 = hha.s.f(r12)
            goto L7e
        L7d:
            r12 = r0
        L7e:
            r6.<init>(r12)
            r9 = 0
            r10 = 14
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
