package com.revolut.feature.security_hub.impl.ui.transactions_limits.flow;

import com.revolut.data.model.Data;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ gwc.i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gwc.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            gwc.i r0 = r8.v
            cli.h r1 = r0.f147315r
            java.lang.Object r2 = r8.u
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            java.lang.Object r9 = r2.getContent()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r2 = 0
            if (r9 == 0) goto L1b
            boolean r9 = r9.booleanValue()
            goto L1c
        L1b:
            r9 = r2
        L1c:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem$Personal r3 = com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem.Personal.f85757a
            if (r9 == 0) goto L2f
            r9 = 2
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem[] r9 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem[r9]
            r9[r2] = r3
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem$Joint r2 = com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem.Joint.f85756a
            r4 = 1
            r9[r4] = r2
            java.util.List r9 = zhm.v.k(r9)
            goto L33
        L2f:
            java.util.List r9 = zhm.u.c(r3)
        L33:
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState r2 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState) r2
            java.lang.String r2 = r2.f85753a
            if (r2 == 0) goto L6c
            r4 = r9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            r7 = r5
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem r7 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem) r7
            java.lang.String r7 = r7.getF103057c()
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L48
            goto L62
        L61:
            r5 = r6
        L62:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem r5 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem) r5
            if (r5 == 0) goto L6a
            java.lang.String r6 = r5.getF103057c()
        L6a:
            if (r6 != 0) goto L70
        L6c:
            java.lang.String r6 = r3.getF103057c()
        L70:
            amh.n r2 = new amh.n
            r3 = 5
            r2.<init>(r6, r9, r3)
            r0.H2(r1, r2)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
