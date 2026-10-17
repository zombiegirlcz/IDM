package com.revolut.feature.rev_points.impl.ui.transactions.flow;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            java.util.List r0 = (java.util.List) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.rev_points.impl.ui.transactions.flow.a r7 = com.revolut.feature.rev_points.impl.ui.transactions.flow.c.Companion
            r7.getClass()
            java.util.ArrayList r7 = com.revolut.feature.rev_points.impl.ui.transactions.flow.a.a(r0)
            com.revolut.feature.rev_points.impl.ui.transactions.flow.c r0 = r6.v
            cli.y r1 = r0.f83869s
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L1d
            goto L44
        L1d:
            java.util.Iterator r2 = r7.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage$Details r3 = (com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage.Details) r3
            com.revolut.feature.rev_points.models.RevPointsTransaction r3 = r3.f83861a
            java.lang.String r3 = r3.f84054a
            java.lang.Object r4 = r1.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            p0c.c r4 = (p0c.c) r4
            java.lang.String r4 = r4.f231497a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L21
            goto L8b
        L44:
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            p0c.c r2 = (p0c.c) r2
            java.util.List r2 = r2.f231498b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage r4 = (com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage) r4
            com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage$Details r4 = (com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage.Details) r4
            com.revolut.feature.rev_points.models.RevPointsTransaction r4 = r4.f83861a
            java.lang.String r4 = r4.f84054a
            java.lang.Object r5 = r1.f22677a
            vkm.j2 r5 = (vkm.j2) r5
            java.lang.Object r5 = r5.getValue()
            p0c.c r5 = (p0c.c) r5
            java.lang.String r5 = r5.f231497a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L56
            goto L7d
        L7c:
            r3 = 0
        L7d:
            com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage r3 = (com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage) r3
            if (r3 == 0) goto L8b
            java.util.List r2 = zhm.u.c(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r7 = zhm.d0.E0(r7, r2)
        L8b:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L9b
            jeg.i r2 = new jeg.i
            r3 = 20
            r2.<init>(r3, r7)
            r0.H2(r1, r2)
        L9b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.transactions.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
