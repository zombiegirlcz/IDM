package q8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f243143a;

    public b(PeerToPeerTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f243143a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f243143a, ((b) obj2).f243143a);
    }

    public final int hashCode() {
        return this.f243143a.hashCode();
    }
}
