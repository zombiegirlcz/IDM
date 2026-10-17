package z8k;

import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StyleScreenInput f320229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerTransferData f320230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferenceData f320231c;
    public final boolean d;

    public x(StyleScreenInput styleScreenInput, PeerToPeerTransferData transferData, ReferenceData referenceData, boolean z) {
        Intrinsics.checkNotNullParameter(styleScreenInput, "styleScreenInput");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(referenceData, "referenceData");
        this.f320229a = styleScreenInput;
        this.f320230b = transferData;
        this.f320231c = referenceData;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f320229a, xVar.f320229a) && Intrinsics.f(this.f320230b, xVar.f320230b) && Intrinsics.f(this.f320231c, xVar.f320231c) && this.d == xVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f320231c.hashCode() + ((this.f320230b.hashCode() + (this.f320229a.hashCode() * 31)) * 31)) * 31);
    }
}
