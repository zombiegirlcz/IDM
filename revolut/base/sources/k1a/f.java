package k1a;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f180183w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f180183w |= Integer.MIN_VALUE;
        return this.v.g(null, this);
    }
}
