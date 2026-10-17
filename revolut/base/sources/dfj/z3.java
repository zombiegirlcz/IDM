package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class z3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114170w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.v = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f114170w |= Integer.MIN_VALUE;
        return this.v.f(null, null, this);
    }
}
