package eg;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends gim.c {
    public z0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z0 f125503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125504x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.f125503w = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125504x |= Integer.MIN_VALUE;
        return z0.a(this.f125503w, this);
    }
}
