package i9e;

import com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles;
import com.revolut.feature.subscriptions.api.block_card_subscription.BlockCardSubscriptionFlowDestination;
import com.revolut.feature.subscriptions.api.block_future_payments.BlockFuturePaymentsFlowDestination;
import com.revolut.feature.subscriptions.api.edit_subscription_end_date.EditSubscriptionEndDateDestination;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionHistoryDestination;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlow;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlow;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyController;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateController;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlow;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryController;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerDestination;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f159666a = 0;

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c9e.b) {
            c9e.b bVar = (c9e.b) descriptor;
            return bVar.a(new EditSubscriptionFrequencyController(new EditSubscriptionFrequencyControllerContract$InputData(bVar.b())));
        }
        if (!(descriptor instanceof c9e.d)) {
            return null;
        }
        c9e.d dVar = (c9e.d) descriptor;
        return dVar.a(new SubscriptionsFlow(new SubscriptionsFlowDestination.InputData(new SubscriptionsFlowDestination.StartType.SubscriptionDetails(dVar.b(), dVar.c(), false))));
    }

    @Override // nte.a
    public final List e() {
        return SubscriptionsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SubscriptionsFlowDestination) {
            return new SubscriptionsFlow((SubscriptionsFlowDestination.InputData) ((SubscriptionsFlowDestination) destination).f98300a);
        }
        if (destination instanceof BlockCardSubscriptionFlowDestination) {
            return new BlockCardSubscriptionFlow(new BlockCardSubscriptionFlowContract$InputData(((BlockCardSubscriptionFlowDestination) destination).f89134b));
        }
        if (destination instanceof BlockFuturePaymentsFlowDestination) {
            BlockFuturePaymentsFlowDestination blockFuturePaymentsFlowDestination = (BlockFuturePaymentsFlowDestination) destination;
            return new BlockFuturePaymentsFlow(new BlockFuturePaymentsFlowContract$InputData(blockFuturePaymentsFlowDestination.f89136b, blockFuturePaymentsFlowDestination.f89137c));
        }
        if (destination instanceof PaymentBalancePickerDestination) {
            return gc0.c.b(new PaymentBalancePickerScreen(((PaymentBalancePickerDestination) destination).getF89219a()), new ask.a(7));
        }
        if (destination instanceof SubscriptionHistoryDestination) {
            SubscriptionHistoryDestination subscriptionHistoryDestination = (SubscriptionHistoryDestination) destination;
            return gc0.c.b(new SubscriptionHistoryController(new SubscriptionHistoryControllerContract$InputData(subscriptionHistoryDestination.getF89143a(), subscriptionHistoryDestination.getF89144b(), subscriptionHistoryDestination.getF89145c(), subscriptionHistoryDestination.getD())), new ask.a(8));
        }
        if (destination instanceof EditSubscriptionEndDateDestination) {
            return gc0.c.b(new EditSubscriptionEndDateController(new EditSubscriptionEndDateControllerContract$InputData(((EditSubscriptionEndDateDestination) destination).getF89140a())), new ask.a(9));
        }
        return null;
    }
}
