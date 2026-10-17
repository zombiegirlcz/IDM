package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.c {
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, gim.c cVar) {
        super(cVar);
        this.f320204x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320203w = obj2;
        this.f320205y |= Integer.MIN_VALUE;
        return this.f320204x.D2(null, null, this);
    }
}
