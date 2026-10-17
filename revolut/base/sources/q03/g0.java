package q03;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.c {
    public i93.e u;
    public h93.f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f241067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f241069y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f241069y = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241068x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f241069y.f(null, false, this);
    }
}
