package com.revolut.feature.freelancer.impl.ui.sales.refund.screen;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            yhm.o.b(r10)
            goto L7c
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            yhm.o.b(r10)
            r7 = r9
            goto L50
        L20:
            yhm.o.b(r10)
            com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData r10 = r2.f74216w
            boolean r1 = r10 instanceof com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData.Order
            r5 = 0
            if (r1 == 0) goto L53
            com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData$Order r10 = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData.Order) r10
            com.revolut.feature.freelancer.common.models.FreelancerOrder r10 = r10.f74208b
            r9.u = r4
            q27.b r1 = r2.f74215t
            r4 = r5
            i4b.e0 r5 = new i4b.e0
            r3 = 1
            r5.<init>(r1, r3)
            r1 = r4
            o27.t r4 = new o27.t
            r4.<init>()
            mh1.d r6 = new mh1.d
            r3 = 21
            r6.<init>(r2, r10, r1, r3)
            r8 = 1
            r3 = 0
            r7 = r9
            java.lang.Object r10 = n14.k.V(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L50
            goto L7b
        L50:
            nii.h r10 = (nii.h) r10
            goto L7e
        L53:
            r7 = r9
            r1 = r5
            boolean r4 = r10 instanceof com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData.OrderPayment
            if (r4 == 0) goto L8a
            com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData$OrderPayment r10 = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData.OrderPayment) r10
            com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment r10 = r10.f74210b
            r7.u = r3
            a3b.i r5 = new a3b.i
            r3 = 18
            r5.<init>(r2, r10, r3)
            o27.t r4 = new o27.t
            r3 = 0
            r4.<init>()
            nk9.l r6 = new nk9.l
            r3 = 17
            r6.<init>(r2, r10, r1, r3)
            r8 = 1
            r3 = 0
            java.lang.Object r10 = n14.k.V(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L7c
        L7b:
            return r0
        L7c:
            nii.h r10 = (nii.h) r10
        L7e:
            boolean r10 = r10 instanceof nii.g
            if (r10 == 0) goto L87
            o27.n r10 = o27.n.f221522a
            r2.C2(r10)
        L87:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L8a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.refund.screen.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
