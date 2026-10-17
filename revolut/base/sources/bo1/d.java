package bo1;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yki.l;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ so1.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.flow.a f17268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f17269x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(so1.i iVar, com.revolut.feature.apm.bills.bpay.impl.flow.a aVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f17268w = aVar;
        this.f17269x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f17268w, this.f17269x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r9 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r9 == r2) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.apm.bills.bpay.impl.flow.a r0 = r8.f17268w
            b3a.a r1 = r0.f61200p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 0
            so1.i r5 = r8.v
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L24
            if (r3 == r7) goto L20
            if (r3 != r6) goto L18
            yhm.o.b(r9)
            goto L8c
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            yhm.o.b(r9)
            goto L54
        L24:
            yhm.o.b(r9)
            boolean r9 = r5 instanceof so1.g
            if (r9 == 0) goto L77
            r9 = r5
            so1.g r9 = (so1.g) r9
            ro1.c r9 = r9.f264677a
            boolean r3 = r9 instanceof ro1.d
            if (r3 == 0) goto L41
            com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData r9 = new com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData
            r2 = 7
            r9.<init>(r4, r4, r2)
            v3a.b r1 = (v3a.b) r1
            com.revolut.retail.core.navigation.CompositeCommand r9 = r1.d(r9)
            goto L8e
        L41:
            boolean r3 = r9 instanceof ro1.e
            if (r3 == 0) goto L71
            co9.b r3 = r0.f61202r
            ro1.e r9 = (ro1.e) r9
            java.lang.String r9 = r9.f255806c
            r8.u = r7
            java.lang.Object r9 = r3.a(r9, r8)
            if (r9 != r2) goto L54
            goto L8b
        L54:
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r9 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r9
            k71.c r2 = new k71.c
            so1.g r5 = (so1.g) r5
            ro1.c r3 = r5.f264677a
            ro1.e r3 = (ro1.e) r3
            java.lang.String r3 = r3.f255805b
            r2.<init>(r3)
            if (r9 == 0) goto L6a
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$PaymentCounterpartyRecipient r4 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$PaymentCounterpartyRecipient
            r4.<init>(r9)
        L6a:
            v3a.b r1 = (v3a.b) r1
            com.revolut.retail.core.navigation.CompositeCommand r9 = r1.e(r2, r4)
            goto L8e
        L71:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L77:
            boolean r9 = r5 instanceof so1.h
            if (r9 == 0) goto L9d
            so1.h r5 = (so1.h) r5
            qua.p r9 = r5.f264678a
            com.revolut.core.model.account.AccountId r3 = r5.f264679b
            r8.u = r6
            v3a.b r1 = (v3a.b) r1
            java.lang.Object r9 = r1.c(r9, r3, r8)
            if (r9 != r2) goto L8c
        L8b:
            return r2
        L8c:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
        L8e:
            yki.l r1 = r8.f17269x
            oki.h.D2(r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r9)
            aii.n r9 = r0.C1(r1)
            return r9
        L9d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bo1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
