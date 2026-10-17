package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 extends gim.c {
    public v20.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1 f310577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310578x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.f310577w = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310578x |= Integer.MIN_VALUE;
        return b1.d(this.f310577w, null, this);
    }
}
