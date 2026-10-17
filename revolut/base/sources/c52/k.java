package c52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ TransferReviewInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransferTrustData f21382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferReviewInfo transferReviewInfo, r rVar, TransferTrustData transferTrustData, Continuation continuation) {
        super(1, continuation);
        this.v = transferReviewInfo;
        this.f21381w = rVar;
        this.f21382x = transferTrustData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f21381w, this.f21382x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r9 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r9 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r9 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r9 == r0) goto L39;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r9)
            goto L7e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L6a
        L22:
            yhm.o.b(r9)
            goto L56
        L26:
            yhm.o.b(r9)
            goto L42
        L2a:
            yhm.o.b(r9)
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r9 = r8.v
            boolean r1 = r9 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Send
            com.revolut.feature.transfer.models.transfer.TransferTrustData r6 = r8.f21382x
            c52.r r7 = r8.f21381w
            if (r1 == 0) goto L45
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Send r9 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Send) r9
            r8.u = r5
            java.lang.Object r9 = c52.r.d3(r7, r9, r6, r8)
            if (r9 != r0) goto L42
            goto L7d
        L42:
            g52.c r9 = (g52.c) r9
            return r9
        L45:
            boolean r1 = r9 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Request
            if (r1 == 0) goto L59
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Request r9 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Request) r9
            com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo r9 = r9.f62462a
            r8.u = r4
            java.lang.Object r9 = c52.r.c3(r7, r9, r8)
            if (r9 != r0) goto L56
            goto L7d
        L56:
            g52.c r9 = (g52.c) r9
            return r9
        L59:
            boolean r1 = r9 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.AcceptMoneyRequest
            if (r1 == 0) goto L6d
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$AcceptMoneyRequest r9 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.AcceptMoneyRequest) r9
            com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest r9 = r9.f62458a
            r8.u = r3
            java.lang.Object r9 = c52.r.Z2(r7, r9, r6, r8)
            if (r9 != r0) goto L6a
            goto L7d
        L6a:
            g52.c r9 = (g52.c) r9
            return r9
        L6d:
            boolean r1 = r9 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Draft
            if (r1 == 0) goto L81
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Draft r9 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Draft) r9
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest r9 = r9.f62460a
            r8.u = r2
            java.lang.Object r9 = c52.r.b3(r7, r9, r6, r8)
            if (r9 != r0) goto L7e
        L7d:
            return r0
        L7e:
            g52.c r9 = (g52.c) r9
            return r9
        L81:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
