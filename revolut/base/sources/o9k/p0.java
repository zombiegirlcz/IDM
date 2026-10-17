package o9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.c {
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qua.p f223348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f223349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t0 f223350y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f223350y = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223349x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f223350y.e(null, null, null, this);
    }
}
