package com.revolut.feature.rev_points.impl.ui.transactions.list;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (nim.a.a(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (nim.a.a(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L56
        L19:
            yhm.o.b(r6)
            com.revolut.feature.rev_points.impl.ui.transactions.list.d r6 = r5.v
            ihm.f r1 = r6.f83895y
            com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData r4 = r6.o
            com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData$UiOverrides r4 = r4.f83877b
            boolean r4 = r4.f83883c
            if (r4 == 0) goto L47
            ldi.k r6 = r6.f83890r
            r6.getClass()
            java.lang.String r2 = "events"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object r6 = r6.f194145c
            java.lang.Object r6 = r6.getValue()
            lk0.d r6 = (lk0.d) r6
            efm.b r6 = r6.b(r1)
            r5.u = r3
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r0) goto L56
            goto L55
        L47:
            eub.l r6 = r6.f83889q
            efm.b r6 = r6.a(r1)
            r5.u = r2
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.transactions.list.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
