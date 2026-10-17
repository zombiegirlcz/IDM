package com.revolut.feature.payments.air.widget.impl.ui.flow;

import a2k.c;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource;
import com.revolut.feature.transfer.core.models.SourceAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q8k.r;
import xpa.g;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f79137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f79138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f79139c;

    public b(r peerToPeerLauncher, c bankTransferLauncher, g pushToCardLauncher) {
        Intrinsics.checkNotNullParameter(peerToPeerLauncher, "peerToPeerLauncher");
        Intrinsics.checkNotNullParameter(bankTransferLauncher, "bankTransferLauncher");
        Intrinsics.checkNotNullParameter(pushToCardLauncher, "pushToCardLauncher");
        this.f79137a = peerToPeerLauncher;
        this.f79138b = bankTransferLauncher;
        this.f79139c = pushToCardLauncher;
    }

    public static SourceAccount d(PaymentWidget paymentWidget) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            WidgetTransferSource widgetTransferSource = paymentWidget.f79074c.f79078b;
            if (widgetTransferSource == null) {
                objA = null;
            } else if (widgetTransferSource instanceof WidgetTransferSource.Pocket) {
                objA = new SourceAccount.Pocket(((WidgetTransferSource.Pocket) widgetTransferSource).f79100a, null, null, 6);
            } else if (widgetTransferSource instanceof WidgetTransferSource.SavingsAccount) {
                objA = new SourceAccount.SavingsAccount(AccountId.Personal.f51414a, ((WidgetTransferSource.SavingsAccount) widgetTransferSource).f79105a);
            } else {
                if (!(widgetTransferSource instanceof WidgetTransferSource.Portfolio)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((WidgetTransferSource.Portfolio) widgetTransferSource).f79102a;
                xi0.a aVar = xi0.b.Companion;
                String str2 = ((WidgetTransferSource.Portfolio) widgetTransferSource).f79103b;
                aVar.getClass();
                objA = new SourceAccount.TradingPortfolioAccount(str, xi0.a.a(str2));
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (SourceAccount) (objA instanceof n ? null : objA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r7, f5j.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof qo9.l
            if (r0 == 0) goto L13
            r0 = r9
            qo9.l r0 = (qo9.l) r0
            int r1 = r0.f248087w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248087w = r1
            goto L18
        L13:
            qo9.l r0 = new qo9.l
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248087w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            a2k.b r9 = new a2k.b
            com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails r2 = r7.f79074c
            dj0.d r2 = r2.f79079c
            com.revolut.feature.transfer.core.models.SourceAccount r4 = d(r7)
            a2k.a r5 = new a2k.a
            java.lang.String r7 = r7.f79072a
            r5.<init>(r7)
            r9.<init>(r8, r2, r4, r5)
            r0.f248087w = r3
            a2k.c r7 = r6.f79138b
            java.lang.Object r9 = r7.Z2(r9, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData r9 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData) r9
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer r7 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$BankTransfer r8 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$BankTransfer
            r8.<init>(r9)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.air.widget.impl.ui.flow.b.a(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget, f5j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r7, com.revolut.feature.push_to_card.api.data.CardOwner r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof qo9.m
            if (r0 == 0) goto L13
            r0 = r9
            qo9.m r0 = (qo9.m) r0
            int r1 = r0.f248088w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248088w = r1
            goto L18
        L13:
            qo9.m r0 = new qo9.m
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248088w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            xpa.f r9 = new xpa.f
            com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails r2 = r7.f79074c
            dj0.d r2 = r2.f79079c
            com.revolut.feature.transfer.core.models.SourceAccount r4 = d(r7)
            xpa.e r5 = new xpa.e
            java.lang.String r7 = r7.f79072a
            r5.<init>(r7)
            r9.<init>(r8, r2, r4, r5)
            r0.f248088w = r3
            xpa.g r7 = r6.f79139c
            java.lang.Object r9 = r7.Z2(r9, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData r9 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData) r9
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer r7 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$CardTransfer r8 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$CardTransfer
            r8.<init>(r9)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.air.widget.impl.ui.flow.b.b(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget, com.revolut.feature.push_to_card.api.data.CardOwner, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r7, zm3.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof qo9.n
            if (r0 == 0) goto L13
            r0 = r9
            qo9.n r0 = (qo9.n) r0
            int r1 = r0.f248089w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248089w = r1
            goto L18
        L13:
            qo9.n r0 = new qo9.n
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248089w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            q8k.q r9 = new q8k.q
            com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails r2 = r7.f79074c
            dj0.d r2 = r2.f79079c
            com.revolut.feature.transfer.core.models.SourceAccount r4 = d(r7)
            q8k.p r5 = new q8k.p
            java.lang.String r7 = r7.f79072a
            r5.<init>(r7)
            r9.<init>(r8, r2, r4, r5)
            r0.f248089w = r3
            q8k.r r7 = r6.f79137a
            java.lang.Object r9 = r7.Z2(r9, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData r9 = (com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData) r9
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer r7 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step$Transfer
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$PeerToPeer r8 = new com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$TransferInput$PeerToPeer
            r8.<init>(r9)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.air.widget.impl.ui.flow.b.c(com.revolut.feature.payments.air.widget.impl.model.PaymentWidget, zm3.a, gim.c):java.lang.Object");
    }
}
