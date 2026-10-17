package s8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f261067a;

    public i(PeerToPeerTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f261067a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f261067a, ((i) obj2).f261067a);
    }

    public final int hashCode() {
        return this.f261067a.hashCode();
    }
}
