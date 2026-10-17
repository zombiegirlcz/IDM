package z8k;

import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferData f320233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceData f320234b;

    public y(PeerToPeerTransferData transferData, ReferenceData referenceData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(referenceData, "referenceData");
        this.f320233a = transferData;
        this.f320234b = referenceData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f320233a, yVar.f320233a) && Intrinsics.f(this.f320234b, yVar.f320234b);
    }

    public final int hashCode() {
        return this.f320234b.hashCode() + (this.f320233a.hashCode() * 31);
    }
}
