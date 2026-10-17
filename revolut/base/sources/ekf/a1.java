package ekf;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, gim.c cVar) {
        super(cVar);
        this.v = c1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127044w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
