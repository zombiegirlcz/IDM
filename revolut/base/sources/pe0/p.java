package pe0;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends gim.c {
    public f u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f235308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235309y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f235308x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235307w = obj2;
        this.f235309y |= Integer.MIN_VALUE;
        return q.c(this.f235308x, null, this);
    }
}
