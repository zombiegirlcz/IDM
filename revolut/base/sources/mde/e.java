package mde;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import f7d.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import org.jetbrains.annotations.NotNull;
import qua.p;
import tof.a3;
import xce.f;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();
    public static final String f = i.CATEGORY_TRANSFERS.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gde.d f204562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fde.a f204563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f204564c;
    public final lal.a d;
    public final f e;

    public e(gde.d helpCentreNaviCommandProvider, fde.a pocketFilterProvider, n sharedHelpWidgetsInteractor, lal.a sharedUpcomingTransactionTroubleshooterInteractor, f supportRepository) {
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        Intrinsics.checkNotNullParameter(pocketFilterProvider, "pocketFilterProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(sharedUpcomingTransactionTroubleshooterInteractor, "sharedUpcomingTransactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(supportRepository, "supportRepository");
        this.f204562a = helpCentreNaviCommandProvider;
        this.f204563b = pocketFilterProvider;
        this.f204564c = sharedHelpWidgetsInteractor;
        this.d = sharedUpcomingTransactionTroubleshooterInteractor;
        this.e = supportRepository;
    }

    public static BridgeDestination d(String str, NewTicketContext.Transaction transaction) {
        return new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, str != null ? new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.SomethingElse(str), new SharedFaqDestination.PassthroughData(transaction, false, false, 6), false, 12) : new SharedHelpDestination(new SharedHelpDestination.InputData((SharedHelpDestination.StartPoint) null, transaction, 3), 2), false, (Integer) null, 0, 61)));
    }

    public final boolean a(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return (parcel instanceof a3) || (parcel instanceof p);
    }

    public final BridgeDestination b(Object exchangeOrderPayload) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(exchangeOrderPayload, "exchangeOrderPayload");
        try {
            m.Companion companion = m.INSTANCE;
            objA = (ExchangeOrder) exchangeOrderPayload;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        ExchangeOrder exchangeOrder = (ExchangeOrder) objA;
        if (exchangeOrder == null) {
            return null;
        }
        return new BridgeDestination(new FeatureCommand(new OrderDetailsFeatureConfig(exchangeOrder)));
    }

    public final BridgeDestination c() {
        return new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), this.f204562a.a()));
    }

    public final ufm.b e(String transactionId, String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        NewTicketContext.Transaction transaction = new NewTicketContext.Transaction(transactionId);
        if (str == null) {
            str = f;
        }
        ufm.b bVarM = d0.m(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.SomethingElse(str), new SharedFaqDestination.PassthroughData(transaction, false, false, 6), false, 12));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r9, java.lang.Object r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mde.e.f(gim.c, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof mde.c
            if (r2 == 0) goto L17
            r2 = r1
            mde.c r2 = (mde.c) r2
            int r3 = r2.f204558w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f204558w = r3
            goto L1c
        L17:
            mde.c r2 = new mde.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f204558w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L45
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            fde.a r1 = r0.f204563b
            efm.r r1 = r1.b()
            r2.f204558w = r5
            java.lang.Object r1 = nim.a.c(r1, r2)
            if (r1 != r3) goto L45
            return r3
        L45:
            tof.i7 r1 = (tof.i7) r1
            com.revolut.feature.transactions.api.navigation.TransactionListDestination r2 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByTransactionsFilter r8 = new com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByTransactionsFilter
            tof.i7$c r3 = tof.i7.Companion
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            tof.y6 r4 = tof.y6.TRANSFER_CHARGEBACK_RVSL
            tof.y6 r5 = tof.y6.TRANSFER_CHARGEBACK
            tof.y6 r6 = tof.y6.TRANSFER
            tof.y6 r7 = tof.y6.TOPUP
            tof.y6[] r4 = new tof.y6[]{r4, r5, r6, r7}
            r3.getClass()
            tof.cc r3 = tof.i7.c.d(r4)
            tof.i7 r1 = tof.fc.a(r3, r1)
            r3 = 6
            r4 = 0
            r8.<init>(r1, r4, r4, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.support.impl.R$string.support_transfers_title
            r5 = 14
            r1.<init>(r3, r4, r4, r5)
            com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData r3 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData
            r18 = 0
            r19 = 64998(0xfde6, float:9.1082E-41)
            r5 = 0
            r6 = 0
            r7 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.revolut.feature.transactions.api.navigation.TransactionDestination$Troubleshooting r13 = com.revolut.feature.transactions.api.navigation.TransactionDestination.Troubleshooting.f91986a
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mde.e.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mde.d
            if (r0 == 0) goto L13
            r0 = r8
            mde.d r0 = (mde.d) r0
            int r1 = r0.f204561y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204561y = r1
            goto L18
        L13:
            mde.d r0 = new mde.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f204559w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204561y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.chat.domain.model.NewTicketContext$Transaction r7 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L80
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L47
            java.lang.String r8 = "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L47
            qua.p r7 = (qua.p) r7     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L47
            ibd.e r7 = r7.f249314a     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L47
            java.lang.String r7 = r7.f160150a     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L47
            goto L4f
        L45:
            r7 = move-exception
            goto L49
        L47:
            r7 = move-exception
            goto La1
        L49:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L4f:
            java.lang.Throwable r8 = yhm.m.a(r7)
            if (r8 == 0) goto L58
            hx7.e.n(r8)
        L58:
            boolean r8 = r7 instanceof yhm.n
            if (r8 == 0) goto L5d
            r7 = r4
        L5d:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L62
            return r4
        L62:
            com.revolut.chat.domain.model.NewTicketContext$Transaction r8 = new com.revolut.chat.domain.model.NewTicketContext$Transaction
            r8.<init>(r7)
            lde.n r2 = r6.f204564c
            boolean r2 = r2.c()
            r0.u = r7
            r0.v = r8
            r0.f204561y = r3
            lal.a r3 = r6.d
            java.lang.Object r0 = r3.D(r0, r7, r2)
            if (r0 != r1) goto L7c
            return r1
        L7c:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9c
            com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination r8 = new com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination
            com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$StartPoint$UpcomingTransactionTroubleshooter r1 = new com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$StartPoint$UpcomingTransactionTroubleshooter
            r1.<init>(r0)
            com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$PassthroughData r0 = new com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$PassthroughData
            r2 = 6
            r3 = 0
            r0.<init>(r7, r3, r3, r2)
            r7 = 12
            r8.<init>(r1, r0, r3, r7)
            goto La0
        L9c:
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = d(r4, r7)
        La0:
            return r8
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mde.e.h(java.lang.Object, gim.c):java.lang.Object");
    }

    public final BridgeDestination i(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof a3)) {
            if (parcel instanceof p) {
                return new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((p) parcel).f249314a.f160150a, false, null, 6)));
            }
            throw new IllegalArgumentException(p.a.p("Unsupported type of parcel: '", parcel.getClass().getSimpleName(), "'"));
        }
        a3 a3Var = (a3) parcel;
        return new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(qk.d.d(a3Var.f272581b, a3Var.f272579a, a3Var.f272584c), null, null, null, 126)));
    }
}
