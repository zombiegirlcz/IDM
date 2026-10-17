package ccb;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends gim.c {
    public g0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f23000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23001x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.f23000w = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23001x |= Integer.MIN_VALUE;
        return this.f23000w.a(null, this);
    }
}
