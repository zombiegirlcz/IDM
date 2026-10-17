package g2e;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.v = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140004w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
