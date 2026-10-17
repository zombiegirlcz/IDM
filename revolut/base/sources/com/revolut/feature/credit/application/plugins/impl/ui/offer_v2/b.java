package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ OfferV2FlowContract$OfferUpdateContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f68117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hu3.a f68118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ yf4.f f68119y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext, g gVar, hu3.a aVar, yf4.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = offerV2FlowContract$OfferUpdateContext;
        this.f68117w = gVar;
        this.f68118x = aVar;
        this.f68119y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f68117w, this.f68118x, this.f68119y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (((mf4.a0) r0).i(r9, r2, r8) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (((mf4.a0) r0).g(null, r9, r8) == r1) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r0 = r8.f68117w
            mf4.e r0 = r0.f68151q
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            yhm.o.b(r9)
            goto L84
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L58
        L21:
            yhm.o.b(r9)
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext r9 = r8.v
            boolean r2 = r9 instanceof com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext.Calculator
            yf4.f r6 = r8.f68119y
            hu3.a r7 = r8.f68118x
            if (r2 == 0) goto L62
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext$Calculator r9 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext.Calculator) r9
            java.lang.String r9 = r9.f68096a
            if (r9 != 0) goto L3a
            cv3.y r9 = cv3.y.EDIT_CALCULATOR
            java.lang.String r9 = r9.b()
        L3a:
            cv3.t r2 = cv3.u.Companion
            java.lang.String r3 = r7.f155551h
            int r4 = r6.f313175a
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r2.getClass()
            cv3.u r2 = cv3.t.b(r6, r3)
            r8.u = r5
            r3 = r0
            mf4.a0 r3 = (mf4.a0) r3
            java.lang.Object r9 = r3.i(r9, r2, r8)
            if (r9 != r1) goto L58
            goto L83
        L58:
            mf4.a0 r0 = (mf4.a0) r0
            vkm.z1 r9 = r0.e
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r9.k(r0)
            goto L93
        L62:
            boolean r9 = r9 instanceof com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext.LoanOffer
            if (r9 == 0) goto L96
            cv3.t r9 = cv3.u.Companion
            java.lang.String r2 = r7.f155551h
            int r5 = r6.f313175a
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r9.getClass()
            cv3.u r9 = cv3.t.b(r6, r2)
            r8.u = r4
            r2 = r0
            mf4.a0 r2 = (mf4.a0) r2
            java.io.Serializable r9 = r2.g(r3, r9, r8)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            mf4.a0 r0 = (mf4.a0) r0
            r0.f = r3
            r0.f204836g = r3
            r0.f204837h = r3
            vkm.z1 r9 = r0.d
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r9.k(r0)
        L93:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L96:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
