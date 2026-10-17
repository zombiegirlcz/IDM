package k9k;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import q8k.q;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public final /* synthetic */ b A;
    public int B;
    public q u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f182344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f182345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferMoneyPocket f182346y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
