package e9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import mga.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public a0 A;
    public boolean B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ g E;
    public int F;
    public nrf.c u;
    public PeerToPeerTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f124026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f124027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f124028y;
    public n9l.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, gim.c cVar) {
        super(cVar);
        this.E = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.g(null, null, this);
    }
}
