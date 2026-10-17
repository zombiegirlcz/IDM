package qa9;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f244004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f244005x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, gim.c cVar) {
        super(cVar);
        this.f244004w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f244005x |= Integer.MIN_VALUE;
        return this.f244004w.c(null, this);
    }
}
