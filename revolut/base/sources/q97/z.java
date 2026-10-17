package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243831w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243831w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
