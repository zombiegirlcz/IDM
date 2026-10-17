package b4g;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12343w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.v = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12343w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
