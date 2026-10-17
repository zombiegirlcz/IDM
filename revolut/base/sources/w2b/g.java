package w2b;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public String u;
    public bfl.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f294018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ toh.d f294019y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(toh.d dVar, gim.c cVar) {
        super(cVar);
        this.f294019y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f294018x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f294019y.c(null, null, null, null, this);
    }
}
