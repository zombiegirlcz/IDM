package j9k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public int A;
    public PeerToPeerRecipient u;
    public TransferFlowType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hrf.f f172365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f61.a f172366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f172367y;
    public final /* synthetic */ p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, gim.c cVar) {
        super(cVar);
        this.z = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172367y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, this);
    }
}
