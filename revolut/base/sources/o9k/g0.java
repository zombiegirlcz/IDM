package o9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.c {
    public int A;
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f223311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f223312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f223313y;
    public final /* synthetic */ j0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.z = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223313y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d3(null, null, false, false, this);
    }
}
