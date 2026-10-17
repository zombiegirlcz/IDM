package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot;

import dlk.r;
import dlk.t;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f103491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f103492x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, t tVar, Continuation continuation) {
        super(1, continuation);
        this.f103491w = eVar;
        this.f103492x = tVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f103491w, this.f103492x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.K2(r2, r9) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.J2(r2, r10, r9) == r0) goto L48;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
