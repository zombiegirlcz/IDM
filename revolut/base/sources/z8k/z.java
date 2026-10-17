package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f320236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerRecipient f320237b;

    public z(PeerToPeerTransferData transferData, PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f320236a = transferData;
        this.f320237b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f320236a, zVar.f320236a) && Intrinsics.f(this.f320237b, zVar.f320237b);
    }

    public final int hashCode() {
        return this.f320237b.hashCode() + (this.f320236a.hashCode() * 31);
    }
}
