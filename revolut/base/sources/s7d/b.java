package s7d;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f260669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260670x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f260669w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260670x |= Integer.MIN_VALUE;
        return this.f260669w.c(null, this);
    }
}
