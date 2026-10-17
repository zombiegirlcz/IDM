package nra;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.push_to_card.api.PushToCardApi$Toggles;
import com.revolut.feature.push_to_card.api.navigation.PushToCardEditDetailsDestination;
import com.revolut.feature.push_to_card.api.navigation.PushToCardRecipientDetailsDestination;
import com.revolut.feature.push_to_card.api.navigation.PushToCardReviewControllerDescriptor;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferBridgeFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationDescriptor;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationDestination;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlow;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreen;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreen;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.flow.PushToCardTransferFlow;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import msa.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f218597a;

    public a(d successNavigator) {
        Intrinsics.checkNotNullParameter(successNavigator, "successNavigator");
        this.f218597a = successNavigator;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof CardOwnerCreationDescriptor) {
            CardOwnerCreationDescriptor cardOwnerCreationDescriptor = (CardOwnerCreationDescriptor) descriptor;
            return cardOwnerCreationDescriptor.a(new CardOwnerCreationFlow(cardOwnerCreationDescriptor.b()));
        }
        if (descriptor instanceof PushToCardReviewControllerDescriptor) {
            PushToCardReviewControllerDescriptor pushToCardReviewControllerDescriptor = (PushToCardReviewControllerDescriptor) descriptor;
            return pushToCardReviewControllerDescriptor.a(new PushToCardTransferReviewScreen(new PushToCardTransferReviewScreenContract$InputData(pushToCardReviewControllerDescriptor.getF81524a().getF81540b(), pushToCardReviewControllerDescriptor.getF81524a().getF81539a(), 12)));
        }
        if (!(descriptor instanceof cqa.a)) {
            return null;
        }
        cqa.a aVar = (cqa.a) descriptor;
        return aVar.a(new PushToCardTransferFlow(aVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return PushToCardApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PushToCardTransferBridgeFeatureConfig.BridgeDestination) {
            PushToCardTransferInputData inputData = ((PushToCardTransferBridgeFeatureConfig.BridgeDestination) destination).f81526a;
            PushToCardTransferFlow pushToCardTransferFlow = new PushToCardTransferFlow(inputData);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            return c.b(pushToCardTransferFlow, new qh6.b(this, inputData, 2));
        }
        if (destination instanceof PushToCardRecipientDetailsDestination) {
            return new CardRecipientDetailsScreen(new CardRecipientDetailsScreenContract$InputData(((PushToCardRecipientDetailsDestination) destination).getF81523a()));
        }
        if (destination instanceof PushToCardEditDetailsDestination) {
            return new EditCardOwnerScreen(new EditCardOwnerScreenContract$InputData(((PushToCardEditDetailsDestination) destination).getF81522a()));
        }
        if (destination instanceof CardOwnerCreationDestination) {
            return new CardOwnerCreationFlow(((CardOwnerCreationDestination) destination).getF81543a());
        }
        return null;
    }
}
