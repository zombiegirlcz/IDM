package q8k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public interface g {
    static /* synthetic */ ufm.b a(g gVar, zm3.a aVar, dj0.d dVar, FlowExtras flowExtras, int i) {
        if ((i & 2) != 0) {
            dVar = null;
        }
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            flowExtras = null;
        }
        return ((y8k.b) gVar).d(aVar, dVar, z, flowExtras);
    }

    static ufm.b b(g gVar, zm3.a contact, m1l.a aVar, TransferFlowType transferFlowType, TransferMoneyPocket transferMoneyPocket, FlowExtras flowExtras, String str, ContactTargetAccount contactTargetAccount, int i) {
        m1l.a transferScheduleMode = (i & 2) != 0 ? m1l.a.SCHEDULE_ENABLED : aVar;
        TransferMoneyPocket transferMoneyPocket2 = (i & 8) != 0 ? null : transferMoneyPocket;
        FlowExtras flowExtras2 = (i & 16) != 0 ? null : flowExtras;
        String str2 = (i & 32) != 0 ? null : str;
        ContactTargetAccount contactTargetAccount2 = (i & 64) != 0 ? ContactTargetAccount.PersonalAccount.f102259a : contactTargetAccount;
        TransferAppSource transferAppSource = (i & 128) != 0 ? TransferAppSource.DEFAULT.f92298a : TransferAppSource.PAYMENT_LINK.f92299a;
        ((y8k.b) gVar).getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(transferScheduleMode, "transferScheduleMode");
        Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
        Intrinsics.checkNotNullParameter(contactTargetAccount2, "contactTargetAccount");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        if (transferMoneyPocket2 == null) {
            transferMoneyPocket2 = new TransferMoneyPocket(null, null, 3);
        }
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(transferScheduleMode, "transferScheduleMode");
        Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
        Intrinsics.checkNotNullParameter(transferMoneyPocket2, "transferMoneyPocket");
        Intrinsics.checkNotNullParameter(contactTargetAccount2, "contactTargetAccount");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        ufm.b bVarM = d0.m(new PeerToPeerTransferBridgeFeatureConfig(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(contact, contactTargetAccount2), hrf.f.OUTGOING, transferFlowType, transferMoneyPocket2, new TransferScheduleData(0L, (jli.c) null, 7), transferScheduleMode, false, null, str2, null, flowExtras2, null, null, null, transferAppSource, 62912)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
