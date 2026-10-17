package akf;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, gim.c cVar) {
        super(cVar);
        this.v = j1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f5844w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
