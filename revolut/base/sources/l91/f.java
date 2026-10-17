package l91;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public int A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f193017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f193018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f193019y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f193019y = obj2;
        this.A |= Integer.MIN_VALUE;
        return g.a(this.z, this);
    }
}
