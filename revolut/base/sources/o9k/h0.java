package o9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends gim.c {
    public PeerToPeerTransferData u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f223314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f223315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f223316y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.f223315x = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223314w = obj2;
        this.f223316y |= Integer.MIN_VALUE;
        return this.f223315x.e3(null, null, null, false, this);
    }
}
