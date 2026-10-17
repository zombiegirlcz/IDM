package o9k;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f223352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.v = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f223352w |= Integer.MIN_VALUE;
        return this.v.g(null, null, null, this);
    }
}
