package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f310547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.v = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f310547w |= Integer.MIN_VALUE;
        return b1.c(this.v, null, null, this);
    }
}
