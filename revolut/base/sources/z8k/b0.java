package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f320158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerRecipient f320159b;

    public b0(PeerToPeerTransferData transferData, PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter("PEER_TO_PEER_AMOUNT_PROCEED_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f320158a = transferData;
        this.f320159b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f320158a, b0Var.f320158a) && Intrinsics.f(this.f320159b, b0Var.f320159b);
    }

    public final int hashCode() {
        return ((this.f320159b.hashCode() + (this.f320158a.hashCode() * 31)) * 31) + 964645694;
    }
}
