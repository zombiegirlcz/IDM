package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public PeerToPeerTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f13821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13822x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.f13821w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13822x |= Integer.MIN_VALUE;
        return this.f13821w.c3(null, this);
    }
}
