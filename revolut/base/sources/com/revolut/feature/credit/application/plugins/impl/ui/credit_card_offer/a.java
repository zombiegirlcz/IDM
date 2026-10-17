package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ rv3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f67371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditCardOfferFlowContract$Step.PromoOffer f67372x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditCardOfferFlowContract$Step.PromoOffer promoOffer, i iVar, Continuation continuation, rv3.b bVar) {
        super(1, continuation);
        this.v = bVar;
        this.f67371w = iVar;
        this.f67372x = promoOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f67372x, this.f67371w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r6.Q2(r12, r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r6.Q2(r12, r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L11
        Lc:
            yhm.o.b(r12)
            goto L8e
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            yhm.o.b(r12)
            rv3.b r12 = r11.v
            boolean r1 = r12 instanceof rv3.c
            java.lang.String r4 = "Unexpected output data type: "
            if (r1 == 0) goto L75
            r1 = r12
            rv3.c r1 = (rv3.c) r1
            ht3.d r1 = r1.f257692a
            int[] r5 = g84.t.f141277a
            int r1 = r1.ordinal()
            r1 = r5[r1]
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step$PromoOffer r5 = r11.f67372x
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i r6 = r11.f67371w
            if (r1 == r3) goto L64
            if (r1 == r2) goto L53
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r5 = rd0.c.WARNING
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r7 = r4.concat(r12)
            r9 = 0
            r10 = 16
            java.lang.String r6 = "CreditCardOfferFlowModel"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            goto L8e
        L53:
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig$PromoOffer r12 = r5.f67369a
            nu3.i r12 = r12.f67359a
            com.revolut.feature.credit.application.plugins.api.models.action_button.Button r12 = r12.f219214g
            com.revolut.feature.credit.application.plugins.api.models.action_button.Action r12 = r12.f66299b
            r11.u = r2
            java.lang.Object r12 = r6.Q2(r12, r11)
            if (r12 != r0) goto L8e
            goto L74
        L64:
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig$PromoOffer r12 = r5.f67369a
            nu3.i r12 = r12.f67359a
            com.revolut.feature.credit.application.plugins.api.models.action_button.Button r12 = r12.f
            com.revolut.feature.credit.application.plugins.api.models.action_button.Action r12 = r12.f66299b
            r11.u = r3
            java.lang.Object r12 = r6.Q2(r12, r11)
            if (r12 != r0) goto L8e
        L74:
            return r0
        L75:
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r5 = rd0.c.WARNING
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r7 = r4.concat(r12)
            r9 = 0
            r10 = 16
            java.lang.String r6 = "CreditCardOfferFlowModel"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
        L8e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
