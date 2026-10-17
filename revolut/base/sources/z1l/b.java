package z1l;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f318892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318893x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f318892w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318893x |= Integer.MIN_VALUE;
        return this.f318892w.b(null, null, this);
    }
}
