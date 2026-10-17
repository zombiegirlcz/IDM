package m6i;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.c {
    public wsg.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f203149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203150x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f203149w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203150x |= Integer.MIN_VALUE;
        return this.f203149w.c(null, this);
    }
}
