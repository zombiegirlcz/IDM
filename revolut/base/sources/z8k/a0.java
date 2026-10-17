package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f320154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerRecipient f320155b;

    public a0(PeerToPeerTransferData transferData, PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter("PEER_TO_PEER_AMOUNT_PROCEED_CTA_BUTTON_TAG", "loadingButtonTag");
        this.f320154a = transferData;
        this.f320155b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f320154a, a0Var.f320154a) && Intrinsics.f(this.f320155b, a0Var.f320155b);
    }

    public final int hashCode() {
        return ((this.f320155b.hashCode() + (this.f320154a.hashCode() * 31)) * 31) + 964645694;
    }
}
