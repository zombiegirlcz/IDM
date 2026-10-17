package k9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import q8k.q;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public q u;
    public PeerToPeerTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f182351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182352y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f182351x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182350w = obj2;
        this.f182352y |= Integer.MIN_VALUE;
        return this.f182351x.Z2(null, this);
    }
}
