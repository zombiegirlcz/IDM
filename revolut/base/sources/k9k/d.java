package k9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public PeerToPeerTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f182353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f182353w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182354x |= Integer.MIN_VALUE;
        return this.f182353w.b3(null, this);
    }
}
