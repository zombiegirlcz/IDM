package ffk;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f134855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f134855w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
