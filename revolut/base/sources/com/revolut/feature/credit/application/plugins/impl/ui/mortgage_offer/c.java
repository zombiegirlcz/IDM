package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import cv3.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ MortgageOfferFlowContract$OfferUpdateContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f67993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f67994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f67995y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext, d dVar, u uVar, Function0 function0, Continuation continuation) {
        super(1, continuation);
        this.v = mortgageOfferFlowContract$OfferUpdateContext;
        this.f67993w = dVar;
        this.f67994x = uVar;
        this.f67995y = function0;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f67993w, this.f67994x, this.f67995y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r0.i(r7, r5, r6) == r1) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d r0 = r6.f67993w
            ce4.n r0 = r0.f67998q
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r7)
            goto L56
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L3d
        L20:
            yhm.o.b(r7)
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext$CommittedOffer r7 = com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext.CommittedOffer.f67972a
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext r2 = r6.v
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            cv3.u r5 = r6.f67994x
            if (r7 == 0) goto L45
            r6.u = r4
            java.io.Serializable r7 = r0.n(r5, r6)
            if (r7 != r1) goto L38
            goto L3a
        L38:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L3a:
            if (r7 != r1) goto L3d
            goto L55
        L3d:
            vkm.z1 r7 = r0.e
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r7.k(r0)
            goto L5d
        L45:
            boolean r7 = r2 instanceof com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext.Calculator
            if (r7 == 0) goto L65
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext$Calculator r2 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext.Calculator) r2
            java.lang.String r7 = r2.f67971a
            r6.u = r3
            java.lang.Object r7 = r0.i(r7, r5, r6)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            vkm.z1 r7 = r0.f
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r7.k(r0)
        L5d:
            kotlin.jvm.functions.Function0 r7 = r6.f67995y
            r7.invoke()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L65:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
