package sa6;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f261316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.v = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f261316w |= Integer.MIN_VALUE;
        return j0.a(this.v, null, this);
    }
}
