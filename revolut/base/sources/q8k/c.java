package q8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f243144a;

    public c(PeerToPeerTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f243144a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f243144a, ((c) obj2).f243144a);
    }

    public final int hashCode() {
        return this.f243144a.hashCode();
    }
}
