package d38;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import x8h.y;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q28.a f110940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ugc.a f110941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f110942c;

    public j(q28.a widgetsEventDispatcher, nlh.b wealthTradeCommandProvider, ugc.a transactionsCommonNavigationProvider, y transactionsPagerInteractor) {
        Intrinsics.checkNotNullParameter(widgetsEventDispatcher, "widgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        Intrinsics.checkNotNullParameter(transactionsCommonNavigationProvider, "transactionsCommonNavigationProvider");
        Intrinsics.checkNotNullParameter(transactionsPagerInteractor, "transactionsPagerInteractor");
        this.f110940a = widgetsEventDispatcher;
        this.f110941b = transactionsCommonNavigationProvider;
        this.f110942c = transactionsPagerInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(d38.j r4, boolean r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof d38.i
            if (r0 == 0) goto L13
            r0 = r6
            d38.i r0 = (d38.i) r0
            int r1 = r0.f110939x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110939x = r1
            goto L18
        L13:
            d38.i r0 = new d38.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110939x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            d38.j r4 = r0.u
            yhm.o.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            if (r5 == 0) goto L4a
            r0.u = r4
            r0.f110939x = r3
            r5 = 0
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r6 = nlh.b.a(r5)
            if (r6 != r1) goto L42
            return r1
        L42:
            aii.u r6 = (aii.u) r6
            q28.a r4 = r4.f110940a
            r4.a(r6)
            goto L6f
        L4a:
            com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination r5 = new com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination
            com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData r6 = new com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$a r0 = com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter.INSTANCE
            r0.getClass()
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$InvestTransactionsFilterImpl r0 = com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter.Companion.f105346b
            com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions r1 = new com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions
            com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers$a r2 = com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers.INSTANCE
            r2.getClass()
            com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers r2 = new com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers
            r2.<init>(r3, r3, r3, r3)
            r1.<init>(r2)
            r6.<init>(r0, r1)
            r5.<init>(r6)
            q28.a r4 = r4.f110940a
            r4.a(r5)
        L6f:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d38.j.b(d38.j, boolean, gim.c):java.lang.Object");
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        return pd.b.n(p0.f264003c, new h(event, this, null));
    }
}
