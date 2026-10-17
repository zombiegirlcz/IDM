package pkf;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f237097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.v = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f237097w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
