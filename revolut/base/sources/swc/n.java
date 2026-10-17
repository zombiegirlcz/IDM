package swc;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public sri.m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.limits.a f266192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266193x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.security_hub.limits.a aVar, gim.c cVar) {
        super(cVar);
        this.f266192w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266193x |= Integer.MIN_VALUE;
        return com.revolut.feature.security_hub.limits.a.N(this.f266192w, null, null, this);
    }
}
