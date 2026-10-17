package ogf;

import aii.u;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlow;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreen;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreenContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreen;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$HomeTotalWealth2;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$ScheduledPaymentsPremiumSubscriptionsHubEntryPoint;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList;
import com.revolut.feature.transactions.api.navigation.RecurringTransfersDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.SimpleTransactionsDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(TransactionListApi$Toggles$ScheduledPaymentsPremiumSubscriptionsHubEntryPoint.f91963c, TransactionListApi$Toggles$UnifiedTransactionList.f91964c, TransactionListApi$Toggles$HomeTotalWealth2.f91962c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransactionListDestination) {
            TransactionListDestination.InputData inputData = ((TransactionListDestination) destination).f91991b;
            return new TransactionListFlow(new TransactionListFlowContract$InputData(inputData.f91992a, inputData.f91993b, inputData.f91994c, inputData.d, inputData.e, inputData.f, inputData.f91995g, inputData.f91996h, inputData.i, inputData.f91997j, inputData.k, inputData.f91998l, inputData.f91999m, inputData.f92000n, inputData.o, inputData.f92001p));
        }
        if (destination instanceof ScheduledPaymentsDestination) {
            return new ScheduledPaymentsScreen(((ScheduledPaymentsDestination) destination).f91969b);
        }
        if (destination instanceof RecurringTransfersDestination) {
            RecurringTransfersDestination.InputData inputData2 = ((RecurringTransfersDestination) destination).f91965b;
            String str = inputData2.f91968c;
            return new RecurringTransfersScreen(new RecurringTransfersScreenContract$InputData(inputData2.f91967b, inputData2.f91966a, str));
        }
        if (!(destination instanceof SimpleTransactionsDestination)) {
            return null;
        }
        SimpleTransactionsDestination simpleTransactionsDestination = (SimpleTransactionsDestination) destination;
        return new SimpleTransactionsScreen(new SimpleTransactionsScreenContract$InputData(simpleTransactionsDestination.f91977a, simpleTransactionsDestination.f91978b, simpleTransactionsDestination.f91979c, simpleTransactionsDestination.d, simpleTransactionsDestination.e, simpleTransactionsDestination.f));
    }
}
