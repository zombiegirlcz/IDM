package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public PeerToPeerRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f13840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13841x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, gim.c cVar) {
        super(cVar);
        this.f13840w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13841x |= Integer.MIN_VALUE;
        return this.f13840w.a(null, this);
    }
}
