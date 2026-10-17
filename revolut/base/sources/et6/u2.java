package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends gim.c {
    public ir6.g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f129343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129344x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f129343w = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129344x |= Integer.MIN_VALUE;
        return this.f129343w.j(null, this);
    }
}
