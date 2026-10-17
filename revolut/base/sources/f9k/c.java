package f9k;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c f132981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f132982x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c cVar, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f132981w = cVar;
        this.f132982x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f132981w, this.f132982x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
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
            r2 = 1
            r3 = 0
            com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c r4 = r8.f132981w
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r9)
            goto L38
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            yhm.o.b(r9)
            boolean r9 = r8.v
            if (r9 == 0) goto L3b
            b3a.a r9 = r4.f102348p
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData r1 = r4.o
            com.revolut.feature.transfer.core.models.TransferFlowType r1 = r1.getF102292c()
            com.revolut.core.model.account.AccountId r1 = r1.getF92255a()
            r8.u = r2
            v3a.b r9 = (v3a.b) r9
            qua.p r2 = r8.f132982x
            java.lang.Object r9 = r9.c(r2, r1, r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            goto L3c
        L3b:
            r9 = r3
        L3c:
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData r0 = r4.o
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData r1 = r4.o
            m1l.a r0 = r0.getD()
            r0.getClass()
            m1l.a r2 = m1l.a.SCHEDULE_REQUIRED
            if (r0 != r2) goto L54
            com.revolut.retail.core.flow.FlowExtras r0 = r1.getF()
            if (r0 == 0) goto L54
            com.revolut.retail.core.navigation.NaviCommand r0 = r0.f98611a
            goto L55
        L54:
            r0 = r3
        L55:
            if (r9 != 0) goto L93
            if (r0 != 0) goto L92
            b3a.a r9 = r4.f102348p
            com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData r0 = new com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData
            com.revolut.feature.transfer.core.models.TransferFlowType r1 = r1.getF102292c()
            com.revolut.core.model.account.AccountId r1 = r1.getF92255a()
            com.revolut.feature.subscriptions.models.RecurringPaymentAccount r1 = com.revolut.feature.subscriptions.models.a.b(r1)
            o9k.i r2 = r4.f102349q
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData r2 = r2.f223317a
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r2 = r2.getF102290a()
            boolean r2 = t8k.a.e(r2)
            if (r2 == 0) goto L86
            com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData$InitialAction$ShowSuccessShotDialog r2 = new com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData$InitialAction$ShowSuccessShotDialog
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.payments.peer_to_peer.impl.R$string.junior_allowance_creation_success_tooltip_title
            r7 = 14
            r5.<init>(r6, r3, r3, r7)
            r2.<init>(r5)
            goto L87
        L86:
            r2 = r3
        L87:
            r5 = 2
            r0.<init>(r1, r2, r5)
            v3a.b r9 = (v3a.b) r9
            com.revolut.retail.core.navigation.CompositeCommand r9 = r9.d(r0)
            goto L93
        L92:
            r9 = r0
        L93:
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1 = 7
            com.revolut.retail.core.navigation.CompositeCommand r9 = r6.b.g(r3, r3, r3, r1, r9)
            r0.<init>(r9)
            aii.n r9 = r4.C1(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f9k.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
