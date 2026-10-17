package q6i;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.c {
    public l71.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f242619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242620x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.f242619w = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242620x |= Integer.MIN_VALUE;
        return this.f242619w.c(null, this);
    }
}
