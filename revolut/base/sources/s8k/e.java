package s8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferInputData f261061a;

    public e(PeerToPeerTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f261061a = inputData;
    }

    public final PeerToPeerTransferInputData b() {
        return this.f261061a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f261061a, ((e) obj2).f261061a);
    }

    public final int hashCode() {
        return this.f261061a.hashCode();
    }
}
