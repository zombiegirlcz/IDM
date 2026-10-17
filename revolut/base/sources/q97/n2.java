package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class n2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243751w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
