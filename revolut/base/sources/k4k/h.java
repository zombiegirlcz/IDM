package k4k;

import com.revolut.core.model.account.AccountId;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i implements Function2 {
    public AccountId u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d2k.d f180938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c f180939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d2k.d dVar, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f180938w = dVar;
        this.f180939x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f180938w, this.f180939x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r10 == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c r0 = r9.f180939x
            b3a.a r1 = r0.f102098q
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData r2 = r0.o
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.v
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L26
            if (r4 == r6) goto L20
            if (r4 != r5) goto L18
            yhm.o.b(r10)
            goto L9b
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            com.revolut.core.model.account.AccountId r4 = r9.u
            yhm.o.b(r10)
            goto L4e
        L26:
            yhm.o.b(r10)
            d2k.d r10 = r9.f180938w
            qua.p r4 = r10.f110875b
            if (r4 == 0) goto Lac
            com.revolut.core.model.account.AccountId r8 = r10.d
            if (r8 != 0) goto L3b
            com.revolut.feature.transfer.core.models.TransferFlowType r8 = r2.getF101941b()
            com.revolut.core.model.account.AccountId r8 = r8.getF92255a()
        L3b:
            boolean r10 = r10.f110876c
            if (r10 == 0) goto L52
            r9.u = r8
            r9.v = r6
            r10 = r1
            v3a.b r10 = (v3a.b) r10
            java.lang.Object r10 = r10.c(r4, r8, r9)
            if (r10 != r3) goto L4d
            goto L9a
        L4d:
            r4 = r8
        L4e:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            r8 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            boolean r4 = r2 instanceof com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData.NewTransfer
            if (r4 == 0) goto L6c
            r4 = r2
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData$NewTransfer r4 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData.NewTransfer) r4
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData r4 = r4.f101944h
            m1l.a r4 = r4.e
            r4.getClass()
            m1l.a r6 = m1l.a.SCHEDULE_REQUIRED
            if (r4 != r6) goto L6c
            com.revolut.retail.core.flow.FlowExtras r2 = r2.d
            if (r2 == 0) goto L6c
            com.revolut.retail.core.navigation.NaviCommand r2 = r2.f98611a
            goto L6d
        L6c:
            r2 = r7
        L6d:
            if (r10 == 0) goto L70
            goto L9d
        L70:
            if (r2 == 0) goto L74
            r10 = r2
            goto L9d
        L74:
            r9.u = r7
            r9.v = r5
            v3a.b r1 = (v3a.b) r1
            r1.getClass()
            com.revolut.retail.core.navigation.FeatureCommand r10 = b3a.a.a(r1)
            com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination r1 = new com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination
            com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData r2 = new com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData
            com.revolut.feature.subscriptions.models.RecurringPaymentAccount r4 = com.revolut.feature.subscriptions.models.a.b(r8)
            r6 = 6
            r2.<init>(r4, r7, r6)
            r1.<init>(r2, r5)
            com.revolut.retail.core.navigation.FeatureCommand r1 = zh9.u0.f(r1)
            com.revolut.retail.core.navigation.CompositeCommand r10 = com.revolut.retail.core.navigation.a.c(r10, r1)
            if (r10 != r3) goto L9b
        L9a:
            return r3
        L9b:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
        L9d:
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r2 = 7
            com.revolut.retail.core.navigation.CompositeCommand r10 = r6.b.g(r7, r7, r7, r2, r10)
            r1.<init>(r10)
            aii.n r10 = r0.C1(r1)
            return r10
        Lac:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k4k.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
