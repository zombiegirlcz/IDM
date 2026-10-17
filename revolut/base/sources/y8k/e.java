package y8k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import hrf.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public final PeerToPeerTransferFlow a(zm3.a contact, m1l.a transferScheduleMode, TransferMoneyPocket transferMoneyPocket) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(transferScheduleMode, "transferScheduleMode");
        return new PeerToPeerTransferFlow(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(contact), f.OUTGOING, TransferFlowType.Default.f92257b, transferMoneyPocket == null ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket, new TransferScheduleData(0L, (jli.c) null, 7), transferScheduleMode, false, null, null, null, null, new LaunchMode.AsController(0), null, null, null, 126912));
    }
}
