package u64;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f277472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f277473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f277472w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f277473x |= Integer.MIN_VALUE;
        return d.P2(this.f277472w, this);
    }
}
