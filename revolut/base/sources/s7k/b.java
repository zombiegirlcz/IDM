package s7k;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public j60.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f260859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260860x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f260859w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260860x |= Integer.MIN_VALUE;
        return this.f260859w.e(null, null, this);
    }
}
