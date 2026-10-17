package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0 l0Var, gim.c cVar) {
        super(cVar);
        this.v = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129195w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
