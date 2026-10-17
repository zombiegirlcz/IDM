package l3d;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.c {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f191913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191914y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.f191913x = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191912w = obj2;
        this.f191914y |= Integer.MIN_VALUE;
        return this.f191913x.a(this);
    }
}
