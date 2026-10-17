package r3a;

import aii.e;
import aii.g;
import aii.u;
import c5a.n;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.WhoToTransferApi$Toggles;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.ContactsSyncOnboardingDescriptor$LaunchMode;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.OnboardingContactSyncFlow;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend.NewTransferFriendScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlow;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlow;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import g3a.c;
import java.util.List;
import k4a.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f251231a;

    public a(v newTransferScreenProvider) {
        Intrinsics.checkNotNullParameter(newTransferScreenProvider, "newTransferScreenProvider");
        this.f251231a = newTransferScreenProvider;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            return ((c) descriptor).a(new OnboardingContactSyncFlow(ContactsSyncOnboardingDescriptor$LaunchMode.Onboarding.f80048a));
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return WhoToTransferApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TransferDestination)) {
            if (!(destination instanceof RecipientSelectionFeatureConfig.BridgeDestination)) {
                return null;
            }
            RecipientSelectionFeatureConfig.BridgeDestination bridgeDestination = (RecipientSelectionFeatureConfig.BridgeDestination) destination;
            return new RecipientSelectionFlow(new RecipientSelectionFlowContract$InputData(bridgeDestination.getF80013a(), bridgeDestination.getF80014b()));
        }
        TransferDestination transferDestination = (TransferDestination) destination;
        if (transferDestination instanceof TransferDestination.ChatTransfer) {
            return ((TransferDestination.ChatTransfer) destination).getF80033a() ? new TabPaymentsFlow(new TabPaymentsFlowContract$InputData.ChatInputData(new ChatTransferScreenContract$InputData(n.EMBEDDED))) : new ChatTransferScreen(new ChatTransferScreenContract$InputData(n.FULLSCREEN));
        }
        if (transferDestination instanceof TransferDestination.NewTransfer) {
            TransferDestination.NewTransfer newTransfer = (TransferDestination.NewTransfer) destination;
            return v.a(this.f251231a, newTransfer.getF80037a(), newTransfer.getF80038b(), newTransfer.getF80039c(), 4);
        }
        if (transferDestination instanceof TransferDestination.NewTransferFriend) {
            return new NewTransferFriendScreen();
        }
        if (transferDestination instanceof TransferDestination.PaymentsSearch) {
            TransferDestination.PaymentsSearch paymentsSearch = (TransferDestination.PaymentsSearch) destination;
            return new PaymentsSearchScreen(new PaymentsSearchScreenContract$InputData(paymentsSearch.getF80043b(), paymentsSearch.getE(), paymentsSearch.getF80044c(), paymentsSearch.getF80042a(), paymentsSearch.getD()));
        }
        if (transferDestination instanceof TransferDestination.NotifyFriends) {
            return new OnboardingContactSyncFlow(new ContactsSyncOnboardingDescriptor$LaunchMode.PostOnboarding(((TransferDestination.NotifyFriends) destination).getF80041a()));
        }
        if (transferDestination.equals(TransferDestination.FindFriends.f80036a)) {
            return new TabPaymentsFlow(TabPaymentsFlowContract$InputData.FindFriendsInputData.f80181a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
