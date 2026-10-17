package d9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$DisableReference;
import kotlin.jvm.internal.Intrinsics;
import z8k.t;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    public static i a(t domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f320213l.contains(PeerToPeerExtraConfiguration$DisableReference.f102268a)) {
            return i.ABSENT;
        }
        if (!domainState.f320214m) {
            return i.SIMPLE;
        }
        PeerToPeerTransferData peerToPeerTransferData = domainState.d;
        return (peerToPeerTransferData == null || !peerToPeerTransferData.f102258w) ? i.WITH_GIF : i.WITH_PERSONALISATION;
    }
}
