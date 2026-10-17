package x8j;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f303477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f303478x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.f303477w = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f303478x |= Integer.MIN_VALUE;
        return g0.l3(this.f303477w, null, this);
    }
}
