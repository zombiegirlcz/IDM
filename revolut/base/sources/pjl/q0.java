package pjl;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.v = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f236842w |= Integer.MIN_VALUE;
        return this.v.j(null, this);
    }
}
