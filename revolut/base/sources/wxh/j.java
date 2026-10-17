package wxh;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.recurringbuys.api.navigation.RecurringPaymentsHistoryDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoOrderDetailsInputData.RecurringInputData f300992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mde.e f300993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xua.a f300994n;
    public final pu5.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nva.a f300995p;

    public j(CryptoOrderDetailsInputData.RecurringInputData inputData, mde.e sharedHelpDestinationProvider, xua.a recurringPaymentInteractor, pu5.e cryptoTransactionDetailsNavigator, nva.a filterBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(filterBuilder, "filterBuilder");
        this.f300992l = inputData;
        this.f300993m = sharedHelpDestinationProvider;
        this.f300994n = recurringPaymentInteractor;
        this.o = cryptoTransactionDetailsNavigator;
        this.f300995p = filterBuilder;
    }

    @Override // wxh.k
    public final void Z2(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        T2(new h(actionId, this, null), new yi5.b(27));
    }

    @Override // wxh.k
    public final void b3(CellDetailsChevronDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "CONTACT_US_ITEM_LIST_ID")) {
            T2(new i(model, this, null), new yi5.b(27));
        }
    }

    @Override // wxh.k
    public final void c3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "RECURRING_TRANSACTIONS_SEE_ALL_LIST_ID")) {
            CryptoOrderDetailsInputData.RecurringInputData recurringInputData = this.f300992l;
            A2(new RecurringPaymentsHistoryDestination(recurringInputData.f96658a, recurringInputData.e, recurringInputData.f));
        }
    }

    @Override // wxh.k
    public final void d3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
        if (a3Var == null) {
            return;
        }
        pu5.e eVar = this.o;
        if (!eVar.b(a3Var)) {
            A2(u0.c(new TransactionsFeatureConfig.Details(q.P(a3Var), null, null, null, 126)));
        } else {
            CryptoOrderDetailsInputData.RecurringInputData recurringInputData = this.f300992l;
            n.P2(this, o2(eVar.a(a3Var, this.f300995p.a(recurringInputData.f96658a, recurringInputData.e), "")), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
        }
    }
}
