package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public wy3.i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MortgageOfferFlowContract$OfferUpdateContext f67990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f67991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f67992y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext, d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f67990w = mortgageOfferFlowContract$OfferUpdateContext;
        this.f67991x = dVar;
        this.f67992y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f67990w, this.f67991x, this.f67992y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r13 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r13 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
    
        if (r13 == r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
