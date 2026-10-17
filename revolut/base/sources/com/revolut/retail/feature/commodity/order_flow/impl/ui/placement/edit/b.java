package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ j7j.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f99851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CommodityOrderEditScreenContract$ModalStep.SelectOrderType f99852x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j7j.i iVar, g gVar, CommodityOrderEditScreenContract$ModalStep.SelectOrderType selectOrderType, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f99851w = gVar;
        this.f99852x = selectOrderType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f99851w, this.f99852x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.N2(r4, r5.f99852x, r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r4.P2(r5, r1) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L10
        Lc:
            yhm.o.b(r6)
            goto L68
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            yhm.o.b(r6)
            j7j.i r6 = r5.v
            wd6.h r6 = r6.f171933a
            int[] r1 = d7j.g1.f112001a
            int r4 = r6.ordinal()
            r1 = r1[r4]
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r4 = r5.f99851w
            if (r1 == r3) goto L58
            if (r1 == r2) goto L4d
            r3 = 3
            if (r1 == r3) goto L4d
            r3 = 4
            if (r1 == r3) goto L4d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = " order type is not supported"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            hx7.e.n(r0)
            goto L68
        L4d:
            r5.u = r2
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$SelectOrderType r1 = r5.f99852x
            java.lang.Object r6 = com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.N2(r4, r1, r6, r5)
            if (r6 != r0) goto L68
            goto L67
        L58:
            d3i.k r1 = new d3i.k
            r2 = 21
            r1.<init>(r4, r6, r2)
            r5.u = r3
            java.lang.Object r6 = r4.P2(r5, r1)
            if (r6 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
