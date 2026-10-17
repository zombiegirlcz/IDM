package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public boolean A;
    public boolean B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ n E;
    public int F;
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hrf.c f13823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hrf.f f13824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PeerToPeerTransferData f13825y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, gim.c cVar) {
        super(cVar);
        this.E = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.d3(null, null, this, null, null, false, false);
    }
}
