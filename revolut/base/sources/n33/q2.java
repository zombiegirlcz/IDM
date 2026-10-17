package n33;

/* JADX INFO: loaded from: classes21.dex */
public final class q2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f211789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var, gim.c cVar) {
        super(cVar);
        this.v = r2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f211789w |= Integer.MIN_VALUE;
        return this.v.f(null, this);
    }
}
