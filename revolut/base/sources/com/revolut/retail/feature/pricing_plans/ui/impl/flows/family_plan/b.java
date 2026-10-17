package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public d u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f102993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f102994x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.f102994x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f102994x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
    
        if (r2 == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0196, code lost:
    
        if (r3 != r4) goto L72;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
