package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public String u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23357y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.f23356x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23355w = obj2;
        this.f23357y |= Integer.MIN_VALUE;
        return this.f23356x.f(null, this);
    }
}
