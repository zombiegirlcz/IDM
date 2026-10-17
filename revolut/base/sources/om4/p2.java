package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class p2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.v = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226662w |= Integer.MIN_VALUE;
        return this.v.G(null, this);
    }
}
