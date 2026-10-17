package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public k5k.k u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f212631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f212632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f212633y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, gim.c cVar) {
        super(cVar);
        this.f212632x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212631w = obj2;
        this.f212633y |= Integer.MIN_VALUE;
        return this.f212632x.d3(null, this);
    }
}
