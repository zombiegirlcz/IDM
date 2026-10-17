package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.g;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ MortgageOfferFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f67988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f67989x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step, d dVar, g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = mortgageOfferFlowContract$Step;
        this.f67988w = dVar;
        this.f67989x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f67988w, this.f67989x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r0.d(r6, r5) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (kotlin.Unit.f186387a == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d r0 = r5.f67988w
            ce4.n r0 = r0.f67998q
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            yhm.o.b(r6)
            goto L43
        L1d:
            yhm.o.b(r6)
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step r6 = r5.v
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step$Calculator r6 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step.Calculator) r6
            boolean r2 = r6.f67975c
            if (r2 == 0) goto L33
            java.lang.String r6 = r6.f67973a
            r5.u = r4
            java.lang.Object r6 = r0.d(r6, r5)
            if (r6 != r1) goto L43
            goto L42
        L33:
            r5.u = r3
            wy3.j r6 = r0.d
            if (r6 == 0) goto L3b
            r0.f23376c = r6
        L3b:
            r6 = 0
            r0.d = r6
            kotlin.Unit r6 = kotlin.Unit.f186387a
            if (r6 != r1) goto L43
        L42:
            return r1
        L43:
            vkm.z1 r6 = r0.e
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r6.k(r0)
            oki.g r6 = r5.f67989x
            r6.pop()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
