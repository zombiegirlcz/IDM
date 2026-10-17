package m9d;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends gim.c {
    public s7d.e u;
    public v30.s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g1 f203742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203743y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(g1 g1Var, gim.c cVar) {
        super(cVar);
        this.f203742x = g1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203741w = obj2;
        this.f203743y |= Integer.MIN_VALUE;
        return g1.z2(this.f203742x, this);
    }
}
