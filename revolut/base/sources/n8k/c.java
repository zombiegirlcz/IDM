package n8k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public PeerToPeerTransferDescriptor.Link u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f213498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213499x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f213498w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213499x |= Integer.MIN_VALUE;
        return this.f213498w.b3(null, this);
    }
}
