package yn3;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f315082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f315083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f315084y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f315083x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f315082w = obj2;
        this.f315084y |= Integer.MIN_VALUE;
        return this.f315083x.a(this);
    }
}
