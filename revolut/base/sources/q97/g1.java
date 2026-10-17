package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class g1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, gim.c cVar) {
        super(cVar);
        this.v = h1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243696w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
