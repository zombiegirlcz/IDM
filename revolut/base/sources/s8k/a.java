package s8k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f261054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f261055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PeerToPeerTransferData f261056c;

    public a(PeerToPeerRecipient recipient, TransferFlowType flowType, PeerToPeerTransferData transferData) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f261054a = recipient;
        this.f261055b = flowType;
        this.f261056c = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f261054a, aVar.f261054a) && Intrinsics.f(this.f261055b, aVar.f261055b) && Intrinsics.f(this.f261056c, aVar.f261056c);
    }

    public final int hashCode() {
        return this.f261056c.hashCode() + com.revolut.data.database.models.openbanking.d.c(this.f261055b, this.f261054a.hashCode() * 31, 31);
    }
}
