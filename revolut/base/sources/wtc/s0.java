package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f299906w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.v = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f299906w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
