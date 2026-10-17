package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class z1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, gim.c cVar) {
        super(cVar);
        this.v = a2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243834w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
