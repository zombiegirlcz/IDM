package c52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferData f21388w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, TransferData transferData, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
        this.f21388w = transferData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, this.f21388w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r7)
            goto L44
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            yhm.o.b(r7)
            goto L34
        L1c:
            yhm.o.b(r7)
            c52.r r7 = r6.v
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData r1 = r7.f21392l
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r1 = r1.f62280a
            boolean r4 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Outgoing
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r5 = r6.f21388w
            if (r4 == 0) goto L37
            r6.u = r3
            java.lang.Object r7 = c52.r.f3(r7, r5, r6)
            if (r7 != r0) goto L34
            goto L43
        L34:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r7 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo) r7
            return r7
        L37:
            boolean r3 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Incoming
            if (r3 == 0) goto L47
            r6.u = r2
            java.lang.Object r7 = c52.r.e3(r7, r5, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r7 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo) r7
            return r7
        L47:
            boolean r7 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.AcceptMoneyRequest
            if (r7 == 0) goto L73
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$AcceptMoneyRequest r1 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.AcceptMoneyRequest) r1
            com.revolut.domain.models.moneyrequest.MoneyRequest r7 = r1.d
            com.revolut.domain.models.moneyrequest.MoneyRequestSettings r0 = r7.f60324q
            r2 = 0
            if (r0 == 0) goto L59
            dj0.d r0 = r5.getF72729b()
            goto L5a
        L59:
            r0 = r2
        L5a:
            com.revolut.domain.models.moneyrequest.MoneyRequestSettings r3 = r7.f60324q
            if (r3 == 0) goto L60
            java.lang.String r2 = r5.e
        L60:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$AcceptMoneyRequest r3 = new com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$AcceptMoneyRequest
            com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest r4 = new com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest
            com.revolut.feature.transfer.core.models.FundingSource r5 = r5.f62453a
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r5 = oc.c.u(r5)
            r4.<init>(r7, r5, r0, r2)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Outgoing r7 = r1.f62295c
            r3.<init>(r4, r7)
            return r3
        L73:
            boolean r7 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Draft
            if (r7 == 0) goto L96
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Draft r1 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Draft) r1
            dj0.d r7 = r5.getF72729b()
            java.lang.String r0 = r5.e
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Draft r2 = new com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Draft
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest r3 = new com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft r4 = r1.f62296c
            java.lang.String r4 = r4.f62193a
            com.revolut.feature.transfer.core.models.FundingSource r5 = r5.f62453a
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r5 = oc.c.u(r5)
            r3.<init>(r4, r5, r7, r0)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Outgoing r7 = r1.d
            r2.<init>(r3, r7)
            return r2
        L96:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
