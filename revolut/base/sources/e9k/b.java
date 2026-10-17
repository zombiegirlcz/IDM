package e9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import mga.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ g C;
    public int D;
    public PeerToPeerTransferData u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f124029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f124030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n9l.a f124031y;
    public a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, null, this);
    }
}
