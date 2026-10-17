package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public PeerToPeerTransferData u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a f320168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320169y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f320168x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320167w = obj2;
        this.f320169y |= Integer.MIN_VALUE;
        return this.f320168x.b(null, null, null, null, false, this);
    }
}
