package tjf;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f271658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.v = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f271658w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
