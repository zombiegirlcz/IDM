package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class k1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.v = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226615w |= Integer.MIN_VALUE;
        return this.v.i(null, this, null);
    }
}
