package com.revolut.feature.apm.bizum.impl.ui.transfer.transfer;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ BizumTransferReviewInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f61636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransferTrustData f61637x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BizumTransferReviewInfo bizumTransferReviewInfo, b bVar, TransferTrustData transferTrustData, Continuation continuation) {
        super(1, continuation);
        this.v = bizumTransferReviewInfo;
        this.f61636w = bVar;
        this.f61637x = transferTrustData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f61636w, this.f61637x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r6 == r0) goto L21;
     */
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r6)
            goto L4a
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            yhm.o.b(r6)
            goto L36
        L1c:
            yhm.o.b(r6)
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r6 = r5.v
            boolean r1 = r6 instanceof com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Send
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b r4 = r5.f61636w
            if (r1 == 0) goto L39
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Send r6 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Send) r6
            com.revolut.feature.apm.core.models.bizum.BizumTransferInfo r6 = r6.f61635a
            r5.u = r3
            com.revolut.feature.transfer.models.transfer.TransferTrustData r1 = r5.f61637x
            java.lang.Object r6 = com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.b3(r4, r6, r1, r5)
            if (r6 != r0) goto L36
            goto L49
        L36:
            qt1.m r6 = (qt1.m) r6
            return r6
        L39:
            boolean r1 = r6 instanceof com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Request
            if (r1 == 0) goto L4d
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Request r6 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Request) r6
            com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo r6 = r6.f61634a
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.Z2(r4, r6, r5)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            qt1.m r6 = (qt1.m) r6
            return r6
        L4d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
