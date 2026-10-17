package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public String u;
    public cv3.u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, gim.c cVar) {
        super(cVar);
        this.f23365x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23364w = obj2;
        this.f23366y |= Integer.MIN_VALUE;
        return this.f23365x.i(null, null, this);
    }
}
