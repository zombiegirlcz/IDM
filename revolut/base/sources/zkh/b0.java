package zkh;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f322982w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, gim.c cVar) {
        super(cVar);
        this.v = d0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f322982w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
