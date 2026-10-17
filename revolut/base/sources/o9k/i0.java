package o9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.c {
    public final /* synthetic */ j0 A;
    public int B;
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qua.p f223318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q9k.b f223319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f223320y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.A = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return j0.b3(this.A, null, null, null, false, this);
    }
}
