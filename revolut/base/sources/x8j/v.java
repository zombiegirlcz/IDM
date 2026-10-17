package x8j;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f303475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.v = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f303475w |= Integer.MIN_VALUE;
        return this.v.n3(this);
    }
}
