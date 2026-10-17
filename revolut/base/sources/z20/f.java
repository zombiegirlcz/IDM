package z20;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public u10.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f318912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f318912w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318913x |= Integer.MIN_VALUE;
        return this.f318912w.c(null, this);
    }
}
