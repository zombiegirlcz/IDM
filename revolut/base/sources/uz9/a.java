package uz9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements kz9.a {
    public final KompotBridgeFeatureConfig a(ChatTransferRecipient recipient, TransferMoneyPocket transferMoneyPocket) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof ChatTransferRecipient.ContactRecipient) {
            return new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PeerToPeerChatDestination(((ChatTransferRecipient.ContactRecipient) recipient).f79720a, transferMoneyPocket, false), false, (Integer) null, 0, 61);
        }
        if ((recipient instanceof ChatTransferRecipient.BeneficiaryRecipient) || (recipient instanceof ChatTransferRecipient.CardRecipient) || (recipient instanceof ChatTransferRecipient.CharityRecipient) || (recipient instanceof ChatTransferRecipient.ApmTransferRecipient) || (recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) || (recipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient)) {
            return new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TransferOnlyChatDestination(recipient), false, (Integer) null, 0, 61);
        }
        throw new NoWhenBranchMatchedException();
    }
}
