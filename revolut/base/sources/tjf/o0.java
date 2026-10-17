package tjf;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f271688w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.v = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f271688w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
