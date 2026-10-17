package s8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f261057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerRecipient f261058b;

    public b(PeerToPeerTransferData transferData, PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter("PEER_TO_PEER_REVIEW_PROCEED_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f261057a = transferData;
        this.f261058b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f261057a, bVar.f261057a) && Intrinsics.f(this.f261058b, bVar.f261058b);
    }

    public final int hashCode() {
        return ((this.f261058b.hashCode() + (this.f261057a.hashCode() * 31)) * 31) + 983485502;
    }
}
