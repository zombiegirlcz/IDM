package swc;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.security_hub.limits.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f266188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.security_hub.limits.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f266188w |= Integer.MIN_VALUE;
        return this.v.O(null, this);
    }
}
