package j9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends gim.c {
    public PeerToPeerRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f172390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172391x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.f172390w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172391x |= Integer.MIN_VALUE;
        return this.f172390w.a(null, this);
    }
}
