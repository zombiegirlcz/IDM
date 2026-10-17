package fwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransactionsLimitsScreen transactionsLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen r7 = r6.v
            fwc.r r7 = r7.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.security_hub.impl.ui.transactions_limits.a r7 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) r7
            com.revolut.kompot.navigable.vc.modal.a r1 = r7.f85752w
            java.lang.String r2 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = r0.f53228a
            java.lang.Object r0 = r0.u
            int r3 = r2.hashCode()
            java.lang.String r4 = "null cannot be cast to non-null type com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit"
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r5 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            switch(r3) {
                case -1796231216: goto L77;
                case -776120299: goto L68;
                case -398167121: goto L51;
                case 116545664: goto L42;
                case 1024673278: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L7f
        L2b:
            java.lang.String r3 = "YEARLY_OUTBOUND_LIMIT_LIST_ID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            goto L7f
        L34:
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r0 = (com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit) r0
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$YearlyBalanceDialog r7 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$YearlyBalanceDialog
            r7.<init>(r0)
            oki.h.v2(r1, r7, r5)
            goto La0
        L42:
            java.lang.String r3 = "TRANSFER_DAILY_LIST_ITEM_ID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto L7f
        L4b:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$DailyLimitDialog r7 = com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step.DailyLimitDialog.f85739a
            oki.h.v2(r1, r7, r5)
            goto La0
        L51:
            java.lang.String r3 = "WALLET_BALANCE_LIMIT_LIST_ID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5a
            goto L7f
        L5a:
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r0 = (com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit) r0
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$WalletBalanceDialog r7 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$WalletBalanceDialog
            r7.<init>(r0)
            oki.h.v2(r1, r7, r5)
            goto La0
        L68:
            java.lang.String r3 = "MONETISATION_LIST_ITEM_ID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L71
            goto L7f
        L71:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$MonetisationDialog r7 = com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step.MonetisationDialog.f85742a
            oki.h.v2(r1, r7, r5)
            goto La0
        L77:
            java.lang.String r3 = "TRANSFER_WEEKLY_LIST_ITEM_ID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9b
        L7f:
            boolean r2 = r0 instanceof com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit
            if (r2 == 0) goto La0
            com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit r0 = (com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit) r0
            boolean r2 = r0.f85488t
            if (r2 != 0) goto L92
            com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog r2 = r0.f85487s
            if (r2 == 0) goto L8e
            goto L92
        L8e:
            r7.J2(r0)
            goto La0
        L92:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$ReadOnlyLimitDialog r7 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$ReadOnlyLimitDialog
            r7.<init>(r0)
            oki.h.v2(r1, r7, r5)
            goto La0
        L9b:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step$WeeklyLimitDialog r7 = com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step.WeeklyLimitDialog.f85745a
            oki.h.v2(r1, r7, r5)
        La0:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fwc.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
