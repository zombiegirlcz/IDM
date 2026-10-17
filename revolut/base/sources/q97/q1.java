package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class q1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243773w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
