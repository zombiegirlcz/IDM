package s8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f261059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerRecipient f261060b;

    public c(PeerToPeerTransferData transferData, PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter("PEER_TO_PEER_REVIEW_PROCEED_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f261059a = transferData;
        this.f261060b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261059a, cVar.f261059a) && Intrinsics.f(this.f261060b, cVar.f261060b);
    }

    public final int hashCode() {
        return ((this.f261060b.hashCode() + (this.f261059a.hashCode() * 31)) * 31) + 983485502;
    }
}
