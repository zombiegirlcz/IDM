package q8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f extends yji.n {
    public static /* synthetic */ Object b3(f fVar, hrf.f fVar2, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, hrf.c cVar, boolean z, gim.c cVar2, int i) {
        if ((i & 16) != 0) {
            z = false;
        }
        return fVar.Z2(peerToPeerTransferData, peerToPeerRecipient, cVar2, cVar, fVar2, z, (i & 32) == 0);
    }

    public abstract Object Z2(PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, gim.c cVar, hrf.c cVar2, hrf.f fVar, boolean z, boolean z3);
}
