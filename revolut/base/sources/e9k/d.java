package e9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public PeerToPeerTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f124034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f124035x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f124034w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f124035x |= Integer.MIN_VALUE;
        return this.f124034w.d(this);
    }
}
